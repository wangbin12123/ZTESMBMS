package cn.zte.smbms.dao.user;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.zte.smbms.pojo.User;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{

	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("cn.zte.smbms.dao.user.UserMapper.getUserList",user);
	}

	@Override
	public int add(User user) {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
