package com.github.hermod.ser;

/**
 * <p>MsgIdentifiable.</p>
 * 
 * The interface MsgIdentifiable is used to retrieve the id of a msg.
 * 
 * @author anavarro - Apr 20, 2013
 * 
 */
public interface MsgIdentifiable {

    /**
     * <p>getMsgId.</p>
     * 
     * @return the msgId of the msg.
     */
    int getMsgId();

    /**
     * <p>setMsgId.</p>
     * 
     * @param aMsgId the id to set in the msg.
     */
    void setMsgId(final int aMsgId);

}
