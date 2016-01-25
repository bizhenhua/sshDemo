package aop;

import org.andy.shop.entity.UserInfo;
import org.andy.shop.service.UserInfoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext ct = new ClassPathXmlApplicationContext("spring*.xml");

		UserInfoService service = (UserInfoService) ct.getBean("userInfoService");
		UserInfo user = new UserInfo();
		service.insert(user);
		System.out.println("user.name="+user.getId());
	}
}
