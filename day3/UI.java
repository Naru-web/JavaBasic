package day3;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("��ȭ��ȣ�� �Է��ϼ���");
		String ph = sc.nextLine();
		System.out.println("���ڸ� �Է��ϼ���");
		String msg = sc.nextLine();
		System.out.println("�Է����� : ��ȭ��ȣ [" +ph+ "] ���� [" +msg+ "]");
		System.out.println("���۹�ư Ŭ��");

		Kakao kakao = new Kakao();
		kakao.setPh(ph);
		kakao.setMsg(msg);

		System.out.println("�������� : ��ȭ��ȣ [" + kakao.getPh() + "] ���� [" + kakao.getMsg() + "]");
	}
}
