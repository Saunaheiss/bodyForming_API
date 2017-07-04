package com.tobias.bodyForming.Domain;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Views for use with {@link JsonView @JsonView}.
 */
// why we need this interface for two further interfaces?
public interface JsonViews {

	//this is just for the Homepage and showing the list of restaurants.
	interface Public {
	}
	
	interface Detail {
	}
	
	interface NewUser {
		
	}
}
