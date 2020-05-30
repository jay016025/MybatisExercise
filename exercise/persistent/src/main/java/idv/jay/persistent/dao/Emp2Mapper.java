package idv.jay.persistent.dao;

import idv.jay.persistent.Vo.Emp2;

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
	 * 新增員工
	 * @param emp
	 */
	void insertEmp(Emp2 emp);
	
	/**
	 * 刪除員工
	 * @param id
	 */
	void deleteEmp(int id);
}
