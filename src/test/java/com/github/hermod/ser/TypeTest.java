package com.github.hermod.ser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import java.math.BigInteger;

import org.junit.Test;

/**
 * <p>TypeTest. </p>
 * 
 * @author anavarro - Apr 13, 2013
 * 
 */
public class TypeTest {

    /**
     * testValueOf.
     * 
     */
    @Test
    public void testValueOf() {
        assertThat(Type.valueOf("INTEGER")).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.INTEGER_TYPE)).isEqualTo(Type.INTEGER);
        assertThat(Type.valueOf(Types.MSG_TYPE)).isEqualTo(Type.MSG);
        assertThat(Type.valueOf(Boolean.class)).isEqualTo(Type.BYTE);
        assertThat(Type.valueOf(Short.class)).isEqualTo(Type.SHORT);
        assertThat(Type.valueOf(Integer.class)).isEqualTo(Type.INT);
        assertThat(Type.valueOf(Long.class)).isEqualTo(Type.LONG);
        assertThat(Type.valueOf(Float.class)).isEqualTo(Type.FLOAT);
        assertThat(Type.valueOf(Double.class)).isEqualTo(Type.DOUBLE);
        assertThat(Type.valueOf(String.class)).isEqualTo(Type.STRING_UTF8);
        assertThat(Type.valueOf(Msg.class)).isEqualTo(Type.MSG);
        assertThat(Type.valueOf(CustomMsg.class)).isEqualTo(Type.MSG);
        assertThat(Type.valueOf(byte[].class)).isEqualTo(Type.ARRAY_FIXED_VALUE);
        assertThat(Type.valueOf(Long[].class)).isEqualTo(Type.ARRAY_VARIABLE_VALUE);
        assertThat(Type.valueOf(Null.class)).isEqualTo(Type.NULL);
        try {
            assertThat(Type.valueOf((byte) 1));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);

        } catch (final Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }

        try {
            assertThat(Type.valueOf(BigInteger.class));
            failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
        } catch (final Exception e) {
            assertThat(e).isInstanceOf(IllegalArgumentException.class);
        }
    }

    /**
     * testGetShiftId.
     * 
     */
    @Test
    public void testGetShiftId() {
        assertThat(Type.valueOf("INTEGER").getShiftId()).isEqualTo((byte) 2);
    }

    /**
     * <p>CustomMsg.</p>
     * 
     * @author anavarro - Jan 1, 2014
     * 
     */
    static final class CustomMsg implements Msg {

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isEmpty()
         */
        @Override
        public boolean isEmpty() {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isSerializable()
         */
        @Override
        public boolean isSerializable() {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isBytesSerializable()
         */
        @Override
        public boolean isBytesSerializable() {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isByteBufferSerializable()
         */
        @Override
        public boolean isByteBufferSerializable() {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isByteBufSerializable()
         */
        @Override
        public boolean isByteBufSerializable() {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getKeysArray()
         */
        @Override
        public int[] getKeysArray() {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getKeyMax()
         */
        @Override
        public int getKeyMax() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getKeysLength()
         */
        @Override
        public int getKeysLength() {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getType(int)
         */
        @Override
        public Type getType(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getTypeAsByte(int)
         */
        @Override
        public byte getTypeAsByte(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#isArray(int)
         */
        @Override
        public boolean isArray(int aKey) {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getArrayLength(int)
         */
        @Override
        public int getArrayLength(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#contains(int)
         */
        @Override
        public boolean contains(int aKey) {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#get(int)
         */
        @Override
        public Object get(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#get(int, java.lang.Class)
         */
        @Override
        public <T> T get(int aKey, Class<T> aClazz) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNull(int)
         */
        @Override
        public Null getAsNull(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsBoolean(int)
         */
        @Override
        public boolean getAsBoolean(int aKey) {
            return false;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableBoolean(int)
         */
        @Override
        public Boolean getAsNullableBoolean(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsByte(int)
         */
        @Override
        public byte getAsByte(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableByte(int)
         */
        @Override
        public Byte getAsNullableByte(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsShort(int)
         */
        @Override
        public short getAsShort(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableShort(int)
         */
        @Override
        public Short getAsNullableShort(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsInt(int)
         */
        @Override
        public int getAsInt(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableInteger(int)
         */
        @Override
        public Integer getAsNullableInteger(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsLong(int)
         */
        @Override
        public long getAsLong(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableLong(int)
         */
        @Override
        public Long getAsNullableLong(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsFloat(int)
         */
        @Override
        public float getAsFloat(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableFloat(int)
         */
        @Override
        public Float getAsNullableFloat(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsDouble(int)
         */
        @Override
        public double getAsDouble(int aKey) {
            return 0;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableDouble(int)
         */
        @Override
        public Double getAsNullableDouble(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsString(int)
         */
        @Override
        public String getAsString(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsMsg(int)
         */
        @Override
        public Msg getAsMsg(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsMsg(int, com.github.hermod.ser.Msg)
         */
        @Override
        public void getAsMsg(int aKey, Msg aDestMsg) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsBooleans(int)
         */
        @Override
        public boolean[] getAsBooleans(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableBooleans(int)
         */
        @Override
        public Boolean[] getAsNullableBooleans(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsBytes(int)
         */
        @Override
        public byte[] getAsBytes(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableBytes(int)
         */
        @Override
        public Byte[] getAsNullableBytes(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsShorts(int)
         */
        @Override
        public short[] getAsShorts(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableShorts(int)
         */
        @Override
        public Short[] getAsNullableShorts(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsInts(int)
         */
        @Override
        public int[] getAsInts(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableIntegers(int)
         */
        @Override
        public Integer[] getAsNullableIntegers(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsLongs(int)
         */
        @Override
        public long[] getAsLongs(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableLongs(int)
         */
        @Override
        public Long[] getAsNullableLongs(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsFloats(int)
         */
        @Override
        public float[] getAsFloats(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableFloats(int)
         */
        @Override
        public Float[] getAsNullableFloats(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsDoubles(int)
         */
        @Override
        public double[] getAsDoubles(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsNullableDoubles(int)
         */
        @Override
        public Double[] getAsNullableDoubles(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsStrings(int)
         */
        @Override
        public String[] getAsStrings(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsMsgs(int)
         */
        @Override
        public Msg[] getAsMsgs(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsMsgs(int, com.github.hermod.ser.Msg[])
         */
        @Override
        public void getAsMsgs(int aKey, Msg... aDestMsgs) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAsObjects(int)
         */
        @Override
        public Object[] getAsObjects(int aKey) {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAllAsMsg()
         */
        @Override
        public Msg getAllAsMsg() {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAllAsObjects()
         */
        @Override
        public Object[] getAllAsObjects() {
            return null;
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#getAllAsObjects(java.lang.Object[])
         */
        @Override
        public void getAllAsObjects(Object... aObjects) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, com.github.hermod.ser.Null)
         */
        @Override
        public void set(int aKey, Null aNull) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Object)
         */
        @Override
        public void set(int aKey, Object aAnObject) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Object, boolean)
         */
        @Override
        public void set(int aKey, Object aObject, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, boolean)
         */
        @Override
        public void set(int aKey, boolean aBoolean) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Boolean)
         */
        @Override
        public void set(int aKey, Boolean aBoolean) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Boolean, boolean)
         */
        @Override
        public void set(int aKey, Boolean aBoolean, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, byte)
         */
        @Override
        public void set(int aKey, byte aByte) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Byte)
         */
        @Override
        public void set(int aKey, Byte aByte) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Byte, boolean)
         */
        @Override
        public void set(int aKey, Byte aByte, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, short)
         */
        @Override
        public void set(int aKey, short aShort) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, short, boolean)
         */
        @Override
        public void set(int aKey, short aShort, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Short)
         */
        @Override
        public void set(int aKey, Short aShort) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Short, boolean)
         */
        @Override
        public void set(int aKey, Short aShort, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, int)
         */
        @Override
        public void set(int aKey, int aInt) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, int, boolean)
         */
        @Override
        public void set(int aKey, int aInt, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Integer)
         */
        @Override
        public void set(int aKey, Integer aInt) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Integer, boolean)
         */
        @Override
        public void set(int aKey, Integer aInt, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, long)
         */
        @Override
        public void set(int aKey, long aLong) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, long, boolean)
         */
        @Override
        public void set(int aKey, long aLong, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Long)
         */
        @Override
        public void set(int aKey, Long aLong) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Long, boolean)
         */
        @Override
        public void set(int aKey, Long aLong, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, float)
         */
        @Override
        public void set(int aKey, float aFloat) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Float)
         */
        @Override
        public void set(int aKey, Float aFloat) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Float, boolean)
         */
        @Override
        public void set(int aKey, Float aFloat, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, double)
         */
        @Override
        public void set(int aKey, double aDouble) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, double, boolean)
         */
        @Override
        public void set(int aKey, double aDouble, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Double)
         */
        @Override
        public void set(int aKey, Double aDouble) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Double, boolean)
         */
        @Override
        public void set(int aKey, Double aDouble, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, double, int)
         */
        @Override
        public void set(int aKey, double aDouble, int aScale) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Double, int)
         */
        @Override
        public void set(int aKey, Double aDouble, int aScale) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Double, int, boolean)
         */
        @Override
        public void set(int aKey, Double aDouble, int aScale, boolean aOptimizeLength) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.String)
         */
        @Override
        public void set(int aKey, String aString) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.String, boolean)
         */
        @Override
        public void set(int aKey, String aString, boolean aForceAsciiEncoding) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, com.github.hermod.ser.Msg)
         */
        @Override
        public void set(int aKey, Msg aMsg) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, boolean[])
         */
        @Override
        public void set(int aKey, boolean... aBooleans) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Boolean[])
         */
        @Override
        public void set(int aKey, Boolean... aBooleans) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, byte[])
         */
        @Override
        public void set(int aKey, byte... aBytes) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Byte[])
         */
        @Override
        public void set(int aKey, Byte... aBytes) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, short[])
         */
        @Override
        public void set(int aKey, short... aShorts) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Short[])
         */
        @Override
        public void set(int aKey, Short... aShorts) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, int[])
         */
        @Override
        public void set(int aKey, int... aInts) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Integer[])
         */
        @Override
        public void set(int aKey, Integer... aInts) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, long[])
         */
        @Override
        public void set(int aKey, long... aLongs) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Long[])
         */
        @Override
        public void set(int aKey, Long... aLongs) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, float[])
         */
        @Override
        public void set(int aKey, float... aFloats) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Float[])
         */
        @Override
        public void set(int aKey, Float... aFloats) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, double[])
         */
        @Override
        public void set(int aKey, double... aDoubles) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.Double[])
         */
        @Override
        public void set(int aKey, Double... aDoubles) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.String[])
         */
        @Override
        public void set(int aKey, String... aStrings) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, java.lang.String[], boolean)
         */
        @Override
        public void set(int aKey, String[] aStrings, boolean aForceAsciiEncoding) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#set(int, com.github.hermod.ser.Msg[])
         */
        @Override
        public void set(int aKey, Msg... aMsgs) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#setAll(com.github.hermod.ser.Msg)
         */
        @Override
        public void setAll(Msg aMsg) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#setAll(java.lang.Object[])
         */
        @Override
        public void setAll(Object... aObjects) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#remove(int[])
         */
        @Override
        public void remove(int... aKeys) {
        }

        /**
         * {@inheritDoc}
         * 
         * @see com.github.hermod.ser.Msg#removeAll()
         */
        @Override
        public void removeAll() {
        }

    }

}
