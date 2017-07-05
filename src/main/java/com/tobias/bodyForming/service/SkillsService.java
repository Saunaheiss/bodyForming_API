package com.tobias.bodyForming.service;

import java.util.List;

import com.tobias.bodyForming.Domain.Skills;

public interface SkillsService {
	
	void deleteSkills( Long id );
    
    Skills saveSkills( Skills skills);
    
//    void updateReview( String text, Integer rating, Long id );
    
    List<Skills> findAll();
    
    Skills findById( Long id );
}
