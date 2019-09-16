package com.bw.xj;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @ClassName: BootStart 
 * @Description: TODO
 * @author: 
 * @date: 2019年9月9日 上午9:15:21
 */
public class BootStart {
	//启动生产者
  private  static Logger log = Logger.getLogger(BootStart.class);
    
	   public static void main(String[] args) throws IOException {
		    /*Logger log = Logger.getLogger(BootStart.class);*/
		    log.info("启动中......");		    
		 new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		   log.info("启动成功 OK ok !");   
		   
		   System.in.read();
		    
		    
		  
		
	}

}
