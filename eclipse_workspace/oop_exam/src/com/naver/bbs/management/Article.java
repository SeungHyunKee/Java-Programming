package com.naver.bbs.management;

//다른패키지에 있는 클래스를 사용하려면, 어떤패키지에 있는지 살펴봐야함
import com.naver.member.management.Member;

public class Article {

	public static void main(String[] args) {
		
		Member member = new Member("ID", "관리자");
		
		//데이터를 가져오는 getter
		String id = member.getId();
		String name = member.getName();
		
		System.out.println(id);
		System.out.println(name);
		
		//데이터를 넣는 setter
		member.setId("changed_id");
		member.setName("일반사용자");
		
		id = member.getId();
		name = member.getName();
		
		System.out.println(id);
		System.out.println(name);
//		System.out.println(member.id); 
//		System.out.println(member.name);

	}
}
