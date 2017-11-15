package cn.uc.yiqibang.utils;


import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	
	
	 //懒汉模式
	 
	
	private static String resource = "config.xml";
	private static SqlSessionFactory factory =null;
	
	
	 //定义方法，获取应用唯一的factory对象
	
	
	
	public static SqlSessionFactory getFactory(){
		if(factory == null){			
			InputStream is = MyBatisUtils.class.getClassLoader().getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(is);
		}
		return factory;
	}
	
	
	 //通过调用方法getFactory打开一个SqlSession会话对象
	
    public static SqlSession openSession(){
		return getFactory().openSession();
	}
}
