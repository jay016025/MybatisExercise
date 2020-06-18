package testNativeMybatisDAO;

import java.util.List;

import org.junit.jupiter.api.Test;

import idv.jay.persistent.Vo.Dept2;
import idv.jay.persistent.dao.Dept2Mapper;
import idv.jay.persistent.util.Mybatis_dataSource;

public class TestDeptDao {
	
	@Test
	public void testFindDeptAndEmp() {
		List<Dept2> depts = Mybatis_dataSource.getResource().openSession()
			.getMapper(Dept2Mapper.class).findDeptAndEmp();
		
		System.out.println(depts);
	}
}
