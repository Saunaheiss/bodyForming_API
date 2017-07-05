package com.tobias.bodyForming.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.tobias.bodyForming.Domain.JsonViews;
import com.tobias.bodyForming.Domain.Skills;
import com.tobias.bodyForming.service.DefaultSkillsService;

@RestController
@RequestMapping("/api/skills")
public class RestSkillsController {
	
	private final DefaultSkillsService skillsService;
    
    @Autowired
    public RestSkillsController( DefaultSkillsService skillsService ) {
        this.skillsService = skillsService;
    }
    
    // update
    // delete
    // save
    @JsonView(JsonViews.Public.class)
    @GetMapping
    public List<Skills> retrieveAllSkills() {
        return this.skillsService.findAll();
    }

    @JsonView(JsonViews.Detail.class)
    @GetMapping("/{id}")
    public Skills retrieveSkills( @PathVariable Long id ) {
        return this.skillsService.findById( id );
    }
}
