package org.jbpm.designer.ucd.errai;

import org.jboss.errai.bus.client.api.RoutingFlag;
import org.jboss.errai.bus.client.api.messaging.Message;
import org.jboss.errai.bus.client.api.messaging.MessageBus;
import org.jboss.errai.bus.client.api.messaging.RequestDispatcher;
import org.jboss.errai.common.client.api.ErrorCallback;
import org.jboss.errai.common.client.api.ResourceProvider;

import java.util.Map;


public final class FakeMessage implements Message {
    @Override
    public void unsetFlag(RoutingFlag flag) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Message toSubject(String subject) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message setResource(String key, Object res) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message setProvidedPart(Enum<?> part, ResourceProvider<?> provider) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message setProvidedPart(String part, ResourceProvider<?> provider) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message setParts(Map<String, Object> parts) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message setFlag(RoutingFlag flag) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message set(Enum<?> part, Object value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message set(String part, Object value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void sendNowWith(RequestDispatcher viaThis) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sendNowWith(MessageBus viaThis) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Enum<?> part) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(String part) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isFlagSet(RoutingFlag flag) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isCommited() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasResource(String key) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasPart(Enum<?> part) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasPart(String part) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public <T> T getValue(Class<T> type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getSubject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T getResource(Class<T> type, String key) {
        return (T) new FakeQueueSession();
    }

    @Override
    public Map<String, ResourceProvider<?>> getProvidedParts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Object> getParts() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ErrorCallback<Message> getErrorCallback() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getCommandType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T get(Class<T> type, Enum<?> part) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <T> T get(Class<T> type, String part) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message errorsCall(ErrorCallback callback) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message copyResource(String key, Message m) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message copy(Enum<?> part, Message m) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message copy(String part, Message m) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void commit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Message command(Enum<?> type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message command(String type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void addResources(Map<String, ?> resources) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Message addAllProvidedParts(Map<String, ResourceProvider<?>> provided) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Message addAllParts(Map<String, Object> parts) {
        // TODO Auto-generated method stub
        return null;
    }
}