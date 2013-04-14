package com.github.hermod.ser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import org.junit.Test;

/**
 * <p>EPrecisionTest. </p>
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public class EPrecisionTest {

    /**
     * testCalculateIntegerMantissa.
     * 
     */
    @Test
    public void testCalculateIntegerMantissa() {
        assertThat(EPrecision.TENTHS.calculateIntegerMantissa(1.1)).isEqualTo(11);
        assertThat(EPrecision.THOUSANDTHS.calculateIntegerMantissa(1.122)).isEqualTo(1122);
        assertThat(EPrecision.HUNDREDS.calculateIntegerMantissa(100.122)).isEqualTo(1);

    }

    /**
     * testCalculateDouble.
     * 
     */
    @Test
    public void calculateDoubleFromIntegerMantissa() {
        assertThat(EPrecision.TENTHS.calculateDoubleFromIntegerMantissa(11)).isEqualTo(1.1);
        assertThat(EPrecision.THOUSANDTHS.calculateDoubleFromIntegerMantissa(1122)).isEqualTo(1.122);
        assertThat(EPrecision.HUNDREDS.calculateDoubleFromIntegerMantissa(1)).isEqualTo(100);

    }

    /**
     * testGetNbDigit.
     * 
     */
    @Test
    public void testGetNbDigit() {
        assertThat(EPrecision.TENTHS.getNbDigit()).isEqualTo(1);
    }

    /**
     * testGetPrecision.
     * 
     */
    @Test
    public void testGetPrecision() {
        assertThat(EPrecision.TENTHS.getPrecision()).isEqualTo(0.1);
    }

    /**
     * testValueOfInt.
     * 
     */
    @Test
    public void testValueOfInt() {
        assertThat(EPrecision.valueOf(1)).isEqualTo(EPrecision.TENTHS);
        assertThat(EPrecision.valueOf(-1)).isEqualTo(EPrecision.TENS);
        try {
            EPrecision.valueOf(Integer.MAX_VALUE);
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }

    }

    /**
     * testValueOfDouble.
     * 
     */
    @Test
    public void testValueOfDouble() {
        assertThat(EPrecision.valueOf(0.1)).isEqualTo(EPrecision.TENTHS);
        assertThat(EPrecision.valueOf(10.0)).isEqualTo(EPrecision.TENS);
        try {
            EPrecision.valueOf(Double.MAX_VALUE);
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }
    
    @Test
    public void testValueOf() {
        assertThat(EPrecision.valueOf("TENTHS")).isEqualTo(EPrecision.TENTHS);
    }

}
