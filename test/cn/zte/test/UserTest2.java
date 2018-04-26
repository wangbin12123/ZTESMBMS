package cn.zte.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zte.smbms.pojo.User;
import cn.zte.smbms.service.user.UserService;
/**
 * sqlSessionFactory实现实现数据库的操作
 * 第二次改变
 * @author bin
 *
 */
public class UserTest2 {
	private Logger log = Logger.getLogger(UserTest.class);
	public UserTest2() {
		
	}
	@Test
	public void testUser2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextUser2.xml");
		UserService service =(UserService)context.getBean("userService");
		List<User> list = new ArrayList<User>();
		User userCondition = new User();
		userCondition.setUserName("孙");
		userCondition.setUserRole(3);
		list = service.findUserwithCondition(userCondition);
		for (User user : list) {
			log.debug("用户姓名"+user.getUserName()+"\n"
					+"用户代码："+user.getUserCode()+"\n"
					+"用户角色："+user.getUserRoleName());
		}
	}
}
