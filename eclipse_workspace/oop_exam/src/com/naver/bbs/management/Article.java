package com.naver.bbs.management;

//�ٸ���Ű���� �ִ� Ŭ������ ����Ϸ���, ���Ű���� �ִ��� ���������
import com.naver.member.management.Member;

public class Article {

	public static void main(String[] args) {
		
		Member member = new Member("ID", "������");
		
		//�����͸� �������� getter
		String id = member.getId();
		String name = member.getName();
		
		System.out.println(id);
		System.out.println(name);
		
		//�����͸� �ִ� setter
		member.setId("changed_id");
		member.setName("�Ϲݻ����");
		
		id = member.getId();
		name = member.getName();
		
		System.out.println(id);
		System.out.println(name);
//		System.out.println(member.id); 
//		System.out.println(member.name);

	}
}
