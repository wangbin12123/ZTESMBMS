package cn.zte.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zte.smbms.pojo.User;
import cn.zte.smbms.service.user.UserService;

public class UserTest3 {
	private Logger log = Logger.getLogger(UserTest.class);
	public UserTest3() {
		
	}
	@Test
	public void testUser3() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextUser3.xml");
		UserService service =(UserService)context.getBean("userService");
		List<User> list = new ArrayList<User>();
		User userCondition = new User();
		userCondition.setUserName("��");
		userCondition.setUserRole(3);
		list = service.findUserwithCondition(userCondition);
		for (User user : list) {
			log.debug("�û�����"+user.getUserName()+"\n"
					+"�û����룺"+user.getUserCode()+"\n"
					+"�û���ɫ��"+user.getUserRoleName());
		}
	}
}
