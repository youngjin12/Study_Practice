package variable.example;

import java.util.Scanner;

public class VariablePractice {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		// 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 각각의 값을 변수에 담고 출
		// 력하세요.

		
		System.out.println("이름을 입력하세요 : ");
		String name = sc.nextLine();

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);

		System.out.println("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();

		System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다^^", height, age, gender, name);

	}

	public void method2() {
		
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
		
		System.out.println("첫 번째 정수를 입력하세요 : ");
		int d = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요 : ");
		int d1 = sc.nextInt();

		System.out.println("더하기 결과 : " + (d+d1));
		System.out.println("빼기 결과 : " + (d-d1));
		System.out.println("곱하기 결과 : " + d*d1);
		System.out.println("나누기 몫 결과 : " + d/d1);
		
	}
	
	public void method3() { 
		//키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		//* 참고 ( 면적=가로*세로 , 둘레=(가로+세로)*2 )
		
		System.out.println("가로 : ");
		int l = sc.nextInt();
		
		System.out.println("세로 : ");
		int g = sc.nextInt();
		
		System.out.println("면적 : " + (l*g));
		System.out.println("둘레 : " + (l+g)*2);
	}
	
	public void method4() { 
		System.out.println("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		char c = str.charAt(0);
		char c1 = str.charAt(1);
		char c2 = str.charAt(2);
		
		System.out.println("첫 번째 문자 : " + c);
		System.out.println("두 번째 문자 : " + c1);
		System.out.println("세 번째 문자 : " + c2);
		
	}

	
	
	
	
}
