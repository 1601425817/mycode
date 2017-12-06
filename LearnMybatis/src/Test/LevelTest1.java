package Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.naming.InitialContext;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import pojo.Level;
import sqlMap.level;

public class LevelTest1 {

	String resource;
	InputStream inputStream;
	SqlSessionFactory sqlSessionFactory;
	SqlSession sqlSession;
	@Before
	public void InitialContext() throws IOException {
		//得到配置文件
		resource = "config/sqlMapConfig.xml";
		//得到文件的流
		inputStream = Resources.getResourceAsStream(resource);
		//创建会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//创建会话
		sqlSession = sqlSessionFactory.openSession();
	}
	@Test
	public void findOne() throws IOException {
		level level = sqlSession.getMapper(level.class);
		Level level2 = level.getLevel(1);
		System.out.println(level2);
//		//查找一条记录
//		Level level = sqlSession.selectOne("test.getLevel",1);
//		System.out.println(level);
//		Level level2 = sqlSession.selectOne("test.getLevel",1);
//		System.out.println(level2);
//		System.out.println(level == level2);
	}
//	@Test
//	public void findAll() throws IOException {
//		//查找一条记录
//		List<Level> levels = sqlSession.selectList("test.getLevels","%员%");
//		System.out.println(levels);
//	}
//	@Test
//	public void deleteOne() throws IOException {
//		//查找一条记录
//		sqlSession.delete("test.deleteOne");
//	}
//	@Test
//	public void insertOne() throws IOException {
//		//插入两条记录、返回结果为影响的行数
//		System.out.println(sqlSession.insert("test.insertTwo"));
//		sqlSession.commit();
//	}
}
