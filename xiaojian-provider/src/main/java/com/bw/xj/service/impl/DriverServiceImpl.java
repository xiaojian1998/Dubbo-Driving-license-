package com.bw.xj.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.bw.xj.entity.Area;
import com.bw.xj.entity.Driver;
import com.bw.xj.mapper.DriverMapper;
import com.bw.xj.service.DriverService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service(interfaceClass=DriverService.class)
public class DriverServiceImpl implements DriverService{
	@Autowired
	private DriverMapper driverMapper;
	/* (non Javadoc) 
	 * @Title: getList
	 * @Description: 列表
	 * @param pageSize
	 * @param pageNum
	 * @param name
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#getList(java.lang.Integer, java.lang.Integer, java.lang.String) 
	 */
	@Override
	public PageInfo<Map> getList(Integer pageSize, Integer pageNum, String name) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Map> list = driverMapper.getList(name);
		PageInfo<Map> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}

	/* (non Javadoc) 
	 * @Title: createDri
	 * @Description: 添加
	 * @param driver
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#createDri(com.diaoruifeng.entity.Driver) 
	 */
	@Override
	public int createDri(Driver driver) {
		// TODO Auto-generated method stub
		return driverMapper.createDri(driver);
	}

	/* (non Javadoc) 
	 * @Title: deleteDri
	 * @Description: 删除
	 * @param id
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#deleteDri(java.lang.Integer) 
	 */
	@Override
	public int deleteDri(Integer id) {
		// TODO Auto-generated method stub
		return driverMapper.deleteDri(id);
	}

	/* (non Javadoc) 
	 * @Title: updateDri
	 * @Description: 修改
	 * @param driver
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#updateDri(com.diaoruifeng.entity.Driver) 
	 */
	@Override
	public int updateDri(Driver driver) {
		// TODO Auto-generated method stub
		return driverMapper.updateDri(driver);
	}

	/* (non Javadoc) 
	 * @Title: getListByparentid
	 * @Description: 地区数据
	 * @param parentid
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#getListByparentid(int) 
	 */
	@Override
	public List<Area> getListByparentid(int parentid) {
		// TODO Auto-generated method stub
		System.out.println("aaaasss+123132131211"+parentid);
		List<Area> listByparentid = driverMapper.getListByparentid(parentid);
		return listByparentid;
	}

	/* (non Javadoc) 
	 * @Title: getListByid
	 * @Description: 根据id查找
	 * @param id
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#getListByid(int) 
	 */
	@Override
	public Driver getListByid(int id) {
		// TODO Auto-generated method stub
		Driver listByid = driverMapper.getListByid(id);
		
		return listByid;
	}

	/* (non Javadoc) 
	 * @Title: getListByname
	 * @Description: 根
	 * @param name
	 * @return 
	 * @see com.diaoruifeng.service.DriverService#getListByname(java.lang.String) 
	 */
	@Override
	public List<Driver> getListByname(String name) {
		// TODO Auto-generated method stub
	 List<Driver> listByname = driverMapper.getListByname(name);
		
		return listByname;
	}


}
