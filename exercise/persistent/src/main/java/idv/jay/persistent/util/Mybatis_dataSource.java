package idv.jay.persistent.util;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 取得Mybatis dataSource
 * @author User
 * date: 2020.5.26
 */
public class Mybatis_dataSource {
	private final static String RESOURCE_NAME = "SqlMapConfig.xml";
	private static SqlSessionFactory sqlSessionFactory;
	
	static {
		try {
			sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(RESOURCE_NAME));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 取得SqlSessionFactory
	 * @return
	 */
	public static SqlSessionFactory getResource() {
		return Mybatis_dataSource.sqlSessionFactory;
	}
}
