package com.github.hermod.ser;

import java.util.Arrays;

/**
 * <p>Precisions. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
public final class Precisions {

    /**
     * Constructor.
     *
     */
    private Precisions() {
        // TODO Auto-generated constructor stub
        super();
        
    }

    /**
     * getPrecision.
     * 
     * @param nbDigit
     * @return
     */
    public static final EPrecision getPrecisionFromNbDigit(final int nbDigit) {
        for (final EPrecision precision : EPrecision.values()) {
            if (nbDigit == precision.getNbDigit()) {
                return precision;
            }
        }
        throw new IllegalArgumentException("Precision not found with nbDigit=" + nbDigit + " in " + Arrays.asList(EPrecision.values()));
    }
    
    
    /**
     * getPrecision.
     *
     * @param aPrecision
     * @return
     */
    public static final EPrecision getPrecision(final double aPrecision) {
        for (final EPrecision precision : EPrecision.values()) {
            if (aPrecision == precision.getPrecision()) {
                return precision;
            }
        }
        throw new IllegalArgumentException("Precision not found with precision=" + aPrecision + " in " + Arrays.asList(EPrecision.values()));
    }

}
