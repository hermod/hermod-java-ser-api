package com.github.hermod.ser;

/**
 * <p>IMsgConvertor.</p>
 * 
 * Class to convert from Class, IMsg, byte[] to Class, IMsg, byte[].
 * If you want to have performance and customize destination Msg, use IMsgSerializer. 
 *
 * @author anavarro - Apr 7, 2013
 *
 */
@Deprecated
public interface IMsgConvertor {
    
    // Class <-> Msg
    /**
     * convertToClass.
     *
     * @param aDestClass
     * @param src
     * @return
     */
    <S> S convertToClass(final Class<S> aDestClass, final IMsg src);
    
    /**
     * convertToMsg.
     *
     * @param src
     * @return
     */
    IMsg convertToMsg(final Object src);

    // byte[] <-> Class 
    /**
     * convertToClass.
     *
     * @param aDestClass
     * @param src
     * @return
     */
    <S> S convertToClass(final Class<S> aDestClass, final byte... src);
    
    /**
     * convertToBytes.
     *
     * @param src
     * @return
     */
    byte[] convertToBytes(final Object src);
   
    // byte[] <-> Msg
    /**
     * convertToBytes.
     *
     * @param src
     * @return
     */
    byte[] convertToBytes(final IMsg src);
    
    /**
     * convertToMsg.
     *
     * @param src
     * @return
     */
    IMsg convertToMsg(final byte... src);
    
    
}
