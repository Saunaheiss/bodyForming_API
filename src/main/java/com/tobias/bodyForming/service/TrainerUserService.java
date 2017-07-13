package com.tobias.bodyForming.service;

import java.util.List;

import com.tobias.bodyForming.Domain.TrainerUser;



public interface TrainerUserService {
	TrainerUser save( TrainerUser trainerUser );
    
	TrainerUser findByFirstName( String firstName );
    
	TrainerUser findById( Long id );
    
    List<TrainerUser> findAll();
    
//    void updateUserById( String firstName, String lastName, Long Id );
    
//    User anonymousUserById( Long id );
    
    TrainerUser findByEmail( String email );
    
    List<TrainerUser> findByLastNameIgnoreCaseContainingOrFirstNameIgnoreCaseContaining( String lastName, String firstName );
}
