package io.run;

import java.util.Scanner;

import io.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		FileDao fd = new FileDao();
		
		while(true) {
			
		System.out.println("***** MyNote *****");
		System.out.println("1. 새 노트 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 꿑내기");
		System.out.println("번호를 입력하세요 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : 
			fd.filesave(); break;
		case 2 : 
			fd.fileOpen(); break;
		case 3 : 
			fd.fileEdit(); break;
		case 4 : 
			System.out.println("프로그램을 종료합니다"); return;
		default :
			System.out.println("잘못 입력하셨습니다."); return;
		
		
		}
		
			
		}
		
	}

}
