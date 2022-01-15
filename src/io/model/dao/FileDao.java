package io.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {

	Scanner sc = new Scanner(System.in);
	
	public FileDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void filesave() {
		
		StringBuilder sb = new StringBuilder();

		System.out.println("파일에 저장할 내용을 입력하시오(\"exit\"를 입력하면 내용 입력 끝)");

		while(true) {
			
			String str = sc.nextLine();
			if(str.equals("exit")) {
				
				break;
			}else {
				sb.append(str);
				sb.append("\n");
			}
		}
			System.out.println("파일에 추가하시겠습니까?(y/n)");
			String yn = sc.nextLine();
			
			if(yn.equalsIgnoreCase("y")) {
				System.out.println("저장할 파일명을 입력하시오");
				String file = sc.nextLine();
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(file + ".txt", true))){
					bw.write(sb.toString());
				
					System.out.println("입력받은 " + file + ".txt." + "파일에 성공적으로 저장하였습니다.");
				
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}else {
				System.out.println("다시 메뉴로 돌아갑니다."); return;
			}
			
		}	
			
			
		
	
	

	public void fileOpen() {
		
		System.out.println("열기 할 파일명 : ");
		String str = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(str + ".txt"))){
			
			String str1 = null;
			while((str1 = br.readLine()) != null) {
			System.out.println(str1);
			}
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("존재하는 파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		
	}

	public void fileEdit() {

		System.out.println("수정할 파일명 : ");
		String fname = sc.nextLine();
		try (
			BufferedReader br = new BufferedReader(new FileReader(fname + ".txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(fname + ".txt", true))){
				
				String str1 = null;
				while((str1 = br.readLine()) != null) {
				System.out.println(str1);
				}
			
			;
			
			StringBuilder sb = new StringBuilder();
			
			System.out.println("파일에 저장할 내용을 입력하시오");

			while(true) {
				
				String str = sc.nextLine();
				if(str.equals("exit")) {
					
					break;
				}else {
					sb.append(str);
					sb.append("\n");
				}
			}
				System.out.println("변경된 내용을 파일에 추가하시겠습니까?(y/n)");
				String yn = sc.nextLine();
				if(yn.equalsIgnoreCase("y")) {
					bw.write(sb.toString());
					System.out.println(fname + ".txt" + "파일의 내용이 변경되었습니다.");
				}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	
}
