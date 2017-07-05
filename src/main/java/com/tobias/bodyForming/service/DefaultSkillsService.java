package com.tobias.bodyForming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tobias.bodyForming.Domain.Skills;
import com.tobias.bodyForming.repository.SkillsRepository;

public class DefaultSkillsService implements SkillsService {

private final SkillsRepository repository;
    
    @Autowired
    public DefaultSkillsService( SkillsRepository repository ) {
        this.repository = repository;
    }
    
    @Override
    public void deleteSkills( Long id ) {
        this.repository.deleteById( id );
    }
    
    @Override
    public Skills saveSkills( Skills skills ) {
        return this.repository.save( skills );
    }
    
//    @Override
//    public void updateReview( String text, Integer rating, Long id ) {
//        this.repository.updateReviewById( text, rating, id );
//        
//    }
    
    @Override
    public List<Skills> findAll() {
        return repository.findAll();
    }
    
    @Override
    public Skills findById( Long id ) {
        return repository.findById( id );
    }

}
