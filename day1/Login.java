package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID�Է�");
		String id = sc.next();

		System.out.println("PW�Է�");
		String pw = sc.next();

		final String WRONG ="�� Ʋ���ϴ�";
		String result = "";

		
		if (id.equals("kim") && pw.equals("1")) {
			result = "�α��μ���";
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
