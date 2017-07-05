package com.tobias.bodyForming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tobias.bodyForming.Domain.Reviews;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Long>{

	Reviews findById( Long id );
	    
    Reviews findByRating( Integer rating );
    
    void deleteById( Long id );
    
    Reviews save( Reviews reviews );
    
//    @Modifying
//    @Query("update reviews u set u.text = ?1, u.rating = ?2 where u.id = ?3")
//    void updateReviewById( String text, Integer rating, Long reviewId );
}
