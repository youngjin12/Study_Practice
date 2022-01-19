package collection.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import collection.model.vo.Board;

public class BoardDao {
	
	ArrayList<Board> list = new ArrayList<Board>();
	
	public BoardDao() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("board_list.dat"))){
			
			
			list.addAll((ArrayList<Board>)ois.readObject());
		}catch(EOFException e) {
			return;
		}catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();	
		} catch (FileNotFoundException e) {
				System.out.println("지정된 파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	public int getLastBoardNo() {
		
		return  list.get(list.size()-1).getBoardNo();
	}
	
	public void writeBoard(Board board) {
		list.add(board);
	}
	
	public ArrayList<Board> displayAllList(){
		return list;
	}
	
	public Board displayBoard(int num) {
		
		Board b = null;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == num) {
				b = list.get(i); break;
			}
		}return b;
		
	}
	
	public void upReadCount(int no) {
		
	
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setReadCount(list.get(i).getReadCount()+1); // i번째 객채의 ReadCount를 set해준다. (i번째 객체의 ReadCount를 +1해준 후)
			}
		}
	}
	
	public void modifyTitle(int no, String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(title);
			}
		}
	}
	
	public void modifyContent(int no , String content) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.get(i).setBoardTitle(content);
			}
		}
	}
	
	public void deleteBoard(int no) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == no) {
				list.remove(i);
			}
		}
	}
	
	public ArrayList<Board> searchBoard(String title){
		ArrayList<Board> sl = new ArrayList<Board>(); 
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardTitle().contains(title)) {
				sl.add(list.get(i));
				list.get(i).setReadCount(list.get(i).getReadCount()+1);
			}
		}return sl;
	}
	
	public void saveListFile() {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("board_list.dat"))){
			System.out.println(list);
			oos.writeObject(list);
			System.out.println("board_list.dat 파일이 성공적으로 저장되었습니다.");
		} catch (FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	

}
