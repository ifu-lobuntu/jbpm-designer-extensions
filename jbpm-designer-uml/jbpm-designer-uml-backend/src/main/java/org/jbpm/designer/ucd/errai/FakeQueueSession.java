package org.jbpm.designer.ucd.errai;

import org.jboss.errai.bus.client.api.QueueSession;
import org.jboss.errai.bus.client.api.SessionEndListener;

import java.util.Collection;


public final class FakeQueueSession implements QueueSession {
    @Override
    public void setAttribute(String attribute, Object value) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Object removeAttribute(String attribute) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isValid() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAttribute(String attribute) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String getSessionId() {
        return "!@43123412341";
    }

    @Override
    public String getParentSessionId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Collection<String> getAttributeNames() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T getAttribute(Class<T> type, String attribute) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean endSession() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void addSessionEndListener(SessionEndListener listener) {
        // TODO Auto-generated method stub
        
    }
}