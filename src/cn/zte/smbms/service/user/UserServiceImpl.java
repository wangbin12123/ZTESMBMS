package cn.zte.smbms.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.zte.smbms.dao.user.UserMapper;
import cn.zte.smbms.pojo.User;
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
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
		boolean flag = false;
		try {
			if(userMapper.add(user)==1) {
				flag = true;
			}
		}catch(RuntimeException e) {
			e.printStackTrace();
			throw e;
		}
		return flag;
	}
	
}
