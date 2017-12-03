package cn.com.xiaofen.hessiantest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

/**
 * 1.使用HessionClient 直接消费远程Hession服务 2.独立Hession序列化
 * 
 */
public class T2 {

	@Test
	public void test_serialization() throws IOException {
		OutputStream outputStream = new FileOutputStream("d://a.txt");
		Hessian2Output out = new Hessian2Output(outputStream);
		out.call("nihao", new String[]{"1","2"});
		//out.writeInt(100);
		//out.writeBoolean(false);
		out.flush();
		out.close();
	}

	@Test
	public void test_dserialization() throws IOException{
		InputStream inputStream=new FileInputStream("d://a.txt");
		Hessian2Input in=new Hessian2Input(inputStream);
		int ss=in.read();
		System.out.println((char)ss);
		//System.out.println(in.readInt());
		//System.out.println(in.readBoolean());
		
	}
	
	public static void main(String[] args) throws IOException {
		InputStream inputStream=new FileInputStream("d://a.txt");
		Hessian2Input in=new Hessian2Input(inputStream);
		in.startCall();
		in.readCall();
		in.close();
		
		
	}
	
	
	
	class Person {
		private int id;
		private String name;
		private Person friend;

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Person getFriend() {
			return friend;
		}
		public void setFriend(Person friend) {
			this.friend = friend;
		}
	}
}
