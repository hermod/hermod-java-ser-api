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
public class ScaleTest {

    /**
         * testCalculateIntegerMantissa.
         * 
         */
        @Test
        public void testCalculateUnscaledValue() {
            assertThat((int) Scale.TENTHS.calculateUnscaledValue(1.1)).isEqualTo(11);
            assertThat((int) Scale.THOUSANDTHS.calculateUnscaledValue(1.122)).isEqualTo(1122);
            assertThat((int) Scale.HUNDREDS.calculateUnscaledValue(100.122)).isEqualTo(1);
            assertThat(Scale.HUNDREDS.calculateUnscaledValue(Long.MAX_VALUE)).isNaN();
            assertThat(Scale.HUNDREDS.calculateUnscaledValue(Long.MIN_VALUE)).isNaN();
        }

    /**
     * testCalculateDouble.
     * 
     */
    @Test
    public void calculateDoubleFromIntegerMantissa() {
        assertThat(Scale.TENTHS.calculateDoubleFromUnscaledValue(11)).isEqualTo(1.1);
        assertThat(Scale.THOUSANDTHS.calculateDoubleFromUnscaledValue(1122)).isEqualTo(1.122);
        assertThat(Scale.HUNDREDS.calculateDoubleFromUnscaledValue(1)).isEqualTo(100);

    }

    /**
         * testGetNbDigit.
         * 
         */
        @Test
        public void testGetScale() {
            assertThat(Scale.TENTHS.getScale()).isEqualTo(1);
        }

    /**
         * testGetPrecision.
         * 
         */
        @Test
        public void testGetDecimal() {
            assertThat(Scale.TENTHS.getDecimal()).isEqualTo(0.1);
        }

    /**
     * testValueOfInt.
     * 
     */
    @Test
    public void testValueOfInt() {
        assertThat(Scale.valueOf(1)).isEqualTo(Scale.TENTHS);
        assertThat(Scale.valueOf(-1)).isEqualTo(Scale.TENS);
        try {
            Scale.valueOf(Integer.MAX_VALUE);
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
        assertThat(Scale.valueOf(0.1)).isEqualTo(Scale.TENTHS);
        assertThat(Scale.valueOf(10.0)).isEqualTo(Scale.TENS);
        try {
            Scale.valueOf(Double.MAX_VALUE);
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }
    
    @Test
    public void testValueOf() {
        assertThat(Scale.valueOf("TENTHS")).isEqualTo(Scale.TENTHS);
    }

}
