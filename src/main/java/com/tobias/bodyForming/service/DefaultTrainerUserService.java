package com.tobias.bodyForming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tobias.bodyForming.Domain.TrainerUser;
import com.tobias.bodyForming.repository.TrainerUserRepository;


public class DefaultTrainerUserService implements TrainerUserService {

	//field:
    private final TrainerUserRepository trainerUserRepository;
    
    @Autowired
    //constructor:
    public DefaultTrainerUserService(TrainerUserRepository trainerUserRepository) {
		this.trainerUserRepository = trainerUserRepository;
	}
    
    //METHODS:
    @Override
    public TrainerUser save( TrainerUser trainerUser ) {
        return this.trainerUserRepository.save( trainerUser );
    }
    
    @Override
    public TrainerUser findByFirstName( String firstName ) {
        return this.trainerUserRepository.findByFirstName( firstName );
    }
    
//    @Override
//    public void updateUserById( String firstName, String lastName, Long Id ) {
//        this.userRepository.updateUserById( firstName, lastName, Id );
//    }
    
    @Override
    public List<TrainerUser> findAll() {
        return this.trainerUserRepository.findAll();
    }
    
    @Override
    public TrainerUser findById( Long id ) {
//        User user = this.userRepository.findById( id );
        
//        if ( user == null ) {
//            throw new UserNotFoundException( "Could not find User with ID [" + id + "]" );
//        }
        return this.trainerUserRepository.findById( id );
    }
    
//    @Override
//    public User anonymousUserById( Long id ) {
//        User user = this.userRepository.findById( id );
//        user.setFirstName( "Anonymous" );
//        user.setLastName( "Anonymous" );
//        return this.userRepository.save( user );
//    }
    
    @Override
    public TrainerUser findByEmail( String email ) {
        return this.trainerUserRepository.findByEmail( email );
    }

}
