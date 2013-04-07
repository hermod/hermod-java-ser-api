package com.github.hermod.ser;

/**
 * <p>IMsgConvertor. </p>
 *
 * @author anavarro - Apr 7, 2013
 *
 */
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
    <S> IMsg convertToMsg(final S src);

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
    <S> byte[] convertToBytes(final S src);
   
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
