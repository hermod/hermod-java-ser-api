package com.github.hermod.ser.descriptor;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>ReverseEnumMap. </p>
 * 
 * @author anavarro - Apr 3, 2013
 * @param <V>
 * 
 */
public final class ReverseEnumMap<V extends Enum<V> & IEnumIntConverter> {

    private final Map<Integer, V> map = new HashMap<Integer, V>();

    /**
     * Constructor.
     * 
     * @param valueType
     */

    public ReverseEnumMap(final Class<V> valueType) {
        for (final V v : valueType.getEnumConstants()) {
            this.map.put(v.convert(), v);
        }
    }

    /**
     * get.
     * 
     * @param num
     * 
     * @return V.
     */

    public V get(final Integer num) {
        return this.map.get(num);
    }
}
