package com.github.hermod.ser;

/**
 * <p>Serializable interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface Serializable {

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

}
