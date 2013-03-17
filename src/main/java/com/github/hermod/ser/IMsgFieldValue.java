package com.github.hermod.ser;

/**
 * <p>MsgFieldValue interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
@Deprecated
public interface IMsgFieldValue {

    /**
     * <p>byteAt.</p>
     *
     * @param index a int.
     * @return a byte.
     */
    byte byteAt(final int index);

    /**
     * <p>charAt.</p>
     *
     * @param index a int.
     * @return a char.
     */
    char charAt(final int index);

    /**
     * <p>size.</p>
     *
     * @return a int.
     */
    int size();

    /**
     * <p>isEmpty.</p>
     *
     * @return a boolean.
     */
    boolean isEmpty();

    /**
     * <p>writeTo.</p>
     *
     * @param dest an array of byte.
     * @param sourceOffset a int.
     * @param destOffset a int.
     */
    void writeTo(final byte[] dest, final int sourceOffset, final int destOffset);

    /**
     * <p>readFrom.</p>
     *
     * @param aBytes an array of byte.
     * @param aKeyOffset a int.
     * @param aValueOffset a int.
     * @param aValueSize a int.
     */
    void readFrom(final byte[] aBytes, final int aKeyOffset, final int aValueOffset, final int aValueSize);

}
