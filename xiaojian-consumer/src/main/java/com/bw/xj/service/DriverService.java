package com.bw.xj.service;

import java.util.List;
import java.util.Map;



import com.bw.xj.entity.Area;
import com.bw.xj.entity.Driver;
import com.github.pagehelper.PageInfo;

public interface DriverService {
	/** 
	 * @Title: getList 
	 * @Description: 列表展示
	 * @return
	 * @return: List<Map>
	 */
	PageInfo<Map> getList(Integer pageSize,Integer pageNum,String name);
	
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
	List<Area> getListByparentid(int parentid);
	
	/** 
	 * @Title: getListByid 
	 * @Description: 根据id查找
	 * @param id
	 * @return
	 * @return: Driver
	 */
	Driver getListByid(int id);
	/** 
	 * @Title: getListByid 
	 * @Description: 根据id查找
	 * @param id
	 * @return
	 * @return: List<Driver>
	 */
	List<Driver> getListByname(String name);
}
