package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Precision. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */
@Deprecated
public enum Scale {

    UNITS(1), TENTHS(0.1), HUNDREDTHS(0.01), THOUSANDTHS(0.001), TEN_THOUSANDTHS(0.0001), HUNDRED_THOUSANDTHS(0.00001), MILLIONTHS(0.000001), TEN_MILLIONTHS(
            0.0000001), HUNDRED_MILLIONTHS(0.00000001), TENS(10.0), HUNDREDS(100.0), THOUSANDS(1000.0), TEN_THOUSANDS(10000.0), HUNDRED_THOUSANDS(
                    100000.0), MILLIONS(1000000.0), TEN_MILLIONS(10000000.0), HUNDRED_MILLIONS(100000000.0);
    
    
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
//    private Scale(final int aScale) {
//        this.scale = aScale;
//        this.decimal = Math.pow(10, - aScale);
//        
//    }
    
    private Scale(final double aDecimal) {
        this.decimal = aDecimal;
        this.scale = - (int) Math.log10(aDecimal);
        
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
