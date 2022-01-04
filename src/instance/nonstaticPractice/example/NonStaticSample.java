package instance.nonstaticPractice.example;

import java.util.Arrays;
import java.util.Scanner;




public class NonStaticSample {
	Scanner sc = new Scanner(System.in);
	public void printLottoNumbers() {
		
		int[] ind = new int[6];
		
		for(int i = 0; i < ind.length; i++) {
			ind[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j++) {
				
				if(ind[i] == ind[j]) {
					i--;
					break;
			}
			
				
			}
		}Arrays.sort(ind);
		System.out.println("랜덤 값 : " + Arrays.toString(ind));
		
	}
	
	public void outputChar() {
		System.out.println("문자 하나 입력 : ");
		String str = sc.next();
		System.out.println("출력할 갯수 입력 : ");
		int d = sc.nextInt();
		System.out.print(str+"문자 " + d + "개 출력 : ");
		for(int i = 0; i < d; i++) {
			System.out.print(str + " ");
		}
		
	}
	
	public char alphabette() {
		//65~90 대문자 알파벳, 97~122 소문자 알파벳
		
		char num = (char)(Math.random()*58+65);
		
		if(num <91 && num >64 || num > 96 || num < 123) {
			return num;
		}
		return num;
				

	}
	
	public String mySubstring(String str , int index1, int index2) {
		
		char[] ind = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			if(index1 <= i && i <= index2){
				ind[i] = str.charAt(i);
			}
		} String re = String.valueOf(ind);
		return re;
	}
	
	

}
