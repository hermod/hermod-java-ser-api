package com.github.hermod.ser;


/**
 * <p>IBytesMsgConvertible. </p>
 *
 * @author anavarro - Apr 9, 2013
 *
 */
@Deprecated
//TODO Name IBytesMsgSerialiser?
public interface IBytesMsgConvertor {

    /**
     * convertToBytes.
     *
     * @param src
     * @return
     */
    // serialize
    byte[] convertToBytes(final IMsg srcMsg);
    
    /**
     * convertToMsg.
     *
     * @param src
     * @return
     */
    // deserialize
    void convertToMsg(final byte[] srcBytes, final int offset, final int length, IMsg destMsg);
    
    
    // Not yet need
    //void convertToMsg(final int offset, final int length, final byte[] srcBytes);
    
}
