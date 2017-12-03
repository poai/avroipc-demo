package com.xiaofen.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.com.xiaofen.hessian_interfaces.HelloInterface;

@RestController
public class HelloService {
	@Autowired
	HelloInterface helloInterface;
	@RequestMapping("/hession/hello")
	public String teseHessian() {
		return helloInterface.hello();
	}
}
