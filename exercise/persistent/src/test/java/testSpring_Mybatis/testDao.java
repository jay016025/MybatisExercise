package testSpring_Mybatis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import idv.jay.persistent.Vo.Emp2;
import idv.jay.persistent.dao.Emp2Mapper;
import idv.jay.persistent.dao_impl.Emp2_dao_impl;

class testDao {
	
	private ApplicationContext applicationContext;
	
	@BeforeEach
	public void setUp() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:springConfig/applicationContext.xml");
	}

	@Test
	void testFindEmpById() {
		Emp2_dao_impl dao = (Emp2_dao_impl) applicationContext.getBean("empDao");
		Emp2 emp = dao.findEmpById(7001);
		System.out.println(emp);
	}
	@Test
	void testFindEmpByIdMapper() {
		Emp2Mapper dao = (Emp2Mapper) applicationContext.getBean("emp2Mapper");
		Emp2 emp = dao.findEmpById(7001);
		System.out.println(emp);
	}

}
