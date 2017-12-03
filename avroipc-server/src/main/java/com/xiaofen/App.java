package com.xiaofen;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Responder;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;

import com.xiaofen.protocol.HelloProtocol;
import com.xiaofen.service.HelloService;

public class App {

	@SuppressWarnings("unused")
	private static Server server;
	public static void main(String[] args) throws IOException {
		//服务端协议
		Responder responder=new SpecificResponder(HelloProtocol.class, new HelloService());
		server=new NettyServer(responder, new InetSocketAddress(65111));
	}
}
