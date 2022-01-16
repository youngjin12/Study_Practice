package collection.view;

import java.util.Scanner;

import collection.controller.BoardManeger;
import collection.model.dao.BoardDao;

public class BoardMenu {
	
	Scanner sc = new Scanner(System.in);
	
	BoardManeger bm = new BoardManeger();
	
	public BoardMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
		
		while(true) {
		System.out.println("****** 게시글 서비스 프로그램 ******");
		System.out.println("1. 게시글 쓰기");
		System.out.println("2. 게시글 전체 보기");		
		System.out.println("3. 게시글 한 개 보기");
		System.out.println("4. 게시글 제목 수정");
		System.out.println("5. 게시글 내용 수정");
		System.out.println("6. 게시글 삭제");
		System.out.println("7. 게시글 검색");
		System.out.println("8. 파일에 저장하기");
		System.out.println("9. 정렬하기");
		System.out.println("10. 끝내기");
		System.out.println("메뉴 번호 선택 : ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 1 : bm.writeBoard(); break;
		
		case 2 : bm.displayAllList(); break;
		
		case 3 : bm.displayBoard(); break;
		
		case 4 : bm.modifyTitle(); break;
		
		case 5 : bm.modifyContent(); break;
		
		case 6 : bm.deleteBoard(); break;
		
		case 7 : bm.searchBoard(); break;
		
		case 8 : bm.saveListFile(); break;
		
		case 9 : sortSubMenu(); break;
		
		case 10 : System.out.println("프로그램을 종료합니다."); break;
		
		default : System.out.println("잘못된 번호입니다."); break;
		
		}
		}
		
		
		
	}
	
	public void sortSubMenu() {
		
		
		while(true) {
		
		System.out.println("****** 게시글 정렬 메뉴 ******");
		System.out.println("1. 글번호순 오름차순 정렬");
		System.out.println("2. 글번호순 내림차순 정렬");
		System.out.println("3. 정렬날짜순 오름차순 정렬");
		System.out.println("4. 정렬날짜순 내림차순 정렬");
		System.out.println("5. 글제목순 오름차순 정렬");
		System.out.println("6. 글제목순 오름차순 정렬");
		System.out.println("7. 이전메뉴로 이동");
		System.out.println("메뉴를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		
		switch(num) {
		
		case 1 : bm.sortList(1, false); break;
		
		case 2 : bm.sortList(1, true); break;
		
		case 3 : bm.sortList(2, false); break;
		
		case 4 : bm.sortList(2, true); break;
		
		case 5 : bm.sortList(3, false); break;
		
		case 6 : bm.sortList(3, true); break;
		
		case 7 : return; 
		
		
		
		
		}
		
		
		
		}
	}
	
	

}
