package testMybatisDAO;

import java.io.IOException;
import java.sql.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import idv.jay.persistent.Vo.Emp2;

/**
 * 測試emp2 DAO method
 * @author User
 * date 2020-05-23
 */
public class TestEmp2Base {

	private final String RESOURCE_NAME = "SqlMapConfig.xml";
	
	/**
	 * 根據員工編號查詢員工
	 */
	@Test
	public void findEMP2ByIdTest() {
//		創建session工廠
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
//		通過SqlSessionFactory取得SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		/*
		 * 通過sqlSession跟資料庫進行溝通
		 * 第一個參數:mapper.xml中statementId，等於namespace.statementId
		 * 第二個參數:放入和mapper.xml中和parameterType匹配的參數
		 * selectOne回傳結果是mapper.xml中resultType的物件
		 */
		Emp2 emp = sqlSession.selectOne("testMybatis.EMP2.findEMP2ById", 7001);
		System.out.println(emp);
		
//		須關閉資源
		sqlSession.close();
	}
	
	/**
	 * 根據員工姓名模糊查詢員工
	 */
	@Test
	public void findEMP2ByName() {
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSession sqlSession = sqlSessionFactory.openSession();
		java.util.List<Emp2> emps = sqlSession.selectList("testMybatis.EMP2.findEMP2ByName", "S");
		System.out.println(emps);
		sqlSession.close();
	}
	
	/**
	 * 新增員工
	 */
	@Test
	public void insertEmp2() {
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Emp2 emp = new Emp2();
		emp.setEname("jay2");
		emp.setComm(100.4);
		emp.setJob("工程師");
		emp.setSal(100.5);
		emp.setHiredate(Date.valueOf("2020-05-23"));
		emp.setDeptno(10);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert("testMybatis.EMP2.insertEmp2", emp);
//		印出自增主鍵
		System.out.println(emp.getEmpno());
//		需要自己commit， 預設autoCommit = false
		sqlSession.commit();
		sqlSession.close();
	}
	
	/**
	 * 根據員工編號刪除員工
	 */
	@Test
	public void deleteEmp() {
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.delete("testMybatis.EMP2.deleteEmp", new Integer(7017));
		sqlSession.commit();
		sqlSession.close();
	}
	
	/**
	 * 根據員工編號更改員工資訊
	 */
	@Test
	public void updateEmp() {
		SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Emp2 emp = new Emp2();
		emp.setEmpno(7015);
		emp.setEname("jay2");
		emp.setComm(100.4);
		emp.setJob("工程師");
		emp.setSal(100.5);
		emp.setHiredate(Date.valueOf("2020-05-23"));
		emp.setDeptno(10);
		
		sqlSession.update("testMybatis.EMP2.updateEmp", emp);
		sqlSession.commit();
		sqlSession.close();
	}
}
