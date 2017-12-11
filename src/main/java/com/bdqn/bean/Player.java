package com.bdqn.bean;

public class Player {

    	private Integer playerId;
    	
    	private String playerName;

	public Integer getPlayerId() {
	    return playerId;
	}

	public void setPlayerId(Integer playerId) {
	    this.playerId = playerId;
	}

	public String getPlayerName() {
	    return playerName;
	}

	public void setPlayerName(String playerName) {
	    this.playerName = playerName;
	}

	@Override
	public String toString() {
	    return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
    	
    	
    	
}
