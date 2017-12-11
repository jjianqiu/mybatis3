package com.bdqn.mapper;

import java.util.List;

import com.bdqn.bean.Team;

public interface TeamMapper {
    List<Team> selectAll();
    
    int insert(Team team);
    
    List<Team> selectByIds(List<Integer> list);
    
    List<Team> selecTive(Team team);
    
    List<Team> selecTiveOne(Team team);
    
    int update(Team team);
    
    int update2(Team team);
}	
