package day5;

import java.util.Scanner;

public class Group {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] arr = new Student[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("-성적조회-");

			System.out.println("학생이름 :");
			String name = sc.next();

			System.out.println("점수 :");
			int score = sc.nextInt();

			Student student1 = new Student();
			student1.setName(name);
			student1.setScore(score);
			arr[i] = student1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(" 이름 :" + arr[i].getName() + " 점수 :" + arr[i].getScore());
		}
	}
}
