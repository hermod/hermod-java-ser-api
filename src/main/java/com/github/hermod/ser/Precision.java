package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Precision. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public enum Precision {

    UNITS(1), TENTHS(0.1), HUNDREDTHS(0.01), THOUSANDTHS(0.001), TEN_THOUSANDTHS(0.0001), HUNDRED_THOUSANDTHS(0.00001), MILLIONTHS(0.000001), TEN_MILLIONTHS(
            0.0000001), HUNDRED_MILLIONTHS(0.00000001), TENS(10.0), HUNDREDS(100.0), THOUSANDS(1000.0), TEN_THOUSANDS(10000.0), HUNDRED_THOUSANDS(
            100000.0), MILLIONS(1000000.0), TEN_MILLIONS(10000000.0), HUNDRED_MILLIONS(100000000.0);

    private static final Precision[] NEGATIVE_NB_DIGIT_PRECISION; 
    private static final Precision[] POSITIVE_NB_DIGIT_PRECISION;
    
    /**
     * HALF
     */
    public static final double HALF = 0.5;
    
    
    private final double precision;
    private final int nbDigit;

    
    static {
        int maxNbDigitPrecision = 0;
        int minNbDigitPrecision = 0;
        for (final Precision precision : Precision.values()) {
            if (precision.getNbDigit() > maxNbDigitPrecision) {
                maxNbDigitPrecision = precision.getNbDigit();
            }
            if (precision.getNbDigit() < minNbDigitPrecision) {
                minNbDigitPrecision = precision.getNbDigit();
            }
        }
        NEGATIVE_NB_DIGIT_PRECISION = new Precision[- minNbDigitPrecision + 1];
        POSITIVE_NB_DIGIT_PRECISION = new Precision[maxNbDigitPrecision + 1];
        
        for (final Precision precision : Precision.values()) {
            if (precision.getNbDigit() >= 0) {
                POSITIVE_NB_DIGIT_PRECISION[precision.getNbDigit()] = precision;
            } else {
                NEGATIVE_NB_DIGIT_PRECISION[-precision.getNbDigit()] = precision;
            }
        }
    }
    
    /**
     * Constructor.
     * 
     * @param aPrecision
     */
    private Precision(final double aPrecision) {
        this.precision = aPrecision;
        this.nbDigit = (int) - Math.log10(this.precision);
        
    }

    /**
     * calculateIntegerMantissa.
     * 
     * Caution it return a double to cast to int after
     * It return Double.NaN if not possible to have mantissa on a int
     * 
     * @param aValue
     * @return
     */
    public final double calculateIntegerMantissa(final double aValue) {
        final double mantissa = aValue / this.precision + HALF;
        return mantissa >= Integer.MIN_VALUE && mantissa <= Integer.MAX_VALUE ? mantissa : Double.NaN;
    }
    
    /**
     * calculateDouble.
     *
     * @param aValue
     * @return
     */
    public final double calculateDoubleFromIntegerMantissa(final long aValue) {
        return aValue * this.precision;
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
     * @return
     */
    public final double getPrecision() {
        return this.precision;
    }

    /**
     * getPrecision.
     * 
     * @param nbDigit
     * @return
     */
    public static Precision valueOf(final int nbDigit) {
        try {
            return nbDigit >= 0 ? POSITIVE_NB_DIGIT_PRECISION[nbDigit] : NEGATIVE_NB_DIGIT_PRECISION[-nbDigit];
        } catch (final IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Precision not found with nbDigit=" + nbDigit + " in " + Arrays.asList(Precision.values()), e);
        }
    }
    
    /**
     * getPrecision.
     *
     * @param aPrecision
     * @return
     */
    public static final Precision valueOf(final double aPrecision) {
        for (final Precision precision : Precision.values()) {
            if (aPrecision == precision.getPrecision()) {
                return precision;
            }
        }
        throw new IllegalArgumentException("Precision not found with precision=" + aPrecision + " in " + Arrays.asList(Precision.values()));
    }

}
