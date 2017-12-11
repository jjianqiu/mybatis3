package com.bdqn.bean;

public class Card {
    
    private String cardId;
    
    private String address;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
	return "Card [cardId=" + cardId + ", address=" + address + "]";
    }
    
    
    
    
    
}
