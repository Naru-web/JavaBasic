package day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("전화번호를 입력하세요");
		String ph = sc.nextLine();
		System.out.println("문자를 입력하세요");
		String msg = sc.nextLine();
		System.out.println("입력정보 : 전화번호 [" +ph+ "] 문자 [" +msg+ "]");
		System.out.println("전송버튼 클릭");

		Kakao kakao = new Kakao();
		kakao.setPh(ph);
		kakao.setMsg(msg);

		System.out.println("전송정보 : 전화번호 [" + kakao.getPh() + "] 문자 [" + kakao.getMsg() + "]");
	}
}
