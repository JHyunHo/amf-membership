package com.mixx.withkids.member.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.mixx.withkids.member.MemberApplication;

@Entity
public class Member {

	@Id 
	String userid;
	String passwd;
	String name;
	Category category;
    Area area;
    Place place;



	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

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

	public void save(){
		Repository repository = MemberApplication.getApplicationContext().getBean(Repository.class);
		repository.save(this);
	}



	@Override
	public String toString() {
	 	return "id = " + userid + " & passwd = " + passwd + " & name = " + name + " & category = " + category + " & area = " + area + " & place = " + place;
	}
}