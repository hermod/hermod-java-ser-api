package com.github.hermod.ser;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TypesTest {

    @Test
    public void test() {
        assertThat(Types.STRING_TYPE).isEqualTo(Types.STRING_TYPE);
    }

}
