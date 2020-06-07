package testNativeMybatisDAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

import idv.jay.persistent.Vo.Emp2;
import idv.jay.persistent.Vo.EmpExtend;
import idv.jay.persistent.dao.Emp2Mapper;
import idv.jay.persistent.dao.Emp2_DAO;
import idv.jay.persistent.dao_impl.Emp2_dao_impl;
import idv.jay.persistent.util.Mybatis_dataSource;

public class TestEmpDAO {
	
	@Test
	public void testEmpDAO() {
//		Emp2_DAO dao = new Emp2_dao_impl();
//		Emp2 emp = dao.findEmpById(7001);
//		System.out.println(emp);
		
		Emp2 emp = Mybatis_dataSource.getResource().openSession()
			.getMapper(Emp2Mapper.class).findEmpById(7001);
		
		System.out.println(emp);
	}
	
	@Test
	public void testResultMap() {
		Emp2 emp = Mybatis_dataSource.getResource().openSession()
			.getMapper(Emp2Mapper.class).findEmpByIdResultMap(7001);
		System.out.println(emp);
	}
	
	@Test
	public void testDynSql() {
		Emp2 para = new Emp2();
		para.setDeptno(10);
//		測試動態sql，不傳參數
//		para.setEname("K");
		
		List<Emp2> empList = Mybatis_dataSource.getResource().openSession()
				.getMapper(Emp2Mapper.class).findEmpByNameAndDep(para);
		System.out.println(empList);
	}
	
	@Test
	public void testForeach() {
		Map<String, List<Integer>> para = new HashMap<String, List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(7001);
		list.add(7002);
		para.put("nos", list);
		List<Emp2> emps = Mybatis_dataSource.getResource().openSession()
				.getMapper(Emp2Mapper.class).findEmpsById(para);
		System.out.println(emps);
	}
	
	@Test
	public void testFindEmpDeptno() {
		List<EmpExtend> list = Mybatis_dataSource.getResource().openSession()
				.getMapper(Emp2Mapper.class).findEmpDept();
		
		System.out.println(list);
	}
	
	@Test
	public void testFindEmpDeptResultMap() {
		List<Emp2> list = Mybatis_dataSource.getResource().openSession()
				.getMapper(Emp2Mapper.class).findEmpDeptResultMap();
		System.out.println(list);
	}
}
