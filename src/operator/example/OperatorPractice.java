package operator.example;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
		System.out.println("정수 : ");
		int d = sc.nextInt();
		System.out.println(d > 0 ? "양수다" : "양수가 아니다");

	}

	public void practice2() {

		// 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
		// 양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.

		System.out.println("정수 : ");
		int d = sc.nextInt();
		System.out.println(d > 0 ? "양수다" : d == 0 ? "0이다" : "음수다");

	}

	public void practice3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		System.out.println("정수 : ");
		int d = sc.nextInt();
		System.out.println(d % 2 == 0 ? "짝수다" : "홀수다");

	}

	public void practice4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다.
		// 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		System.out.println("인원 수 : ");
		int p = sc.nextInt();
		System.out.println("사탕 개수 : ");
		int c = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + c / p);
		System.out.println("남은 사탕 개수 : " + (c % p));

	}

	public void practice5() {

		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
		// 이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.

		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("학년(숫자만) : ");
		int s = sc.nextInt();
		System.out.println("반(숫자만) : ");
		int c = sc.nextInt();
		System.out.println("번호(숫자만) : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적(소수점 아래 둘째 자리까지 : ");
		double d = sc.nextDouble();
		String str = gender == 'M' ? "남학생" : "여학생";
		// System.out.println(str);
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", s, c, num, name, str, d);

	}

	public void practice6() {

		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요.
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println(age > 19 ? "성인" : age > 13 ? "청소년" : "어린이");

	}

	public void practice7() {

		/*
		 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을
		 * 구하세요. 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격,
		 * 아니라면 불합격을 출력하세요.
		 */
		System.out.println("국어 : ");
		int k = sc.nextInt();
		System.out.println("영어 : ");
		int e = sc.nextInt();
		System.out.println("수학 : ");
		int m = sc.nextInt();

		System.out.println("합계 : " + (k + e + m));
		System.out.println("평균 : " + (k + e + m) / 3);
		System.out.println(k >= 40 ? e >= 40 ? m >= 40 ? (k + e + m) / 3 >= 60 ? "합격" : "불합격" : "불합격" : "불합격" : "불합격");
	}

	public void practice8() {
		// 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
		System.out.println("주민번호를 입력하세요(-포함) : ");
		String str = sc.nextLine();
		char c = str.charAt(7);
		System.out.println(c == '1' ? "남자" : c == '3' ? "남자" : "여자");
	}

	public void practice9() {
		/*
		 * 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요. 그리고 또 다른 정수를 입력 받아 그 수가 num1
		 * 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요. (단, 입력할 때 num1은 num2보다 작아야 함)
		 */
		System.out.println("정수1 : ");
		int d = sc.nextInt();
		System.out.println("정수2(정수1보다 큰 수) : ");
		int d1 = sc.nextInt();
		System.out.println("입력 : ");
		int d2 = sc.nextInt();
		System.out.println(d2 > d1 ? "true" : d2 <= d ? "true" : "false");

	}

	public void practice10() {

		// 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		System.out.println("입력1 : ");
		int d = sc.nextInt();
		System.out.println("입력2 : ");
		int d1 = sc.nextInt();
		System.out.println("입력3 : ");
		int d2 = sc.nextInt();

		System.out.println(d == d1 && d1 == d2 ? "true" : "false");

	}

	public void practice11() {

		/*
		 * A, B, C 사원의 연봉을 입력 받고 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고 인센티브 포함 급여가 3000만원 이상이면
		 * “3000 이상”, 미만이면 “3000 미만”을 출력하세요. (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의
		 * 인센티브는 0.15)
		 */
		System.out.println("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.println("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.println("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		System.out.printf("A사원의 인센티브포함 연봉 : %.1f ",(a + (a*0.4)));
		System.out.println();
		System.out.println((a + (a*0.4)) >= 3000 ? "3000이상" : "3000미만");
		System.out.printf("B사원의 인센티브포함 연봉 : %.1f " , (b + (b*0.0)));
		System.out.println();
		System.out.println(b >= 3000 ? "3000이상" : "3000미만");
		System.out.printf("c사원의 인센티브포함 연봉 : %.1f " ,(c + (c*0.15)));
		System.out.println();
		System.out.println((c + (c*0.15)) >= 3000 ? "3000이상" : "3000미만");
		
		
	}

}
