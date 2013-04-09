package com.github.hermod.ser;

/**
 * <p>IBytesConvertor. </p>
 *
 * @author anavarro - Apr 7, 2013
 * @param <S>
 * @param <T>
 *
 */
@Deprecated
public interface IBytesConvertor<T> {
    
    /**
     * convertTo.
     *
     * @param src
     * @return
     */
    T convertTo(final byte... src);
    
    /**
     * convertTo.
     *
     * @param src
     * @return
     */
    byte[] convertTo(final T src);
    
}
