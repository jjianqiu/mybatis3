package com.bdqn.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.bdqn.bean.Team;
import com.bdqn.mapper.TeamMapper;
import com.bdqn.util.SessionUtil;

public class TestTeam {
    
    @Test
    public void m1() {
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	List<Team> list = mapper.selectAll();
	for (Team team : list) {
	    System.out.println(team);
	}
	session.close();
	
    }
    @Test
    public void m2() {
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	team.setTeamId(5);
	team.setTeamName("湖人");
	team.setTeamMoney(123.2);
	mapper.insert(team);
	session.commit();
	session.close();
	
    }
    
    @Test
    public void m3(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(3);
	list.add(5);
	List<Team> l = mapper.selectByIds(list);
	for (Team team : l) {
	    System.out.println(team);
	}
	session.commit();
	session.close();
    }
    
    @Test
    public void m4(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	//team.setTeamId(1);
	team.setTeamName("%南京%");
	team.setTeamMoney(2635.00);
	List<Team> l = mapper.selecTive(team);
	for (Team team2 : l) {
	    System.out.println(team2);
	}
	session.commit();
	session.close();
	// insert into team (team_id,team_money) values(?,?);
    }
    
    
    @Test
    public void m5(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	//team.setTeamId(1);
	team = null;
	
//	team.setTeamName("%南京%");
//	team.setTeamMoney(2635.00);
	List<Team> l = mapper.selecTive(team);
	for (Team team2 : l) {
	    System.out.println(team2);
	}
	session.commit();
	session.close();
    }
    
    
    @Test
    public void m6(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	team.setTeamId(1);
	team.setTeamName("北京");
	int row = mapper.update(team);
	session.commit();
	System.out.println(row + "+++++++");
	session.close();
    }
    
    
    @Test
    public void m7(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	team.setTeamId(1);
	team.setTeamName("北京1队");
	team.setTeamMoney(3330.00);
	int row = mapper.update2(team);
	session.commit();
	System.out.println(row + "+++++++");
	session.close();
    }
    
    
    @Test
    public void m8(){
	SqlSession session = SessionUtil.getSession();
	//获取mapper接口对应对象
	TeamMapper mapper = session.getMapper(TeamMapper.class);
	Team team = new Team();
	team.setTeamId(4);
//	team.setTeamName("南京");
	team.setTeamMoney(321.00);
	int row = mapper.insert(team);
	session.commit();
	System.out.println(row + "+++++++");
	session.close();
    }
    
    
    
    
}
