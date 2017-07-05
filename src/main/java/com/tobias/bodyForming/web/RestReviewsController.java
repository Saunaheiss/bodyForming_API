package com.tobias.bodyForming.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.tobias.bodyForming.Domain.JsonViews;
import com.tobias.bodyForming.Domain.Reviews;
import com.tobias.bodyForming.service.DefaultReviewsService;


@RestController
@RequestMapping("/api/reviews")
public class RestReviewsController {
	
	private final DefaultReviewsService reviewsService;
    
    @Autowired
    public RestReviewsController( DefaultReviewsService reviewsService ) {
        this.reviewsService = reviewsService;
    }
    
    // update
    // delete
    // save
    @JsonView(JsonViews.Public.class)
    @GetMapping
    public List<Reviews> retrieveAllReviews() {
        return this.reviewsService.findAll();
    }

    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Reviews retrieveReviews( @PathVariable Long id ) {
        return this.reviewsService.findById( id );
    }
}
