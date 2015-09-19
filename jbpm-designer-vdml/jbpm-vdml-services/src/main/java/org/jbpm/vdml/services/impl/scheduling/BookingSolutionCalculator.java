package org.jbpm.vdml.services.impl.scheduling;

import org.joda.time.Duration;
import org.optaplanner.core.api.score.buildin.simple.SimpleScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

public class BookingSolutionCalculator implements EasyScoreCalculator<BookingSolution> {
    private final double millisPerMinute=1000*60d;

    @Override
    public SimpleScore calculateScore(BookingSolution bookingSolution) {
        int totalScore=0;
        for (Booking booking : bookingSolution.getBookings()) {
            if(booking.getStartScheduleSlot()==null){
                return SimpleScore.valueOf(-1);
            }
            ScheduleSlot currentSlot = booking.getStartScheduleSlot();
            long remainder=booking.getDurationInMillis();
            long totalIdleMinutes=0;
            long minutesFromPreferredStart=Math.round(new Duration(booking.getNotBefore(),currentSlot.getFrom()).getMillis()/millisPerMinute);
            while(currentSlot.getNext()!=null && remainder>0){
                Duration interval = new Duration(currentSlot.getTo(), currentSlot.getNext().getFrom());
                totalIdleMinutes+=Math.round(interval.getMillis()/millisPerMinute);
                remainder-=interval.getMillis();
                if(totalIdleMinutes>120){
                    return SimpleScore.valueOf(-1);
                }
                currentSlot=currentSlot.getNext();
            }
            totalScore+=totalIdleMinutes*minutesFromPreferredStart;
        }
        return SimpleScore.valueOf((int)Math.round (1d/totalScore*100000));
    }
}
