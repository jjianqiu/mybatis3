package com.bdqn.bean;

public class People {
    	
    private Integer peopleId ;
    
    private String peopleName;
    
    private Card card;

    public Integer getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(Integer peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
	return "People [peopleId=" + peopleId + ", peopleName=" + peopleName + ", card=" + card + "]";
    }
    
    
    
}
