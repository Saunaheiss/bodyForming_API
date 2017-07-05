package com.tobias.bodyForming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tobias.bodyForming.Domain.Reviews;
import com.tobias.bodyForming.repository.ReviewsRepository;

public class DefaultReviewsService implements ReviewsService {
	
	private final ReviewsRepository repository;
    
    @Autowired
    public DefaultReviewsService( ReviewsRepository repository ) {
        this.repository = repository;
    }
    
    @Override
    public void deleteReviews( Long id ) {
        this.repository.deleteById( id );
    }
    
    @Override
    public Reviews saveReviews( Reviews reviews ) {
        return this.repository.save( reviews );
    }
    
//    @Override
//    public void updateReview( String text, Integer rating, Long id ) {
//        this.repository.updateReviewById( text, rating, id );
//        
//    }
    
    @Override
    public List<Reviews> findAll() {
        return repository.findAll();
    }
    
    @Override
    public Reviews findById( Long id ) {
        return repository.findById( id );
    }
}
