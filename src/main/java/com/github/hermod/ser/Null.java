package com.github.hermod.ser;

/**
 * <p>Null. </p>
 *
 * @author anavarro - Oct 29, 2013
 *
 */
public final class Null {
    
    private static final Null[] LENGTH_NULLS = new Null[30];

    static {
        for (int i = 0; i < LENGTH_NULLS.length; i++) {
            LENGTH_NULLS[i] = new Null(i); 
        }
    }
    
    private final int length;
    

    /**
     * Constructor.
     *
     * @param aLength
     */
    private Null(final int aLength) {
        super();
        if (aLength < 0) {
            throw new IllegalArgumentException("The length must be superior to 0.");
        }
        this.length = aLength;
    }
    
    /**
     * getLength.
     *
     * @return
     */
    public int getLength() {
        return this.length;
    }
    
    /**
     * valueOf.
     *
     * @param aLength
     * @return
     */
    public static Null valueOf(final int aLength) {
        try {
            return LENGTH_NULLS[aLength];
        } catch (final ArrayIndexOutOfBoundsException e) {
            return new Null(aLength);
        }
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.length;
        return result;
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Null other = (Null) obj;
        if (this.length != other.length)
            return false;
        return true;
    }
    
    
    

}
