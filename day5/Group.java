package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("-������ȸ-");

			System.out.println("�л��̸� :");
			String name = sc.next();

			System.out.println("���� :");
			int score = sc.nextInt();

			Student student1 = new Student();
			student1.setName(name);
			student1.setScore(score);
			arr[i] = student1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" �̸� :" + arr[i].getName() + " ���� :" + arr[i].getScore());
		}
	}
}
