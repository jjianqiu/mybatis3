package com.bdqn.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.People;
import com.bdqn.mapper.PeopleMapper;
import com.bdqn.util.SessionUtil;

public class TestPeople {

    @Test
    public void m1(){
	SqlSession session = SessionUtil.getSession();
	PeopleMapper mapper = session.getMapper(PeopleMapper.class);
	People p = mapper.selectByPeopleId("1");
	
	
    }
}
