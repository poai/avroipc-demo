package cn.com.xiaofen.hessiantest;

import java.net.MalformedURLException;
import com.caucho.hessian.client.HessianProxyFactory;
import cn.com.xiaofen.hessian_interfaces.HelloInterface;

public class HessionClient {
	public static void main(String[] args) throws MalformedURLException {
		String url="http://localhost:8887/hessian-server/hello";
		HessianProxyFactory factory = new HessianProxyFactory();
		HelloInterface  helloService = (HelloInterface) factory.create(HelloInterface.class, url);
		System.out.println("message from hessian : " + helloService.hello());
	}
}
