package idv.jay.persistent.dao;

import java.util.List;

import idv.jay.persistent.Vo.Dept2;

/**
 * 部門Mapper代理Interface
 * @author User
 * date: 2020.6.13
 */
public interface Dept2Mapper {
	
	/**
	 *	根據部門編號查詢部門
	 * @param id
	 * @return
	 */
	Dept2 findDeptById(Integer id);
	
	/**
	 * 查詢部門資訊關聯查詢員工資訊
	 * @return
	 */
	List<Dept2> findDeptAndEmp();
}
