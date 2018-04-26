package cn.zte.smbms.service.user;

import java.util.List;

import cn.zte.smbms.pojo.User;

public interface UserService {
	public List<User> findUserwithCondition(User user);
	public boolean addNewUser(User user);
}
