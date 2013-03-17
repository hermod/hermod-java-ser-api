package com.github.hermod.ser;

/**
 * <p>MsgIterator interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface IMsgIterator {

    /**
     * <p>nextKey.</p>
     *
     * @return a int.
     */
    int nextKey();

    /**
     * <p>getCurrentKey.</p>
     *
     * @return a int.
     */
    int getCurrentKey();

    /**
     * <p>hasNext.</p>
     *
     * @return a boolean.
     */
    boolean hasNext();

    /**
     * <p>getCurrentType.</p>
     *
     * @return a byte.
     */
    byte getCurrentType();

    /**
     * <p>get.</p>
     *
     * @return a {@link java.lang.Object} object.
     */
    Object get();

    /**
     * <p>getAsByte.</p>
     *
     * @return a byte.
     */
    byte getAsByte();

    /**
     * <p>getAsInt.</p>
     *
     * @return a int.
     */
    int getAsInt();

    /**
     * <p>getAsShort.</p>
     *
     * @return a short.
     */
    short getAsShort();

    /**
     * <p>getAsLong.</p>
     *
     * @return a long.
     */
    long getAsLong();

    /**
     * <p>getAsFloat.</p>
     *
     * @return a float.
     */
    float getAsFloat();

    /**
     * <p>getAsDouble.</p>
     *
     * @return a double.
     */
    double getAsDouble();

    /**
     * <p>getAsString.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    String getAsString();

    /**
     * <p>getAsMsg.</p>
     *
     * @return a {@link com.github.hermod.ser.IMsg} object.
     */
    IMsg getAsMsg();

}
