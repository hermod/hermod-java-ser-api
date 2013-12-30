package com.github.hermod.ser;

/**
 * <p>MsgIdentifiable.</p>
 *
 * Interface MsgIdentifiable is used to retrieve the id of a msg.
 *
 * @author anavarro - Apr 20, 2013
 *
 */
public interface MsgIdentifiable {

    /**
     * getMsgId.
     *
     * @return msgId of the msg.
     */
    int getMsgId();

    /**
     * setMsgId.
     *
     * @param aMsgId the id of the msg.
     */
    void setMsgId(final int aMsgId);

}
