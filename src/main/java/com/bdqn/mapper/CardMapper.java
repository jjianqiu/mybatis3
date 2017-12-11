package com.bdqn.mapper;

import com.bdqn.bean.Card;

public interface CardMapper {
    
    	Card selectByPeopleId(String peopleId);
}
