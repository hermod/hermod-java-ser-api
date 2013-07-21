package com.github.hermod.ser;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import org.junit.Test;

/**
 * <p>ETypeTest. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public class ETypeTest {

    /**
     * testValueOf.
     *
     */
    @Test
    public void testValueOf() {
        assertThat(Type.valueOf("INTEGER")).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.INTEGER_TYPE)).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.MSG_TYPE)).isEqualTo(Type.MSG);
        try {
            assertThat(Type.valueOf((byte) 1));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
            
        } catch (final Exception e) { 
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

}
