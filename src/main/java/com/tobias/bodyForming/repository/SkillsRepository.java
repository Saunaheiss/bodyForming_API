package com.tobias.bodyForming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tobias.bodyForming.Domain.Skills;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long>{
	 Skills findById( Long id );
	    
//	 Skills findByRating( Integer rate );
	    
	 void deleteById( Long id );
	    
	 Skills save( Skills skills);
	    
//    @Modifying
//    @Query("update skills u set u.text = ?1, u.rating = ?2 where u.id = ?3")
//    void updateReviewById( String text, Integer rating, Long reviewId );
}
