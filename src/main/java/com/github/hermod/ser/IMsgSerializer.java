package com.github.hermod.ser;


/**
 * <p>IMsgSerializer. </p>
 * 
 * This serializer is used for internal purpose.
 *
 * @author anavarro - Mar 9, 2013
 *
 */
public interface IMsgSerializer {

    /**
     * <p>deserialize.</p>
     *
     * @param srcBytes an array of byte.
     * @param offset a int.
     * @param length a int.
     * @param destMsg the dest message.
     */
    void deserialize(final byte[] srcBytes, final int offset, final int length, IMsg destMsg);
    
    /**
     * <p>serialize.</p>
     *
     * @param srcMsg the src message.
     * @return an array of byte.
     */
    //TODO check if it is really necessary
    //byte[] serialize(final IMsg srcMsg);

    /**
     * <p>serialize.</p>
     *
     * @param srcMsg the src message.
     * @param destBytes an array of byte.
     * @param offset a int.
     * @return a int.
     */
    int serialize(final IMsg srcMsg, byte[] destBytes, final int offset);
    
    /**
     * <p>getLength.</p>
     *
     * @return the length of byte[] return by writeTo.
     */
    int getLength(final IMsg msg);


}
