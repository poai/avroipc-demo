package cn.com.xiaofen.hessiantest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;

import org.junit.Test;

import com.caucho.burlap.io.BurlapOutput;

/**
 * 使用Hession二进制传输协议压缩数据格式
 * 
 * 
 * 
 * 
 */
public class T1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Test
	public void test() throws IOException {
		OutputStream os = new FileOutputStream(new File("d://a.txt"));
		BurlapOutput out = new BurlapOutput(os);
		Person person=new Person();
		person.setId(1);
		person.setName("xiaofen");
		Person friend=new Person();
		friend.setId(2);
		friend.setName("tudu");
		person.setFriend(friend);
		out.writeObject(person);
	}
	
	
	class Person implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
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
