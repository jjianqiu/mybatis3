package com.bdqn.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionUtil {
    
    private static SqlSessionFactory factory = null;
    static {
	init();
    }
    private static void init() {
	InputStream in = null;
	
	try {
	    in = Resources.getResourceAsStream("mybatis.cfg.xml");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	//1. 创建会话的工厂
	factory = new SqlSessionFactoryBuilder().build(in);
    }
    //session
    public static SqlSession getSession() {
	if(factory != null) return factory.openSession();
	return null;
    }
    
    
    
}
