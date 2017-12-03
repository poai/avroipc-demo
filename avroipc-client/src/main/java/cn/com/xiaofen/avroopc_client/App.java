package cn.com.xiaofen.avroopc_client;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import com.xiaofen.protocol.HelloProtocol;
import com.xiaofen.record.User;

public class App {
	public static void main(String[] args) throws IOException {
		NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(65111));
		HelloProtocol proxy = SpecificRequestor.getClient(HelloProtocol.class, client);
		User user = new User();
		user.setId("1");
		user.setName("xiaofen");
		user.setPassword("root");
		System.out.println(proxy.hello(user));
	}
}
