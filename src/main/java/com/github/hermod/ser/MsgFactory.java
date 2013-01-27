package com.github.hermod.ser;

/**
 * <p>MsgFactory interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface MsgFactory {

    /**
     * <p>create.</p>
     *
     * @return a {@link com.github.hermod.ser.Msg} object.
     */
    Msg create();
    
    /**
     * create.
     *
     * @param size of the byte array : Caution byte array size does not make sense (more linked to keyMax), we set keyMax = size / 4   
     * @return
     */
    Msg create(final int size);

}
