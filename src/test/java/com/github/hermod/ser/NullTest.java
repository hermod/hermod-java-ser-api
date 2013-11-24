package com.github.hermod.ser;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * <p>NullTest. </p>
 * 
 * @author anavarro - Nov 1, 2013
 * 
 */
public class NullTest {

    /**
     * testGetLength.
     * 
     */
    @Test
    public void testGetLength() {
        for (int i = 0; i < 64; i++) {
            final Null nul = Null.valueOf(i);
            assertThat(nul.getLength()).isEqualTo(i);
        }
    }

    /**
     * testGetType.
     * 
     */
    @Test
    public void testGetType() {
        for (int i = 0; i < 64; i++) {
            final Null nul = Null.valueOf(i);
            assertThat(nul.getType()).isEqualTo(Type.NULL);
        }
        for (Type type : Type.values()) {
            if (type == Type.SKIPPED_KEYS) {
                try {
                    final Null nul = Null.valueOf(type);
                } catch (Exception e) {
                    assertThat(e).isInstanceOf(IllegalArgumentException.class);
                }
            } else {
                final Null nul = Null.valueOf(type);
                assertThat(nul.getType()).isEqualTo(type);
            }
        }
    }

    /**
     * testValueOf.
     * 
     */
    @Test
    public void testValueOf() {
        for (int i = 0; i < 64; i++) {
            final Null nul = Null.valueOf(i);
            assertThat(nul).isEqualTo(Null.valueOf(i));
            assertThat(nul.hashCode()).isEqualTo(Null.valueOf(i).hashCode());
            assertThat(nul).isNotEqualTo(Null.valueOf(i + 1));
            assertThat(nul.equals(null)).isFalse();
            assertThat(nul.equals(Integer.valueOf(i))).isFalse();

        }
        for (final Type type : Type.values()) {
            if (type == Type.SKIPPED_KEYS) {
                try {
                    final Null nul = Null.valueOf(type);
                } catch (Exception e) {
                    assertThat(e).isInstanceOf(IllegalArgumentException.class);
                }
            } else {
                final Null nul = Null.valueOf(type);
                assertThat(nul.getType()).isEqualTo(type);
            }
        }
        try {
            final Null nul = Null.valueOf(null);
        } catch (Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

    /**
     * testValueOfWithNegativeLength.
     * 
     */
    @Test(expected = IllegalArgumentException.class)
    public void testValueOfWithNegativeLength() {
        Null.valueOf(-1);
    }

}
