package condition.example;

import java.io.InputStream;
import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		// 종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("9.종료");
		System.out.println("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();

		switch (num) {

		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 9:
			System.out.println("프로그램이 종료됩니다.");
			break;

		}

	}

	public void practice2() {
		/*
		 * 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고 짝수가 아니면 “홀수다“를 출력하세요. 양수가 아니면
		 * “양수만 입력해주세요.”를 출력하세요.
		 */
		System.out.println("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해 주세요.");
		}
	}

	public void practice3() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을
		 * 구현하세요. (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우) 합격 했을 경우 과목 별 점수와 합계,
		 * 평균, “축하합니다, 합격입니다!”를 출력하고 불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */

		System.out.println("국어점수 : ");
		int k = sc.nextInt();
		System.out.println("수학점수 : ");
		int m = sc.nextInt();
		System.out.println("영어점수 : ");
		int e = sc.nextInt();
		if (k >= 40 && m >= 40 && e >= 40 && (k + m + e) / 3 >= 60) {
			System.out.println("국어 : " + k);
			System.out.println("수학 : " + m);
			System.out.println("영어 : " + e);
			System.out.println("합계 : " + (k + m + e));
			System.out.println("국어 : " + (k + m + e) / 3);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

	public void practice4() {
		// 수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.

		System.out.println("조회하고자 하는 달 을 입력하세요 : ");
		int s = sc.nextInt();

		switch (s) {

		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		default:
			System.out.println("해당하는 계절이 없습니다.");

		}

	}

	public void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요. 로그인 성공 시 “로그인 성공”, 아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		 * 비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		 */

		final String id = "user1";
		final String pw = "1234";

		System.out.println("아이디 : ");
		String id1 = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw1 = sc.nextLine();

		if (id1.equals(id) && pw1.equals(pw)) {
			System.out.println("로그인 성공");
		} else if (id1.equals(id) && pw1 != pw) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if (id1 != id && pw1.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
		}

	}

	public void practice6() {

		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요. 단, 관리자는 회원관리, 게시글 관리,
		 * 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만
		 * 가능합니다. (단, 잘못 입력하였을 경우 “잘못 입력했습니다.” 라는 출력문이 출력되도록)
		 */
		System.out.println("권한을 확인하고자 하는 회원 등급 : ");
		String str = sc.nextLine();

		switch (str) {

		case "관리자":
			System.out.println("회원관리,게시글 관리,게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, 게시글 조회");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("없는 등급입니다.");
			break;
		}

	}

	public void practice7() {

		/*
		 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라 저체중 / 정상체중 / 과체중 / 비만을 출력하세요. BMI
		 * = 몸무게 / (키(m) * 키(m)) BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 BMI가 23이상
		 * 25미만일 경우 과체중 / 25이상 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만
		 */

		System.out.println("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else if (bmi >= 30) {
			System.out.println("고도 비만");
		}

	}

	public void practice8() {
		/*
		 * 키보드로 두 개의 양수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요. (단, 양수가 아닌 값을 입력하거나 제시되어
		 * 있지 않은 연산 기호를 입력 했을 시 “잘못 입력하셨습니다. 프로그램을 종료합니다.” 출력) (printf()문을 이용하여 마지막 출력문을
		 * 작성해보시오.)
		 */

		System.out.println("피연산자1 입력 : ");
		int n = sc.nextInt();
		System.out.println("피연산자2 입력 : ");
		int n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자를 입력(+,-,*,/,%) : ");
		String s = sc.nextLine();

		if (n > 0 && n1 > 0) {

			switch (s) {
			case "+":
				System.out.printf("%d %s %d = %d \n", n, s, n1, n + n1);
				break;
			case "-":
				System.out.printf("%d %s %d = %d \n", n, s, n1, n - n1);
				break;
			case "*":
				System.out.printf("%d %s %d = %d \n", n, s, n1, n * n1);
				break;
			case "/":
				System.out.printf("%d %s %d = %d \n", n, s, n1, n / n1);
				break;
			case "%":
				System.out.printf("%d %s %d = %d \n", n, s, n1, n % n1);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				break;
			}
		} else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}

	public void practice9() {

		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요. 총 점 100점 중 배점으로는 다음과 같다.
		 * 중간고사 (20%), 기말고사 (30%), 과제 (30%), 출석 (20%) 이 때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만
		 * 입력 총 점이 70점 이상이면서 전체 강의의 70%이상 출석을 했을 경우 Pass, 아니면 Fail을 출력하세요.
		 */
		
		System.out.println("중간 고사 점수 : ");
		int m = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int l = sc.nextInt();
		System.out.println("과제 점수 : ");
		int r = sc.nextInt();
		System.out.println("출석 회수 : ");
		int c = sc.nextInt();
		
		double re = ((m+l+r)/3)+c;
		
		
		System.out.println("=============결과==============");
		System.out.println("중간 고사 점수(20) : " + m/5);
		System.out.println("기말 고사 점수(30) : " + l*0.3);
		System.out.println("과제 점수(30) : " + r*0.3);
		System.out.println("출석 점수(20) : " + c);

		if(re >= 70 &&  c >= 14) {
			System.out.println("PASS");
		}else if(re <= 70 && c >= 14){
			System.out.println("FAIL [점수미달] (총점" + re + ")");
		}else if(re >= 70 && c < 14) {
			System.out.println("[출석 횟수 부족] ("+c+"/20)");
		}else {
			System.out.println("[출석 횟수 부족] ("+c+"/20)");
			System.out.println("FAIL [점수미달] (총점" + re + ")");
		}
	}
	
	 public void practice10(){
		 //앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현하세요
		 System.out.println("실행할 기능을 선택하세요.");
		 System.out.println("1. 메뉴 출력");
		 System.out.println("2. 짝수/홀수");
		 System.out.println("3. 합격/불합격");
		 System.out.println("4. 계쩔 ");
		 System.out.println("5. 로그인");
		 System.out.println("6. 권한 확인");
		 System.out.println("7. BMI");
		 System.out.println("8. 계산기");
		 System.out.println("9. Pass/Fail");
		 System.out.println("선택 : ");
		 int num = sc.nextInt();
		 
		 switch(num) {
		 case 1 : practice1(); break;
		 case 2 : practice2(); break; 
		 case 3 : practice3(); break; 
		 case 4 : practice4(); break; 
		 case 5 : practice5(); break; 
		 case 6 : practice6(); break; 
		 case 7 : practice7(); break; 
		 case 8 : practice8(); break; 
		 case 9 : practice9(); break; 
		 default : System.out.println("없는 번호 입니다.");
		 }
		 
	 }

}
