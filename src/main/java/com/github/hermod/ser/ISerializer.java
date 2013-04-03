package com.github.hermod.ser;


/**
 * <p>ISerializer. </p>
 *
 * @author anavarro - Mar 9, 2013
 *
 */
public interface ISerializer {

    
    /**
     * <p>readFrom.</p>
     *
     * @param srcBytes an array of byte.
     * @param offset a int.
     * @param length a int.
     * @param destMsg the dest message.
     */
    void readFrom(final byte[] srcBytes, IMsg destMsg);
    
    
    //IMsg readFrom(final byte[] srcBytes, final Class clazz/* or factory*/);
    
    /**
     * <p>readFrom.</p>
     *
     * @param srcBytes an array of byte.
     * @param offset a int.
     * @param length a int.
     * @param destMsg the dest message.
     */
    void readFrom(final byte[] srcBytes, final int offset, final int length, IMsg destMsg);
    
    /**
     * <p>writeTo.</p>
     *
     * @param srcMsg the src message.
     * @return an array of byte.
     */
    byte[] writeTo(final IMsg srcMsg);

    /**
     * <p>writeTo.</p>
     *
     * @param srcMsg the src message.
     * @param destBytes an array of byte.
     * @param offset a int.
     * @return a int.
     */
    int writeTo(final IMsg srcMsg, byte[] destBytes, final int offset);
    
    /**
     * <p>getSize.</p>
     *
     * @return the size of byte[] return by writeTo.
     */
    int getSize(final IMsg msg);


}
