package com.tobias.bodyForming.service;

import java.util.List;

import com.tobias.bodyForming.Domain.Reviews;

public interface ReviewsService {
	
	void deleteReviews( Long id );
    
    Reviews saveReviews( Reviews reviews );
    
//    void updateReview( String text, Integer rating, Long id );
    
    List<Reviews> findAll();
    
    Reviews findById( Long id );
}
