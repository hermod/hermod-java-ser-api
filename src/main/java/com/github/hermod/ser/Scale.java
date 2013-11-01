package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Precision. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
public enum Scale {

    UNITS(0), TENTHS(1), HUNDREDTHS(2), THOUSANDTHS(3), TEN_THOUSANDTHS(4), HUNDRED_THOUSANDTHS(5), MILLIONTHS(6), TEN_MILLIONTHS(
            7), HUNDRED_MILLIONTHS(8), TENS(-1), HUNDREDS(-2), THOUSANDS(-3), TEN_THOUSANDS(-4), HUNDRED_THOUSANDS(
            -5), MILLIONS(-6), TEN_MILLIONS(-7), HUNDRED_MILLIONS(-8);
    
    
    private static final Scale[] NEGATIVE_SCALES; 
    private static final Scale[] POSITIVE_SCALES;

    public static final double[] NEGATIVE_SCALE_DECIMALS; 
    public static final double[] POSITIVE_SCALE_DECIMALS;
    
    
    /**
     * HALF
     */
    public static final double HALF = 0.5;
    
    
    private final double decimal;
    private final int scale;

    
    static {
        int maxScale = 0;
        int minScale = 0;
        for (final Scale precision : Scale.values()) {
            if (precision.getScale() > maxScale) {
                maxScale = precision.getScale();
            }
            if (precision.getScale() < minScale) {
                minScale = precision.getScale();
            }
        }
        NEGATIVE_SCALES = new Scale[- minScale + 1];
        POSITIVE_SCALES = new Scale[maxScale + 1];
        NEGATIVE_SCALE_DECIMALS = new double[- minScale + 1];
        POSITIVE_SCALE_DECIMALS = new double[maxScale + 1];
        
        
        
        for (final Scale scale : Scale.values()) {
            if (scale.getScale() >= 0) {
                POSITIVE_SCALES[scale.getScale()] = scale;
                POSITIVE_SCALE_DECIMALS[scale.getScale()] = scale.getDecimal();
            } else {
                NEGATIVE_SCALES[-scale.getScale()] = scale;
                NEGATIVE_SCALE_DECIMALS[-scale.getScale()] = scale.getDecimal();
            }
        }
    }
    
    /**
     * Constructor.
     * 
     * @param aPrecision
     */
    private Scale(final int aScale) {
        this.scale = aScale;
        this.decimal = Math.pow(10, - aScale);
        
    }

    /**
     * calculateUnscaledValue.
     * 
     * Caution it return a double to cast to int after
     * It return Double.NaN if not possible to have mantissa on a int
     * 
     * @param aValue
     * @return
     */
    public final double calculateUnscaledValue(final double aValue) {
        final double unscaledValue = aValue / this.decimal + HALF;
        return unscaledValue >= Integer.MIN_VALUE && unscaledValue <= Integer.MAX_VALUE ? unscaledValue : Double.NaN;
    }
    
    /**
     * calculateDouble.
     *
     * @param aValue
     * @return
     */
    public final double calculateDoubleFromUnscaledValue(final long aValue) {
        return aValue * this.decimal;
    }

    /**
     * getNbDigit.
     * 
     * @return
     */
    public final int getScale() {
        return this.scale;
    }
    
    /**
     * getPrecision.
     *
     * @return
     */
    public final double getDecimal() {
        return this.decimal;
    }

    /**
     * getPrecision.
     * 
     * @param aScale
     * @return
     */
    public static Scale valueOf(final int aScale) {
        try {
            return aScale >= 0 ? POSITIVE_SCALES[aScale] : NEGATIVE_SCALES[-aScale];
        } catch (final IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Precision not found with scale=" + aScale + " in " + Arrays.asList(Scale.values()), e);
        }
    }
    
    /**
     * getPrecision.
     *
     * @param aDecimal
     * @return
     */
    public static final Scale valueOf(final double aDecimal) {
        for (final Scale scale : Scale.values()) {
            if (aDecimal == scale.decimal) {
                return scale;
            }
        }
        throw new IllegalArgumentException("Precision not found with decimal=" + aDecimal + " in " + Arrays.asList(Scale.values()));
    }

}
