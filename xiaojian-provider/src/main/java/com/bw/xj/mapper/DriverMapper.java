package com.bw.xj.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.bw.xj.entity.Area;
import com.bw.xj.entity.Driver;

@Mapper
public interface DriverMapper {
	/** 
	 * @Title: getList 
	 * @Description: 列表展示
	 * @return
	 * @return: List<Map>
	 */
	List<Map> getList(@Param("name")String name);
	
	/** 
	 * @Title: createDri 
	 * @Description: 添加
	 * @param driver
	 * @return
	 * @return: int
	 */
	int createDri(Driver driver);
	
	/** 
	 * @Title: deleteDri 
	 * @Description: 删除
	 * @param id
	 * @return
	 * @return: int
	 */
	@Delete("delete from zk_driver where id = #{id}")
	int deleteDri(Integer id);
	
	
	/** 
	 * @Title: updateDri 
	 * @Description: 删除
	 * @param driver
	 * @return
	 * @return: int
	 */
	int updateDri(Driver driver);
	
	
	/** 
	 * @Title: getListByid 
	 * @Description: 查询地区表
	 * @param parentid
	 * @return
	 * @return: List<Area>
	 */
	@Select("select * from zk_area where parentid = #{value}")
	@ResultType(Area.class)
	List<Area> getListByparentid(int parentid);
	
	/** 
	 * @Title: getListByid 
	 * @Description: 根据id查找
	 * @param id
	 * @return
	 * @return: List<Driver>
	 */
	@Select("select * from zk_driver where id = #{value}")
	@ResultType(Driver.class)
	Driver getListByid(int id);
	/** 
	 * @Title: getListByid 
	 * @Description: 根据id查找
	 * @param id
	 * @return
	 * @return: List<Driver>
	 */
	@Select("select * from zk_driver where name like '%${value}%'")
	@ResultType(Driver.class)
	List<Driver> getListByname(String name);
	
}
