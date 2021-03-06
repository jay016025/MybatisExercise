package mybatis_generator.dao;

import java.util.List;
import mybatis_generator.pojo.Dept2;
import mybatis_generator.pojo.Dept2Example;
import org.apache.ibatis.annotations.Param;

public interface Dept2Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    long countByExample(Dept2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int deleteByExample(Dept2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Short DEPTNO);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int insert(Dept2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int insertSelective(Dept2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    List<Dept2> selectByExample(Dept2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    Dept2 selectByPrimaryKey(Short DEPTNO);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") Dept2 record, @Param("example") Dept2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int updateByExample(@Param("record") Dept2 record, @Param("example") Dept2Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(Dept2 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DA104.DEPT2
     *
     * @mbg.generated Sun Jul 05 19:22:58 GMT+08:00 2020
     */
    int updateByPrimaryKey(Dept2 record);
}