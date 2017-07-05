package com.tobias.bodyForming.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.tobias.bodyForming.Domain.JsonViews;
import com.tobias.bodyForming.Domain.User;
import com.tobias.bodyForming.service.DefaultUserService;

@RestController
@RequestMapping("/api/users")
public class RestUserController {

	private final DefaultUserService userService;
    
    @Autowired
    public RestUserController( DefaultUserService userService ) {
        this.userService = userService;
    }
    
    @GetMapping
    @JsonView(JsonViews.Public.class)
    public List<User> retrieveAllUsers() {
        return this.userService.findAll();
    }
    
    @GetMapping("/{id}")
    @JsonView(JsonViews.Detail.class)
    public User retrieveUser( @PathVariable Long id ) {
        return this.userService.findById( id );
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
