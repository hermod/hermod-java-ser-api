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
        assertThat(EType.valueOf("INTEGER")).isEqualTo(EType.INTEGER);
        assertThat(EType.valueOf(Types.INTEGER_TYPE)).isEqualTo(EType.INTEGER);
        assertThat(EType.valueOf(Types.MSG_TYPE)).isEqualTo(EType.MSG);
        try {
            assertThat(EType.valueOf((byte) 1));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
            
        } catch (final Exception e) { 
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

}
