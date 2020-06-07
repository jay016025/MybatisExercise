package idv.jay.persistent.dao;

import java.util.List;
import java.util.Map;

import idv.jay.persistent.Vo.Emp2;
import idv.jay.persistent.Vo.EmpExtend;

/**
 * 員工 mapper代理 interface
 * @author User
 * date: 2020/5/28
 */
public interface Emp2Mapper {
	
	/**
	 * 根據id查詢員工
	 * @param id
	 * @return
	 */
	Emp2 findEmpById(int id);
	
	/**
	 * 根據id查詢員工使用resultMap
	 * @param id
	 * @return
	 */
	Emp2 findEmpByIdResultMap(int id);
	
	/**
	 * 新增員工
	 * @param emp
	 */
	void insertEmp(Emp2 emp);
	
	/**
	 * 刪除員工
	 * @param id
	 */
	void deleteEmp(int id);
	
	/**
	 * 使用動態sql做多條件查詢
	 * @param emp
	 * @return
	 */
	List<Emp2> findEmpByNameAndDep(Emp2 emp);
	
	/**
	 * 使用foreach標籤做多id查詢
	 * @param nos
	 * @return
	 */
	List<Emp2> findEmpsById(Map<String, List<Integer>> para);
	
	/*
	 * mybatis高級映射
	 */
	/**
	 * 高級映射，員工、部門一對一查詢
	 * @return
	 */
	List<EmpExtend> findEmpDept();
	
	/**
	 * 高級映射，員工、部門一對一查詢使用resultMap
	 * @return
	 */
	List<Emp2> findEmpDeptResultMap();
}
