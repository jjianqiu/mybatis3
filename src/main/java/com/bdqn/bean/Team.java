package com.bdqn.bean;

import java.io.Serializable;
import java.util.List;

public class Team implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */

    private Integer teamId;
    
    private String teamName;
    
    private Double teamMoney;
    
    private List<Player> plays;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Double getTeamMoney() {
        return teamMoney;
    }

    public void setTeamMoney(Double teamMoney) {
        this.teamMoney = teamMoney;
    }

    
    public List<Player> getPlays() {
        return plays;
    }

    public void setPlays(List<Player> plays) {
        this.plays = plays;
    }

    @Override
    public String toString() {
	return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamMoney=" + teamMoney + ", plays=" + plays
		+ "]";
    }

}
