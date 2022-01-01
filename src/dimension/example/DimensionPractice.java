package dimension.example;

import java.util.Scanner;

public class DimensionPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 1 ~ 16까지 값을 차례대로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요.
		 */
		int[][] in = new int[4][4];
		int n = 1;
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				in[i][j] = n++;
				System.out.print(in[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void practice2() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고 1) 16 ~ 1과 같이 값을 거꾸로 저장하세요. 2) 저장된 값들을 차례대로 출력하세요.
		 */
		int[][] in = new int[4][4];
		int n = 16;
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				in[i][j] = n--;
			}
		}
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				System.out.print(in[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public void practice3() {

		/*
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장
		 * 후 출력하세요
		 */
		String[][] in = new String[3][3];
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				in[i][j] = "(" + i + ", " + j + ")";
			}
		}
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in[i].length; j++) {
				System.out.print(in[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void practice4() {

		int[][] in = new int[4][4];
		int a = 0;
		int b = 0;
		for (int i = 0; i < in.length - 1; i++) {
			for (int j = 0; j < in[i].length - 1; j++) {
				in[i][j] = (int) (Math.random() * 10 + 1);
				a += in[i][j];
				System.out.print(in[i][j] + "\t");
			}
			System.out.println(a);
			b += a;
			a = 0;
		}

		for (int i = 0; i < in.length; i++) {
			for (int j = 3; j < in.length; j++)
				if (i == in.length - 1) {
					System.out.println(b);
				} else {
					for (int k = 0; k < j; k++) {
						in[i][j] += in[k][i];

					}
					System.out.print(in[i][j] + "\t");
				}
		}
	}

	public void practice5() {

		/*
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 1~10사이 숫자가 아니면 “반드시 1~10 사이의 정수를 입력해야 합니다.”
		 * 출력 후 다시 정수를 받게 하세요. 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요. (char형은
		 * 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄)
		 */

		while (true) {
			System.out.println("행 크기 : ");
			int n = sc.nextInt();
			System.out.println("열 크기 : ");
			int n1 = sc.nextInt();
			if (n > 10 || n < 1 || n1 > 10 || n1 < 1) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			} else {
				char[][] ch = new char[n][n1];

				for (int i = 0; i < ch.length; i++) {
					for (int j = 0; j < ch[i].length; j++) {
						ch[i][j] = (char) (Math.random() * 26 + 65);
					}
				}
				for (int i = 0; i < ch.length; i++) {
					for (int j = 0; j < ch[i].length; j++) {
						System.out.print(ch[i][j] + "\t");
					}
					System.out.println();
				}
				break;

			}

		}
	}

	public void practice6() {

		/*
		 * String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지",
		 * "습", "으", "냅"}, {"원", "열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열",
		 * "히", "! ", "더", "!! "}}; 위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로
		 * 출력하세요. 단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
		 */

		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i] + "\t");
			}
			System.out.println();
		}
	}

	public void practice7() {
		/*
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아 문자형 가변 배열을 선언 및 할당하세요. 그리고 각
		 * 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 */
		char c = 'a';

		System.out.println("행의 크기 : ");
		int n = sc.nextInt();
		char ch[][] = new char[n][];
		for (int i = 0; i < ch.length; i++) {
			System.out.println(i + "행의 크기 : ");
			int a = sc.nextInt();
			ch[i] = new char[a];

		}
		for (int j = 0; j < ch.length; j++) {
			for (int k = 0; k < ch[j].length; k++) {
				ch[j][k] = c++;
				System.out.print(ch[j][k]);
			}
			System.out.println();

		}

	}

	public void practice8() {

		/*
		 * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장. 1분단 왼쪽부터
		 * 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요. <출석부> 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		 * 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		 */
		String[] str = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] str1 = new String[3][2];
		System.out.println("===1분단===");
		int e = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[e++];
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}
		String[][] str2 = new String[3][2];
		System.out.println("===2분단===");
		int f = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[e++];
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice9() {
		/*
		 * 위 문제에서 자리 배리 배치한 것을 가지고 학생 이름을 검색하여 해당 학생이 어느 자리에 앉았는지 출력하세요.
		 */
		String[] str = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] str1 = new String[3][2];
		System.out.println("===1분단===");
		int e = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str1[i][j] = str[e++];
				System.out.print(str1[i][j] + " ");
			}
			System.out.println();
		}
		String[][] str2 = new String[3][2];
		System.out.println("===2분단===");
		int f = 0;
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				str2[i][j] = str[e++];
				System.out.print(str2[i][j] + " ");
			}
			System.out.println();
		
		}
		System.out.println("===========================================");
		System.out.println("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1[i].length; j++) {
				if(str1[i][j].equals(name)) {
					if(j == 0) {
						System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) +"번째 줄 왼쪽에 있습니다."); break;
					}else {
						System.out.println("검색하신 " + name + " 학생은 1분단 " + (i+1) +"번째 줄 오른쪽에 있습니다."); break;
					}
				}
			}
		}
		for (int i = 0; i < str2.length; i++) {
			for (int j = 0; j < str2[i].length; j++) {
				if(str2[i][j].equals(name)) {
					if(j == 0) {
						System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) +"번째 줄 왼쪽에 있습니다."); break;
					}else {
						System.out.println("검색하신 " + name + " 학생은 2분단 " + (i+1) +"번째 줄 오른쪽에 있습니다."); break;
					}
				}
			}
		}
	}
}
