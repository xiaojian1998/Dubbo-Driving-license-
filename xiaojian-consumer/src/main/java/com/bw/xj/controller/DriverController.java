package com.bw.xj.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bw.xj.entity.Area;
import com.bw.xj.entity.Driver;
import com.bw.xj.service.DriverService;
import com.github.pagehelper.PageInfo;

@Controller
public class DriverController {
	@Reference
	private DriverService driverService;
	/** 
	 * @Title: getList 
	 * @Description: 列表
	 * @param pageSize
	 * @param pageNum
	 * @param name
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("/")
	public String aaaaaadd() {
		
		
		return "test";
		
	}
	@RequestMapping("list")
	public String getList(@RequestParam(defaultValue="3")Integer pageSize,
			@RequestParam(defaultValue="1")	Integer pageNum,
			@RequestParam(defaultValue="")String name,
			Model model) {
		
		PageInfo<Map> list = driverService.getList(pageSize, pageNum, name);
		model.addAttribute("list", list);
		return "list";
	}
	
	/** 
	 * @Title: deleteOne 
	 * @Description: 删除
	 * @param id
	 * @return
	 * @return: boolean
	 */
	@RequestMapping("deleteOne")
	@ResponseBody
	public boolean deleteOne(Integer id) {
		
		int i = driverService.deleteDri(id);
		return i>0;
		
	}
	/** 
	 * @Title: toadd 
	 * @Description: 去添加页面
	 * @return
	 * @return: String
	 */
	@RequestMapping("toadd")
	public String toadd() {
		
		
		return "add";
		
	}
	/** 
	 * @Title: toupdate 
	 * @Description: 去修改页面
	 * @param id
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("toupdate")
	public String toupdate(Integer id,Model model,HttpServletRequest request) {
		
		Driver listByid = driverService.getListByid(id);
		System.out.println(listByid);
		request.setAttribute("zzzz", listByid);
		return "update";
		
	}
	/** 
	 * @Title: getlist 
	 * @Description: 根据name获取
	 * @param name
	 * @param model
	 * @return
	 * @return: String
	 */
	@RequestMapping("getlist")
	public String getlist(String name,Model model) {
		
		List<Driver> listByname = driverService.getListByname(name);
		model.addAttribute("list", listByname);
		return "list";
		
	}
	/** 
	 * @Title: getarea 
	 * @Description: 获得地区数据
	 * @param parentid
	 * @return
	 * @return: List<Area>
	 */
	@RequestMapping("getarea")
	@ResponseBody
	public List<Area> getarea(Integer parentid) {
		
		List<Area> listByparentid = driverService.getListByparentid(parentid);
		return listByparentid;
		
	}
	/** 
	 * @Title: add 
	 * @Description: 添加
	 * @param driver
	 * @return
	 * @return: boolean
	 */
	@RequestMapping("add")
	@ResponseBody
	public boolean add(Driver driver)  {
		
		int dri = driverService.createDri(driver);
		return  dri>0;
		
	}
	/** 
	 * @Title: update 
	 * @Description: 修改
	 * @param driver
	 * @return
	 * @return: boolean
	 */
	@RequestMapping("update")
	@ResponseBody
	public boolean update(Driver driver)  {
		
		int dri = driverService.updateDri(driver);
		return  dri>0;
		
	}
	
	
	
}
