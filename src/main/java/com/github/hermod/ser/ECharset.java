package com.github.hermod.ser;

/**
 * <p>ECharset. </p>
 *
 * @author anavarro - Apr 10, 2013
 *
 */
public enum ECharset {

    ISO_8859_1("ISO-8859-1"), UTF_16("UTF-16");
    
    private final String charsetName;

    /**
     * Constructor.
     *
     * @param aCharsetName
     */
    private ECharset(final String aCharsetName) {
        this.charsetName = aCharsetName;
    }

    /**
     * getCharsetName.
     *
     * @return
     */
    public final String getCharsetName() {
        return this.charsetName;
    }
    
}
