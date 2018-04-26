package cn.zte.smbms.service.user;

import java.util.List;

import cn.zte.smbms.dao.user.UserMapper;
import cn.zte.smbms.pojo.User;

public class UserServiceImpl1 implements UserService{
	public UserMapper userMapper;
	
	public UserMapper getUserMapper() {
		return userMapper;
	}

	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	@Override
	public List<User> findUserwithCondition(User user) {
		try {
			return userMapper.getUserList(user);
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
	}

	@Override
	public boolean addNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
