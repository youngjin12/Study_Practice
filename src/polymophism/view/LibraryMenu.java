package polymophism.view;

import java.util.Scanner;

import polymophism.controller.LibraryManager;
import polymophism.model.vo.AniBook;
import polymophism.model.vo.Book;
import polymophism.model.vo.CookBook;
import polymophism.model.vo.Member;

public class LibraryMenu {

	
LibraryManager lm = new LibraryManager();

private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("성별 : ");
		char gender = sc.nextLine().charAt(0);
		
		lm.insertMember(new Member(name, age, gender)); // 
		
		
		while(true) {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 마이페이지");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색");
		System.out.println("4. 도서 대여하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		
		case 1 : 
		System.out.println(lm.myinfo());
			
			break;
			
			
		case 2 : 
			selectAll(); break;
			
		case 3 : 
			searchBook(); break;
			
		case 4 : 
			rentBook(); break;
		case 0 : 
			System.out.println("프로그램을 종료합니다."); return;
		}
		
		}
		
	}
	
	public void selectAll() {
		
	Book[] bList =	lm.selectAll();
	
	for(int i = 0; i < bList.length; i++) {
		System.out.println(i+"번 도서 : " + bList[i]);
	}
		
	}
	
	public void searchBook() {
		
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		
		Book[] searchBook = lm.searchBook(keyword);
		
		for(Book b : searchBook) {
			/*if (b instanceof AniBook) {
				System.out.println(((AniBook) b).toString()); // AniBook 클래스로 형변환이 된 searchList를 받은 s를 toString으로 나열함
			} else if (b instanceof CookBook) {
				System.out.println(((CookBook) b).toString());
			}*/
			System.out.println(b); break;
		
		}
		
	}
	
	public void rentBook() {
		
		selectAll();
		
		System.out.println("대여할 도서 선택 : ");
		int num = sc.nextInt();
		int result = lm.rentBook(num);
		
		switch(result) {
		
		case 0 : 
			System.out.println("성공적으로 대여되었습니다."); break;
		case 1 : 
			System.out.println("나이 제한으로 대여 불가능입니다"); break;
		case 2 :
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요"); break;
		}
	}
	
}
