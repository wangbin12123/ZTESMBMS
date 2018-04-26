package cn.zte.smbms.dao.user;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.zte.smbms.pojo.User;

public interface UserMapper {
	public List<User> getUserList(User user);
	public int add(User user);
}
