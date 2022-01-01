package array.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요.

		int[] ind = new int[10];

		for (int i = 0; i < ind.length; i++) {
			ind[i] = i + 1;
			System.out.print(ind[i] + " ");
		}

	}

	public void practice2() {
		// 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		int a = 10;
		int[] ind = new int[a];
		for (int i = 0; i < ind.length; i++) {
			ind[i] = a--;
			System.out.print(ind[i] + " ");
		}

	}

	public void practice3() {
		// 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.println("양의 정수 : ");
		int n = sc.nextInt();

		int[] ind = new int[n];

		for (int i = 0; i < ind.length; i++) {
			ind[i] = i + 1;
			System.out.print(ind[i] + " ");
		}

	}

	public void practice4() {

		String[] s = new String[5];
		s[0] = "사과";
		s[1] = "귤";
		s[2] = "포도";
		s[3] = "복숭아";
		s[4] = "참외";

		System.out.println(s[1]);
	}

	public void practice5() {

		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		System.out.println("문자열 : ");
		String str = sc.next();
		int count = 0;
		System.out.println("문자 : ");
		char c = sc.next().charAt(0);
		char ch;
		char[] s = new char[str.length()];

		System.out.print(str + "에 " + c + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < str.length(); i++) {
			s[i] = str.charAt(i);
			if (s[i] == c) {
				count++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println(c + " 개수 : " + count);
	}

	public void practice6() {

		/*
		 * “월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을
		 * 출력하고 범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		 */
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int n = sc.nextInt();

		String[] s = new String[7];
		s[0] = "월요일";
		s[1] = "화요일";
		s[2] = "수요일";
		s[3] = "목요일";
		s[4] = "금요일";
		s[5] = "토요일";
		s[6] = "일요일";
		for (int i = 0; i < s.length; i++) {
			if (i == n) {
				System.out.println(s[i]);
			} else if (n > 6 || n < 0) {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}

	public void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의
		 * 인덱스에 값을 초기화 하세요. 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 */
		System.out.println("정수 : ");
		int n = sc.nextInt();

		int[] ind = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int a = sc.nextInt();
			ind[i] = a;

		}
		for (int i = 0; i < ind.length; i++) {
			System.out.print(ind[i] + " ");
		}
		int b = 0;
		for (int i = 0; i < ind.length; i++) {

			b += ind[i];
		}
		System.out.println();
		System.out.println("총합 : " + b);
	}

	public void practice8() {
		/*
		 * 3이상인 홀수 정수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 */
		while (true) {
			System.out.println("정수 : ");
			int n = sc.nextInt();

			if (n > 2 && n % 2 == 1) {

				int[] ind = new int[n];

				for (int i = 0; i < ind.length; i++) {
					if (i <= n / 2) {
						ind[i] = i + 1;
						System.out.print(ind[i] + ", ");

					} else if (i != n - 1) {
						ind[i] = n - i;
						System.out.print(ind[i] + ", ");
					} else {
						ind[i] = n - i;
						System.out.println(ind[i]);
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
				continue;

			}
		}
	}

	public void practice9() {

		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 */
		// String[] s = new String[] {"후라이드", "양념", "간장", "핫소이"};
		String[] s = new String[3];
		s[0] = "후라이드";
		s[1] = "양념";
		s[2] = "핫소이";

		System.out.println("치킨이름을 입력하세요 : ");
		String str = sc.nextLine();

		for (int i = 0; i < s.length; i++) {
			if (str.equals(s[i])) {
				System.out.println(str + "치킨 배달 가능");
				return;
			}

		}
		System.out.println(str + "치킨은 없는 메뉴입니다.");
	}

	public void practice10() {

		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		 */
		int[] ind = new int[10];

		for (int i = 0; i < ind.length; i++) {
			ind[i] = (int) (Math.random() * 10) + 1;
			System.out.print(ind[i] + " ");
		}
	}

	public void practice11() {

		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 배열에 초기화 후 배열 전체 값과 그 값
		 * 중에서 최대값과 최소값을 출력하세요
		 */

		int[] ind = new int[10];

		for (int i = 0; i < ind.length; i++) {
			ind[i] = (int) (Math.random() * 10) + 1;
			System.out.print(ind[i] + " ");
		}
		int a = 1;
		for (int i = 0; i < ind.length; i++) {
			if (ind[i] > a) {
				a = ind[i];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + a);
		int b = 10;
		for (int i = 0; i < ind.length; i++) {
			if (ind[i] < b) {
				b = ind[i];
			}
		}
		System.out.println("최소값 : " + b);
	}

	public void practice12() {

		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후
		 * 출력하세요
		 */
		int[] ind = new int[10];

		for (int i = 0; i < ind.length; i++) {
			ind[i] = (int) (Math.random() * 10) + 1; // 랜덤값을 먼저 돌려놓고
			for (int j = 0; j < i; j++) {
				if (ind[i] == ind[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < ind.length; i++) {
			System.out.print(ind[i] + " ");
		}
	}

	public void practice13() {

		/*
		 * 주민등록번호를 String 문자열로 입력 받고 입력 받은 그 문자열을 각 인덱스 별 문자를 char[]에 옮겨 담기 (단, 성별 자리
		 * 이후부터는 *로 담기)
		 */

		System.out.println("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char[] s = new char[str.length()];

		for (int i = 0; i < s.length; i++) {
			if (i > 7) {
				s[i] = str.charAt(i);
				System.out.print("*");

			} else {
				s[i] = str.charAt(i);
				System.out.print(s[i]);

			}
		}
	}

	public void practice14(){
		
		//로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 오름차순으로 정렬하여 출력하세요.
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
		System.out.println(Arrays.toString(ind));
	}
}
