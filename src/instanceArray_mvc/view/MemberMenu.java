package instanceArray_mvc.view;

import java.util.Scanner;

import instanceArray_mvc.controller.MemberController;
import instanceArray_mvc.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		while(true) {
			
		System.out.println("===== 회원 관리 메뉴 =====");
		System.out.println("1. 신규 회원 등록");
		System.out.println("2. 회원 정보 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("5. 회원 정보 출력");
		System.out.println("6. 회원 정보 정렬");
		System.out.println("9. 프로그램 종료");
		System.out.println("실행하실 번호를 입력하세요 : ");
		int num = sc.nextInt();
			
			
		switch(num) {
		
		case 1 : 
			insertMember(); break;
		case 2 : 
			searchMember(); break;
		case 3 :
			updateMember(); break;
		case 4 : 
			 deleteMember(); break;
		case 5 : 
			 printAllMember(); break;
		case 6 : 
			sortMember(); break;
		case 9 : 
			System.out.println("프로그램을 종료합니다.");
			return;
		
		}
		}
	}
	
	public void insertMember() {
		int count = mc.getMemberCount();
		if(count > mc.SIZE) {
			return;
		}
		
		System.out.println("아이디를 입력해 주세요 : ");
		String id = sc.nextLine();
		
		Member re = mc.checkId(id);
		
		if(re != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		}else {
			System.out.println("비밀번호를 입력하세요 : ");
			String pwd = sc.nextLine();
			System.out.println("이름을 입력하세요 : ");
			String name = sc.nextLine();
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();
			System.out.println("성별을 입력하세요(M | F) : ");
			char gender = sc.nextLine().charAt(0);
			System.out.println("이메일을 입력하세요 : ");
			sc.nextLine();
			String email = sc.nextLine();
			
			Member m = new Member(id, pwd, name, age, gender, email);
		}
		System.out.println("성공적으로 회원 등록이 되었습니다.");
		
		
	}
	
	public void searchMember() {
		
		while(true) {
			
			System.out.println("===== 회원 정보 검색 =====");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전메뉴로");
			System.out.println("메뉴 : ");
			int num = sc.nextInt();
			System.out.println("검색 내용 : ");
			String search = sc.nextLine();
				
			switch(num) {
			
			case 1 : 
				insertMember(); break;
			case 2 : 
				searchMember(); break;
			case 3 :
				updateMember(); break;
			case 9 : 
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			}
	}
	
	public void updateMember() {
		
	}
	
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}
	
	

}
