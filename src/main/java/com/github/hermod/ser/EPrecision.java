package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>EPrecision. </p>
 *
 * @author anavarro - Apr 7, 2013
 *
 */
public enum EPrecision {

    UNITS(0), TENTHS(0.1), HUNDREDTHS(0.01), THOUSANDTHS(0.001), TEN_THOUSANDTHS(0.0001), HUNDRED_THOUSANDTHS(0.00001), MILLIONTHS(0.000001), TEN_MILLIONTHS(0.0000001), HUNDRED_MILLIONTHS(0.00000001), TENS(10.0), HUNDREDS(100.0), THOUSANDS(1000.0), TEN_THOUSANDS(10000.0), HUNDRED_THOUSANDS(100000.0), MILLIONS(1000000.0), TEN_MILLIONS(10000000.0), HUNDRED_MILLIONS(100000000.0);
    
    private final double precision;
    private final int nbDigit;

    /**
     * Constructor.
     *
     * @param aPrecision
     */
    private EPrecision(final double aPrecision) {
        this.precision = aPrecision;
        this.nbDigit = (int) Math.log10(this.precision);
    }
    
    /**
     * calculateIntegerMantissa.
     *
     * @param aValue
     * @return
     */
    public final long calculateIntegerMantissa(final double aValue) {
        return (long) (aValue / this.precision);
    }

    /**
     * getNbDigit.
     *
     * @return
     */
    public final int getNbDigit() {
        return this.nbDigit;
    }
    
    /**
     * getPrecision.
     *
     * @param nbDigit
     * @return
     */
    public static final EPrecision getPrecision(final int nbDigit) {
            for (final EPrecision precision : EPrecision.values()) {
                if (nbDigit == precision.getNbDigit()) {
                    return precision;
                }
            }
            throw new IllegalArgumentException("Precision not found with nbDigit=" + nbDigit + " in " + Arrays.asList(EPrecision.values()));
    }
    
    
    
}
