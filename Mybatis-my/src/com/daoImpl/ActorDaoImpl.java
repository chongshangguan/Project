package com.daoImpl;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.ActorDao;

public class ActorDaoImpl implements ActorDao {

	private static SqlSessionFactory sqlSessionFactory; 
	private static InputStream inputStream;
	
	static {
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	
	@Override
	public List<Map<String, Object>> queryActory() {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			return session.selectList("com.mapper.actorDao.queryActor");
//			return session.selectMap("com.mapper.actorDao.queryActor", "account_num_name");
		} finally {
			session.commit();
			session.close();
		}
	}

	@Override
	public void proxyTest() {
		System.out.println("·½·¨Ö´ÐÐ");
	}

	@Override
	public Map<String, Object> test() {
		SqlSession session = sqlSessionFactory.openSession();
		return session.selectOne("com.mapper.actorDao.test");
	}

}
