package com.github.hermod.ser;

/**
 * <p>IMsgFactory. </p>
 *
 * @author anavarro - Mar 24, 2013
 *
 */
interface IMsgFactory {

    /**
     * create.
     *
     * @return
     */
    IMsg create();
    
    /**
     * create.
     *
     * @param size
     * @return
     */
    IMsg create(final int size);
}
