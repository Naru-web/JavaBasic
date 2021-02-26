package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("###### 회원관리 ######");
		join();
		
			
	}
	public static void join() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("*** 회원가입 창 ***");
		System.out.println( "아이디 등록");
		String id = sc.next();
		System.out.println( "비번 등록" );
		String pw = sc.next();
		User user = new User();
		user.setId(id);
		user.setPw(pw);
		System.out.println("[가입 정보] ID: "+user.getId()+" , PW:" +user.getPw());
		login(user);
				
					
	}
	public static void login(User user) {
		Scanner sc = new Scanner(System.in);
		System.out.println("☆☆로그인 창☆☆");
		System.out.println("ID 입력");
		System.out.println("비번 입력");
		
		String id = user.getId(); 
		String pw = user.getPw();
		System.out.println("[가입 정보] ID: "+id+" , PW:" +pw);
		
			
	}
}
