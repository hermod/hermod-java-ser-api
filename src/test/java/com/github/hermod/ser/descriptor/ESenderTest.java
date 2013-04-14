package com.github.hermod.ser.descriptor;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>ESenderTest. </p>
 *
 * @author anavarro - Apr 14, 2013
 *
 */
public class ESenderTest {

    /**
     * test.
     *
     */
    @Test
    public void test() {
        assertThat(ESender.values()).hasSize(2).contains(ESender.CLIENT, ESender.SERVER);
        assertThat(ESender.valueOf("SERVER")).isEqualTo(ESender.SERVER);
        assertThat(ESender.valueOf("CLIENT")).isEqualTo(ESender.CLIENT);
    }

}
