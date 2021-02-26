package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가입정보입력"); // 이름등록 메일등록 나이등록

		System.out.println("이름등록 :");
		String name = sc.next();

		System.out.println("e-mail 등록 : ");
		String email = sc.next();

		System.out.println("나이 입력:");
		int age = sc.nextInt();

		System.out.println("가입정보ⓘ\n  "
				+ "이름 : " + name + "  "
				+ "e-mail : " + email 
				+ " 나이 : " + age);

		Member m = new Member();
		m.setName(name);
		m.setEmail(email);
		m.setAge(age);

		System.out.println("등록정보ⓘ\n "
				+ " 이름 : " + m.getName() 
		        + "  e-mail : " + m.getEmail() 
		        + " 나이 : " + m.getAge());

	}
	

}
