package com.tobias.bodyForming.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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
    @JsonView(JsonViews.Detail.class)
    public TrainerUser retrieveUser( @PathVariable Long id ) {
        return this.trainerUserService.findById( id );
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
