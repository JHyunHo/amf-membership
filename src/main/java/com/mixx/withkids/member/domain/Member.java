package com.mixx.withkids.member.domain;

import javax.persistence.*;

@Entity
public class Member {

	@Id @GeneratedValue
	Long id;
	String passwd;
	String name;
	Category category;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

    public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}


    public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@Override
	public String toString() {
	 	return "id = " + id + " & passwd = " + passwd + " & name = " + name + " & category = " + category;
	}