package com.github.hermod.ser;

/**
 * <p>MsgFactory interface.</p>
 *
 * @author anavarro
 * @version $Id: $Id
 */
public interface IMsgFactory {

    /**
     * <p>create.</p>
     *
     * @return a {@link com.github.hermod.ser.IMsg} object.
     */
    IMsg create();
    
    /**
     * create.
     *
     * @param size of the byte array : Caution byte array size does not make sense (more linked to keyMax), we set keyMax = size / 4   
     * @return
     */
    IMsg create(final int size);

}
