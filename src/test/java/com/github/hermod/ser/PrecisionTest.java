package com.github.hermod.ser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import org.junit.Test;

/**
 * <p>PrecisionTest. </p>
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public class PrecisionTest {

    /**
     * testCalculateIntegerMantissa.
     * 
     */
    @Test
    public void testCalculateIntegerMantissa() {
        assertThat((int) Precision.TENTHS.calculateIntegerMantissa(1.1)).isEqualTo(11);
        assertThat((int) Precision.THOUSANDTHS.calculateIntegerMantissa(1.122)).isEqualTo(1122);
        assertThat((int) Precision.HUNDREDS.calculateIntegerMantissa(100.122)).isEqualTo(1);
        assertThat(Precision.HUNDREDS.calculateIntegerMantissa(Long.MAX_VALUE)).isNaN();
        assertThat(Precision.HUNDREDS.calculateIntegerMantissa(Long.MIN_VALUE)).isNaN();
    }

    /**
     * testCalculateDouble.
     * 
     */
    @Test
    public void calculateDoubleFromIntegerMantissa() {
        assertThat(Precision.TENTHS.calculateDoubleFromIntegerMantissa(11)).isEqualTo(1.1);
        assertThat(Precision.THOUSANDTHS.calculateDoubleFromIntegerMantissa(1122)).isEqualTo(1.122);
        assertThat(Precision.HUNDREDS.calculateDoubleFromIntegerMantissa(1)).isEqualTo(100);

    }

    /**
     * testGetNbDigit.
     * 
     */
    @Test
    public void testGetNbDigit() {
        assertThat(Precision.TENTHS.getNbDigit()).isEqualTo(1);
    }

    /**
     * testGetPrecision.
     * 
     */
    @Test
    public void testGetPrecision() {
        assertThat(Precision.TENTHS.getPrecision()).isEqualTo(0.1);
    }

    /**
     * testValueOfInt.
     * 
     */
    @Test
    public void testValueOfInt() {
        assertThat(Precision.valueOf(1)).isEqualTo(Precision.TENTHS);
        assertThat(Precision.valueOf(-1)).isEqualTo(Precision.TENS);
        try {
            Precision.valueOf(Integer.MAX_VALUE);
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
        assertThat(Precision.valueOf(0.1)).isEqualTo(Precision.TENTHS);
        assertThat(Precision.valueOf(10.0)).isEqualTo(Precision.TENS);
        try {
            Precision.valueOf(Double.MAX_VALUE);
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }
    
    @Test
    public void testValueOf() {
        assertThat(Precision.valueOf("TENTHS")).isEqualTo(Precision.TENTHS);
    }

}
