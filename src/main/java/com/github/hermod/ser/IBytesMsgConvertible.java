package com.github.hermod.ser;


/**
 * <p>IBytesMsgConvertible. </p>
 *
 * @author anavarro - Apr 9, 2013
 *
 */
@Deprecated
//TODO Name IBytesMsgSerialisable?
public interface IBytesMsgConvertible {

    /**
     * convertToBytes.
     *
     * @param src
     * @return
     */
    // serialize
    byte[] convertToBytes();
    
    /**
     * convertToMsg.
     *
     * @param src
     * @return
     */
    // deserialize
    void convertToMsg(final byte... srcBytes);
    
    
    // Not yet need
    //void convertToMsg(final int offset, final int length, final byte[] srcBytes);
    
}
