package com.xiaofen.service;

import org.apache.avro.AvroRemoteException;
import com.xiaofen.protocol.HelloProtocol;
import com.xiaofen.record.User;

public class HelloService implements HelloProtocol {
	@Override
	public CharSequence hello(User user) throws AvroRemoteException {
		System.out.println(user.getId() + "," + user.getName() + "," + user.getPassword());
		return "hai i`m from avro service";
	}
}
