package collection.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import collection.model.dao.BoardDao;
import collection.model.vo.Board;

public class BoardManeger {

	BoardDao bd = new BoardDao();
	
	Scanner sc = new Scanner(System.in);
	
	public BoardManeger() {
		// TODO Auto-generated constructor stub
	}
	
	public void writeBoard() {
		
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.println("글 제목 : ");
		String title = sc.nextLine();
		
		System.out.println("작성자 : ");
		String author = sc.nextLine();
		
		Date date = new Date();
		
		System.out.println("글 내용 : ");
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			String str = sc.nextLine();
			if(str.equals("exit")) {
				return;
			}else {
				sb.append(str);
				sb.append("\n");
				
			}
			
		}
		
		Board b = new Board(bd.getLastBoardNo(), title, author, date, sb);
		
		
		
	}
	
	public void displayAllList() {
		
		ArrayList<Board> al = new ArrayList<Board>(); 
		al = bd.displayAllList();
		
		Iterator<Board> iter = al.iterator(); 
		
		while(iter.hasNext()) {
			Board b = iter.next();
			
			System.out.println(b);
			
			
		}
	}
	
	public void displayBoard() {
		
		System.out.println("조회할 글 번호 : ");
		int num = sc.nextInt();
		
		bd.displayBoard(num);
		
		bd.upReadCount(num);
		
		if(bd.displayBoard(num) == null) {
			System.out.println("조회된 글이 없습니다.");
		}

	}
	
	public void modifyTitle() {
		
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		
		bd.displayBoard(num);
		
		
		System.out.println("변경할 글 제목 : ");
		String title = sc.nextLine();
		
		bd.modifyTitle(num, title);
		
		if(bd.displayBoard(num) == null) {
			System.out.println("조회된 글이 없습니다.");
		}
		
	}
	
	public void modifyContent() {
		
		System.out.println("수정할 글 번호 : ");
		int num = sc.nextInt();
		
		bd.displayBoard(num);
		
		
		System.out.println("변경할 글 내용 : ");
		String str = sc.nextLine();
		
		bd.modifyContent(num, str);
		
		if(bd.displayBoard(num) == null) {
			System.out.println("조회된 글이 없습니다.");
		}
	}
	
	public void deleteBoard() {
		
		System.out.println("삭제할 글 번호 : ");
		int num = sc.nextInt();
		
		bd.displayBoard(num);
		
		if(bd.displayBoard(num) == null) {
			System.out.println("조회된 글이 없습니다.");
		}else {
			System.out.println("정말고 삭제하시겠습니까? (y/n) : ");
			String yn = sc.nextLine();
			
			if(yn.equalsIgnoreCase("y")) {
				bd.deleteBoard(num);
			}
		}
		
		
		
		
	}
	
	public void searchBoard() {
		
		System.out.println("검색할 제목 : ");
		String name = sc.nextLine();
		
		ArrayList<Board> list = new ArrayList<Board>();
		list = bd.displayBoard();
		
		if(bd.displayBoard(num) == null) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			Iterator<Board> iter = new Iterator<Board>();
			
			
		}
		
		
		
		
	}
	
	public void saveListFile() {
		
		bd.saveListFile();
		
	}
	
	public void sortList(int item, Boolean isDesc) {
		bd.displayAllList();
		
		if(item == 1) {
			
		}
	}
	
	
}
