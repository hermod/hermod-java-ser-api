package com.github.hermod.ser;


/**
 * <p>ISerializer. </p>
 *
 * @author anavarro - Mar 9, 2013
 *
 */
public interface ISerializer2<T> /* Int/Impl */ {

    //TODO
    // getInterfaceClass() //A
    // getImplementationClass() //I
    
    //todo
    
    /**
     * <p>readFrom.</p>
     *
     * @param srcBytes an array of byte.
     * @param offset a int.
     * @param length a int.
     * @param destMsg the dest message.
     */
    void readFrom(final byte[] srcBytes, T destObj);
    
    //TODO
    //A readFrom(final byte[] srcBytes);
    
    /**
     * <p>readFrom.</p>
     *
     * @param srcBytes an array of byte.
     * @param offset a int.
     * @param length a int.
     * @param destMsg the dest message.
     */
    void readFrom(final byte[] srcBytes, final int offset, final int length, T destObj);
    
    /**
     * <p>writeTo.</p>
     *
     * @param srcMsg the src message.
     * @return an array of byte.
     */
    byte[] writeTo(final T srcObj);

    /**
     * <p>writeTo.</p>
     *
     * @param srcMsg the src message.
     * @param destBytes an array of byte.
     * @param offset a int.
     * @return a int.
     */
    int writeTo(final T srcObj, byte[] destBytes, final int offset);
    
    /**
     * <p>getLength.</p>
     *
     * @return the length of byte[] return by writeTo.
     */
    int getLength(final T obj);


}
