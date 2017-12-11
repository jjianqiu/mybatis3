package com.bdqn.mapper;

import com.bdqn.bean.People;

public interface PeopleMapper {
    
    	People selectByPeopleId(String peopleId);
    	
    	People selectByPeople2(String peopleId);
}
