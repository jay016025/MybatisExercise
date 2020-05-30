package testNativeMybatisDAO;

import org.junit.jupiter.api.Test;

import idv.jay.persistent.Vo.Emp2;
import idv.jay.persistent.dao.Emp2_DAO;
import idv.jay.persistent.dao_impl.Emp2_dao_impl;

public class TestEmpDAO {
	
	@Test
	public void testEmpDAO() {
		Emp2_DAO dao = new Emp2_dao_impl();
		Emp2 emp = dao.findEmpById(7001);
		System.out.println(emp);
	}
}
