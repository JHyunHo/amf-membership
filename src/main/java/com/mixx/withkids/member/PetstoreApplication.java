package com.mixx.withkids.member;

import com.mixx.withkids.member.domain.Category;
import com.mixx.withkids.member.domain.Member;
import com.mixx.withkids.member.domain.Repository;
import com.mixx.withkids.member.domain.Area;
import com.mixx.withkids.member.domain.Place;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MemberApplication {

	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext(){
		return applicationContext;
	}

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(MemberApplication.class, args);
		Repository repository = applicationContext.getBean(Repository.class);

		Member member = new Member();
		member.setPasswd("123456");
		member.setName("정현호");
		member.setCategory(Category.야구장);
		member.setArea(Area.서울특별시);
		member.setPlace(Place.실외);
		repository.save(member);

		System.out.println(member.toString());
	}

}
