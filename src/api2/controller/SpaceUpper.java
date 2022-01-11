package api2.controller;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SpaceUpper {


public SpaceUpper() {
	// TODO Auto-generated constructor stub
}
	Scanner sc = new Scanner(System.in);
	public void spaceToUpper() {
		
		
		System.out.println("영어를 입력하시오(띄어쓰기 포함) : ");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str , " ");
		while(st.hasMoreTokens()) {
			String st1 = st.nextToken(); // st의 토큰을 String에 담아서 그 문자열을 가지고 작업.
			String up = st1.substring(0,1).toUpperCase();
			String low = st1.substring(1).toLowerCase();
			System.out.print(st1 + " ");
			StringBuilder sb = new StringBuilder(up+low);
			System.out.print(sb + " ");
			
		}
		 
	}
	
}
