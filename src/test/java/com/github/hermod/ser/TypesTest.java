package com.github.hermod.ser;

import static org.assertj.core.api.Assertions.assertThat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * <p>TypesTest. </p>
 * 
 * @author anavarro - Apr 20, 2013
 * 
 */
public class TypesTest {

    /**
     * test.
     * 
     */
    @Test
    public void test() {
        assertThat(Types.STRING_UTF_8_TYPE).isEqualTo(Types.STRING_UTF_8_TYPE);
    }

    /**
     * testValidatesThatClassFooIsNotInstantiable2.
     * 
     * @throws Exception
     */
    @Test
    public void testValidatesThatClassFooIsNotInstantiable2() throws Exception {
        final Constructor<Types> constructor = Types.class.getDeclaredConstructor();
        assertThat(Modifier.isPrivate(constructor.getModifiers())).isTrue();
        constructor.setAccessible(true);
        constructor.newInstance();
    }

}
