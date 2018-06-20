package com.autentia.trainning.soa.rest;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.autentia.trainning.soa.rest.bean.Team;
import com.autentia.trainning.soa.rest.service.TeamService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class TeamController {

		@Autowired
		TeamService teamService;
	 
	    @ApiOperation(value = "getTeamById", nickname = "Get a store by ID")
	    @RequestMapping(method = RequestMethod.GET, path="/teams/{id}", produces = "application/json")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success", response = Team.class),
	            @ApiResponse(code = 401, message = "Unauthorized"),
	            @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Failure")}) 
	    
	    public Team getTeamById (@PathVariable Integer id) {  	
	        return teamService.getTeamById(id);
	    }
	    
	    @ApiOperation(value = "getTeams", nickname = "Get a list with all stores")
	    @RequestMapping(method = RequestMethod.GET, path="/teams", produces = "application/json")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success"),
	            @ApiResponse(code = 401, message = "Unauthorized"),
	            @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Failure")}) 
	    
	    public Collection<Team> getStore() {  	
	        return teamService.getTeams();
	    }
	    
	    @ApiOperation(value = "deleteTeam", nickname = "Delete the name of a store")
	    @RequestMapping(method = RequestMethod.DELETE, path="/teams/{id}", produces = "application/json")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success"),
	            @ApiResponse(code = 401, message = "Unauthorized"),
	            @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Failure")}) 
	    
	    public Collection<Team> deleteTeam(@PathVariable Integer id) {  	
	        return teamService.deleteTeam(id);
	    }
	    
	    @ApiOperation(value = "updateTeam", nickname = "Update the name of a team")
	    @RequestMapping(method = RequestMethod.POST, path="/teams/{id}", produces = "application/json")
	    @ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success"),
	            @ApiResponse(code = 401, message = "Unauthorized"),
	            @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "Not Found"),
	            @ApiResponse(code = 500, message = "Failure")}) 
	    
	    public Collection<Team> updateStore(@PathVariable Integer id, 
	    							@RequestParam(value="name", defaultValue="New name") String name,
	    							@RequestParam(value="city", defaultValue="New city") String city,
	    							@RequestParam(value="stadium", defaultValue="New stadium") String stadium) {  	
	        return teamService.updateTeam(id, name, city, stadium);
	    }	
}
