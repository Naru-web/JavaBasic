package day4;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Է�"); // �̸���� ���ϵ�� ���̵��

		System.out.println("�̸���� :");
		String name = sc.next();

		System.out.println("e-mail ��� : ");
		String email = sc.next();

		System.out.println("���� �Է�:");
		int age = sc.nextInt();

		System.out.println("����������\n  "
				+ "�̸� : " + name + "  "
				+ "e-mail : " + email 
				+ " ���� : " + age);

		Member m = new Member();
		m.setName(name);
		m.setEmail(email);
		m.setAge(age);

		System.out.println("���������\n "
				+ " �̸� : " + m.getName() 
		        + "  e-mail : " + m.getEmail() 
		        + " ���� : " + m.getAge());

	}
	

}
