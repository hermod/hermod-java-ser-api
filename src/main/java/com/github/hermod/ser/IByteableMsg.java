package com.github.hermod.ser;

/**
 * <p>IBytesMsg. </p>
 *
 * @author anavarro - Apr 13, 2013
 *
 */

// Msg -> IntMap, Map, KeyValueMap
// current = Msg + BytesSerializable -> IntMapByte(s)Msg, MapByte(s)Msg, KeyValueMapBytes, MapByteable
//TODO Name? IMsgBytesSerializable, IMsgByteable, IMsgBytesable?, IMsgBytes, IBytesMsg
//KeyValueMsg, MapMsg, ?
public interface IByteableMsg extends IMsg, IBytesSerializable {

}
