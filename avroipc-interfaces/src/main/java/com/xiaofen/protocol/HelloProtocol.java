/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.xiaofen.protocol;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public interface HelloProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"HelloProtocol\",\"namespace\":\"com.xiaofen.protocol\",\"types\":[{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.xiaofen.record\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"password\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Message\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"msg\",\"type\":\"string\"}]}],\"messages\":{\"hello\":{\"request\":[{\"name\":\"user\",\"type\":\"com.xiaofen.record.User\"}],\"response\":\"string\"}}}");
  /**
   */
  java.lang.CharSequence hello(com.xiaofen.record.User user) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  public interface Callback extends HelloProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = com.xiaofen.protocol.HelloProtocol.PROTOCOL;
    /**
     * @throws java.io.IOException The async call could not be completed.
     */
    void hello(com.xiaofen.record.User user, org.apache.avro.ipc.Callback<java.lang.CharSequence> callback) throws java.io.IOException;
  }
}