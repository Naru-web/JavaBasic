package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID입력");
		String id = sc.next();

		System.out.println("PW입력");
		String pw = sc.next();

		final String WRONG ="가 틀립니다";
		String result = "";

		
		if (id.equals("kim") && pw.equals("1")) {
			result = "로그인성공";
		} else if (!id.equals("kim") && pw.equals("1")) {
			result = "ID" + WRONG;
		} else if (id.equals("kim") && !pw.equals("1")) {
			result = "PW" + WRONG;
		} else {
			result = "ID/PW"+ WRONG;
		}

		System.out.println(result);

	}

}
