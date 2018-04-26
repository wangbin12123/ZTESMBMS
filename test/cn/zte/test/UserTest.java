package cn.zte.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zte.smbms.pojo.User;
import cn.zte.smbms.service.user.UserService;

public class UserTest {
	private Logger log = Logger.getLogger(UserTest.class);
	public UserTest() {
		
	}
	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
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
	@Test
	public void testUserAdd() throws ParseException{
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
			UserService service =(UserService)context.getBean("userService");
			User user = new User();
			user.setUserName("鹰眼");
			user.setUserCode("yingyan");
			user.setUserPassword("456798");
			user.setGender(1);
			Date birthday = new SimpleDateFormat("yyyy-MM-dd").parse("1980-01-10");
			user.setBirthday(birthday);
			user.setPhone("1200012");
			user.setAddress("东海");
			user.setUserRole(2);
			user.setCreatedBy(1);
			user.setCreationDate(new Date());
			user.setModifyBy(1);
			user.setModifyDate(new Date());
			boolean flag = service.addNewUser(user);
			log.debug("添加用户信息："+flag);
	}
}
