package cn.zte.smbms.dao.user;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import cn.zte.smbms.pojo.User;

public class UserMapperImpl1 implements UserMapper{
	public SqlSessionTemplate sqlSession;
	
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<User> getUserList(User user) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("cn.zte.smbms.dao.user.UserMapper.getUserList",user);
	}

	@Override
	public int add(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
