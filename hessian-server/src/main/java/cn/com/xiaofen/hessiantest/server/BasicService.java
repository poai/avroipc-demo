package cn.com.xiaofen.hessiantest.server;

import javax.servlet.annotation.WebServlet;
import com.caucho.hessian.server.HessianServlet;
import cn.com.xiaofen.hessian_interfaces.HelloInterface;

@WebServlet("/hello")
public class BasicService extends HessianServlet implements HelloInterface {
	private static final long serialVersionUID = 1L;
	@Override
	public String hello() {
		return "hai  i`m from hessian server ";
	}
}
