package com.github.hermod.ser.descriptor;

/**
 * <p>FootballPlayer. </p>
 *
 * @author anavarro - Apr 14, 2013
 *
 */
public enum FootballPlayer implements IEnumIntConverter{

    GOALKEEPER(1), LIBERO(5), STRIKER(9); 
    
    private int jerseyNumber;
    
    /**
     * Constructor.
     *
     * @param aNumber
     */
    private FootballPlayer(final int aNumber) {
        this.jerseyNumber = aNumber;
    }

    /**
     * (non-Javadoc)
     *
     * @see com.github.hermod.ser.descriptor.IEnumIntConverter#convert()
     */
    @Override
    public Integer convert() {
        return jerseyNumber;
    }

}
