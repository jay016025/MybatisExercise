package idv.jay.persistent.dao_impl;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import idv.jay.persistent.Vo.Emp2;
import idv.jay.persistent.dao.Emp2_DAO;
import idv.jay.persistent.util.Mybatis_dataSource;

/**
 * 員工dao介面實作
 * @author User
 * date: 2020.5.26
 */
public class Emp2_dao_impl extends SqlSessionDaoSupport implements Emp2_DAO{

	@Override
	public Emp2 findEmpById(int id) {
//		通過繼承SqlSessionDaoSupport父類別(spring-mybatis整合包的class)取得session
//		SqlSession session = Mybatis_dataSource.getResource().openSession();
		SqlSession session = getSqlSession();
		Emp2 emp = session.selectOne("testMybatis.EMP2.findEMP2ById", id);
		
//		通過spring管理，方法結束將自動關閉資源，因此不須close
//		session.close();
		return emp;
	}

	@Override
	public void insertEmp(Emp2 emp) {
		SqlSession session = Mybatis_dataSource.getResource().openSession();
		session.insert("testMybatis.EMP2.insertEmp2", emp);
		session.commit();
		session.close();
	}

	@Override
	public void deleteEmp(int id) {
		SqlSession session = Mybatis_dataSource.getResource().openSession();
		session.delete("testMybatis.EMP2.deleteEmp", id);
		session.commit();
		session.close();
	}

}
