package instanceArray2.run;

import java.util.Scanner;

import instanceArray2.example.InstanceArray2;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InstanceArray2[] ind = new InstanceArray2[10];
		
		int count = 0; 
		
		while(true) {
			for(int i = 0; i < ind.length; i++) {
			System.out.println("학년 : ");
			int grade = sc.nextInt();
			System.out.println("반 : ");
			int c = sc.nextInt();
			sc.nextLine();
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("국어점수 : ");
			int kor = sc.nextInt();
			System.out.println("영어점수 : ");
			int eng = sc.nextInt();
			System.out.println("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			count++;
			ind[i] = new InstanceArray2(grade, c, name, kor, eng, math);
			
			System.out.println("계속 추가하시겠습니까?('Y'|'N') :");
			String ch = sc.nextLine();
			if(ch.equalsIgnoreCase("Y")) {
				continue;
			}else if(ch.equalsIgnoreCase("N")) {
				
			}break;
			
		}for(int i = 0; i < ind.length; i++) {
			if(ind[i] != null) {
			System.out.println(ind[i].information() +" 평균 : " + (ind[i].getKor()+ind[i].getEng()+ind[i].getMath())/3);
			}else {
				continue;
			}
		}break;

		}
	}

}
