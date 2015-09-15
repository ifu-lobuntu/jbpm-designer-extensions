package org.jbpm.vdml.services.impl.model.runtime;

public enum TimeCycle {
    ANNUAL(ScheduleTimeMeasure.DAY_OF_YEAR), MONTHLY(ScheduleTimeMeasure.DAY_OF_MONTH), WEEKLY(ScheduleTimeMeasure.DAY_OF_WEEK),
    DAILY(ScheduleTimeMeasure.MINUTE_OF_DAY), HOURLY(ScheduleTimeMeasure.MINUTE_OF_HOUR),ONCE_OFF(ScheduleTimeMeasure.ABSOLUTE_TIME);
    private final ScheduleTimeMeasure measure;

    private TimeCycle(ScheduleTimeMeasure m) {
        this.measure = m;
    }

    public ScheduleTimeMeasure getMeasure() {
        return measure;
    }
}
