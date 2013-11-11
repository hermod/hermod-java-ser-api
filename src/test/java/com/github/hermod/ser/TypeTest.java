package com.github.hermod.ser;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * <p>TypeTest. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public class TypeTest {

    /**
     * testValueOf.
     *
     */
    @Test
    public void testValueOf() {
        assertThat(Type.valueOf("INTEGER")).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.INTEGER_TYPE)).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.MSG_TYPE)).isEqualTo(Type.MSG);
        assertThat(Type.valueOf(Boolean.class)).isEqualTo(Type.BYTE);
        assertThat(Type.valueOf(Short.class)).isEqualTo(Type.SHORT);
        assertThat(Type.valueOf(Integer.class)).isEqualTo(Type.INT);
        assertThat(Type.valueOf(Long.class)).isEqualTo(Type.LONG);
        assertThat(Type.valueOf(Float.class)).isEqualTo(Type.FLOAT);
        assertThat(Type.valueOf(Double.class)).isEqualTo(Type.DOUBLE);
        //assertThat(Type.valueOf(BigDecimal.class)).isEqualTo(Type.DECIMAL);
        assertThat(Type.valueOf(String.class)).isEqualTo(Type.STRING_UTF8);
        assertThat(Type.valueOf(Msg.class)).isEqualTo(Type.MSG);
        assertThat(Type.valueOf(byte[].class)).isEqualTo(Type.ARRAY_FIXED_VALUE);
        assertThat(Type.valueOf(Long[].class)).isEqualTo(Type.ARRAY_VARIABLE_VALUE);
        try {
            assertThat(Type.valueOf((byte) 1));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
            
        } catch (final Exception e) { 
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
        
        try {
            assertThat(Type.valueOf(BigInteger.class));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (final Exception e) { 
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }
    
    
    /**
     * testGetShiftId.
     *
     */
    @Test
    public void testGetShiftId() {
        assertThat(Type.valueOf("INTEGER").getShiftId()).isEqualTo((byte)2);
    }
    

}
