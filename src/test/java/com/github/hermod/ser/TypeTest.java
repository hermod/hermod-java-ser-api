package com.github.hermod.ser;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import java.math.BigDecimal;
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
        //assertThat(Type.valueOf(BigDecimal.class)).isEqualTo(Type.DECIMAL);
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
        assertThat(Type.valueOf("INTEGER").getShiftId()).isEqualTo((byte)2);
    }
    
    
    /**
     * <p>CustomMsg. TypeTest</p>
     *
     * @author anavarro - Nov 24, 2013
     *
     */
    public static class CustomMsg implements Msg {

        @Override
        public boolean isEmpty() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean isSerializable() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean isBytesSerializable() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean isByteBufferSerializable() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public boolean isByteBufSerializable() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public int[] getKeysArray() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int getKeyMax() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public int getKeysLength() {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Type getType(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public byte getTypeAsByte(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public boolean isArray(int aKey) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public int getArrayLength(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public boolean contains(int aKey) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Object get(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public <T> T get(int aKey, Class<T> aClazz) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Null getAsNull(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public boolean getAsBoolean(int aKey) {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Boolean getAsNullableBoolean(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public byte getAsByte(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Byte getAsNullableByte(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public short getAsShort(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Short getAsNullableShort(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int getAsInt(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Integer getAsNullableInteger(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long getAsLong(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Long getAsNullableLong(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public float getAsFloat(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Float getAsNullableFloat(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public double getAsDouble(int aKey) {
            // TODO Auto-generated method stub
            return 0;
        }

        @Override
        public Double getAsNullableDouble(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String getAsString(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Msg getAsMsg(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void getAsMsg(int aKey, Msg aDestMsg) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public boolean[] getAsBooleans(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Boolean[] getAsNullableBooleans(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public byte[] getAsBytes(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Byte[] getAsNullableBytes(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public short[] getAsShorts(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Short[] getAsNullableShorts(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public int[] getAsInts(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Integer[] getAsNullableIntegers(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public long[] getAsLongs(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Long[] getAsNullableLongs(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public float[] getAsFloats(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Float[] getAsNullableFloats(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public double[] getAsDoubles(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Double[] getAsNullableDoubles(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public String[] getAsStrings(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Msg[] getAsMsgs(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void getAsMsgs(int aKey, Msg... aDestMsgs) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public Object[] getAsObjects(int aKey) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Msg getAllAsMsg() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public Object[] getAllAsObjects() {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public void getAllAsObjects(Object... aObjects) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Null aNull) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Object aAnObject) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Object aObject, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, boolean aBoolean) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Boolean aBoolean) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Boolean aBoolean, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, byte aByte) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Byte aByte) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Byte aByte, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, short aShort) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, short aShort, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Short aShort) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Short aShort, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, int aInt) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, int aInt, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Integer aInt) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Integer aInt, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, long aLong) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, long aLong, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Long aLong) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Long aLong, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, float aFloat) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Float aFloat) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Float aFloat, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, double aDouble) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, double aDouble, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Double aDouble) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Double aDouble, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, double aDouble, int aScale) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Double aDouble, int aScale) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Double aDouble, int aScale, boolean aOptimizeLength) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, String aString) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, String aString, boolean aForceAsciiEncoding) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Msg aMsg) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, boolean... aBooleans) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Boolean... aBooleans) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, byte... aBytes) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Byte... aBytes) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, short... aShorts) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Short... aShorts) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, int... aInts) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Integer... aInts) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, long... aLongs) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Long... aLongs) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, float... aFloats) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Float... aFloats) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, double... aDoubles) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Double... aDoubles) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, String... aStrings) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, String[] aStrings, boolean aForceAsciiEncoding) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void set(int aKey, Msg... aMsgs) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setAll(Msg aMsg) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void setAll(Object... aAnObjects) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void remove(int... aKeys) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void removeAll() {
            // TODO Auto-generated method stub
            
        }
        
    }
    

}
