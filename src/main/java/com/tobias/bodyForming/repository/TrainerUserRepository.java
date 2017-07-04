package com.tobias.bodyForming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tobias.bodyForming.Domain.TrainerUser;

@Repository
public interface TrainerUserRepository extends JpaRepository<TrainerUser, Long> {
	
	 	@SuppressWarnings("unchecked")
		TrainerUser save( TrainerUser trainerUser );
	    
	 	TrainerUser findById( Long id );
	    
	 	TrainerUser findByEmail( String email );
	    
	 	TrainerUser findByFirstName( String firstName );
	    
	 	//further modifying -------------------------------------------------------------------------------------------------------------
//	    @Modifying
//	    @Query("update trainer_user u set u.firstName = ?1, u.lastName = ?2 where u.id = ?3")
//	    void updateUserById( String firstName, String lastName, Long Id );
	
}
