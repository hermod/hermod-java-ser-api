package com.github.hermod.ser;

/**
 * <p>Serializable interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface ISerializable {

    /**
     * <p>readFrom.</p>
     *
     * @param bytes an array of byte.
     */
    void readFrom(final byte[] bytes);
    
    /**
     * <p>readFrom.</p>
     *
     * @param bytes an array of byte.
     * @param offset a int.
     * @param length a int.
     */
    void readFrom(final byte[] bytes, final int offset, final int length);
    

    /**
     * <p>writeTo.</p>
     *
     * @return an array of byte.
     */
    byte[] writeTo();

    /**
     * <p>writeTo.</p>
     *
     * @param bytes an array of byte.
     * @param offset a int.
     * @return a int.
     */
    int writeTo(byte[] bytes, final int offset);
    
    /**
     * <p>getSize.</p>
     *
     * @return the size of byte[] return by writeTo.
     */
    int getSize();

}
