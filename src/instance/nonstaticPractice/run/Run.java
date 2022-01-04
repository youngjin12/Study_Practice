package instance.nonstaticPractice.run;

import java.util.Arrays;
import java.util.Scanner;

import instance.nonstaticPractice.example.NonStaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in); 
		NonStaticSample nss = new NonStaticSample();
		//nss.printLottoNumbers();
		
		//nss.outputChar();
		
		//System.out.println("랜덤 영문자 출력 : " + nss.alphabette());
		
		
		System.out.println("문자열 입력 : ");
		String s = sc.nextLine();
		System.out.println("시작할 인덱스 번호 : ");
		int num = sc.nextInt();
		System.out.println("끝낼 인덱스 번호 : ");
		int num1 = sc.nextInt();
		
		if(num1 < s.length() && num1 >= num) {
		String re = nss.mySubstring(s, num, num1);
		
		
		System.out.print(s + "의 " + num + "번 " + num1 + "번 인덱스 사이의 값 출력 : " + re);
		}
	}

}