package com.tobias.bodyForming.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.tobias.bodyForming.Domain.JsonViews;
import com.tobias.bodyForming.Domain.TrainerUser;
import com.tobias.bodyForming.service.DefaultTrainerUserService;

@RestController
@RequestMapping("/api/trainerUsers")
public class RestTrainerUserController {
	
	private final DefaultTrainerUserService trainerUserService;
    
    @Autowired
    public RestTrainerUserController( DefaultTrainerUserService trainerUserService ) {
        this.trainerUserService = trainerUserService;
    }
    
    @GetMapping
    @JsonView(JsonViews.Public.class)
    public List<TrainerUser> retrieveAllUsers() {
        return this.trainerUserService.findAll();
    }
    
    @GetMapping("/{id}")
    @JsonView(JsonViews.Public.class)
    public TrainerUser retrieveUser( @PathVariable Long id ) {
        return this.trainerUserService.findById( id );
    }
    
    @JsonView(JsonViews.Public.class)
    @RequestMapping(value = "/search", params = "query", method = GET)
    @ResponseBody
    public List<TrainerUser> retrieveSearchedRestaurants( @RequestParam("query") String query ) {
        return trainerUserService.findByLastNameIgnoreCaseContainingOrFirstNameIgnoreCaseContaining(query, query);
    }
    
    @PostMapping("/sign_in")
    @JsonView(JsonViews.Public.class)
    public TrainerUser signInTrainerUser (@RequestBody Map<String, String> credentials) {
    	System.out.println(credentials);
    	TrainerUser tUser = this.trainerUserService.findByEmail(credentials.get("email"));
    	System.out.println(credentials.get("password"));
    	System.out.println(tUser.getPassword());
    	System.out.println(tUser.getPassword() == credentials.get("password"));
    	if(tUser.getPassword().equals(credentials.get("password")))
    		return tUser;
    	else return null;
    }
    
//    //update User anonymous
//    @PutMapping("/{id}")
//    @ResponseStatus(NO_CONTENT)
//    public void updateUser( @RequestBody Map<String, String> json, @PathVariable Long id ) {
//        this.userService.updateUserById( json.get( "first_name" ), json.get( "last_name" ), id );
//    }
    
//    @PostMapping("/sign_up")
//    public HttpEntity<Void> createUser( @RequestBody User postedUser ) {
//        User savedUser = this.userService.save( postedUser );
//        
//        UriComponents uriComponents = fromMethodCall( on( getClass() ).retrieveUser( savedUser.getId() ) ).build();
//        
//        return ResponseEntity.created( uriComponents.encode().toUri() ).build();
//    }
}
