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
		//�õ������ļ�
		resource = "config/sqlMapConfig.xml";
		//�õ��ļ�����
		inputStream = Resources.getResourceAsStream(resource);
		//�����Ự����
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//�����Ự
		sqlSession = sqlSessionFactory.openSession();
	}
	@Test
	public void findOne() throws IOException {
		level level = sqlSession.getMapper(level.class);
		Level level2 = level.getLevel(1);
		System.out.println(level2);
//		//����һ����¼
//		Level level = sqlSession.selectOne("test.getLevel",1);
//		System.out.println(level);
//		Level level2 = sqlSession.selectOne("test.getLevel",1);
//		System.out.println(level2);
//		System.out.println(level == level2);
	}
//	@Test
//	public void findAll() throws IOException {
//		//����һ����¼
//		List<Level> levels = sqlSession.selectList("test.getLevels","%Ա%");
//		System.out.println(levels);
//	}
//	@Test
//	public void deleteOne() throws IOException {
//		//����һ����¼
//		sqlSession.delete("test.deleteOne");
//	}
//	@Test
//	public void insertOne() throws IOException {
//		//����������¼�����ؽ��ΪӰ�������
//		System.out.println(sqlSession.insert("test.insertTwo"));
//		sqlSession.commit();
//	}
}
