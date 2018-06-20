package com.autentia.trainning.soa.rest.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Team {
	
	private Integer id;
	private String name;
	private String stadium;
	private String city;
	
	public Team(Integer id, String name,  String city, String stadium){		
		super();
		this.id = id;		
		this.name = name;
		this.stadium = stadium;
		this.city = city;
	}

	@JsonProperty(required = true)
	public Integer getId() {
		return id;
	}

	@JsonProperty(required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty(required = true)
	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	@JsonProperty(required = true)
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

}
