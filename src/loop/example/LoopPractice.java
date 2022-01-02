package loop.example;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		// 만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice2() {
		// practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// “잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.

		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");

			}
		}

	}

	public void practice3() {

		// 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다.
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");

		}

	}

	public void practice4() {

		// practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// “잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		while (true) {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");

			}

		}
	}

	public void practice5() {

		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int num2 = 0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i + " + ");

			num2 += i;
		}
		System.out.println(" = " + num2);

	}

	public void practice6() {

		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.

		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("두 번쨰 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 >= 1 && num2 >= 1) {
			if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else if (num2 < num1) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 == num2) {
				System.out.println("서로 다른 값을 넣어주세요.");
			}
		} else {
			System.out.println("1이상의 숫자만을 입력해주세요");
		}

	}

	public void practice7() {
		while (true) {
//	위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
			// “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
			System.out.println("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.println("두 번쨰 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {
				if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
					break;
				} else if (num2 < num1) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
					break;
				} else if (num1 == num2) {
					System.out.println("서로 다른 값을 넣어주세요.");
					break;
				}
			} else {
				System.out.println("1이상의 숫자만을 입력해주세요");

			}
		}

	}

	public void practice8() {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		System.out.println("숫자 : ");
		int num1 = sc.nextInt();
		System.out.println("====" + num1 + "단" + " ====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num1 + " * " + i + " = " + num1 * i);
		}

	}

	public void practice9() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		// 단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요.
		System.out.println("숫자 : ");
		int num1 = sc.nextInt();
		if (2 <= num1 && num1 <= 9) {
			for (int i = num1; i <= 9; i++) {
				System.out.println("====" + num1 + "단" + " ====");
				for (int j = 1; j <= 9; j++)
					System.out.println(num1 + " * " + j + " = " + num1 * j);
				num1++;
			}
		} else {
			System.out.println("2~9사이의 숫자만 입력하세요");
		}

	}

	public void practice10() {
		// Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		// “2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		while (true) {
			System.out.println("숫자 : ");
			int num1 = sc.nextInt();
			if (2 <= num1 && num1 <= 9) {
				for (int i = num1; i <= 9; i++) {
					System.out.println("====" + num1 + "단" + " ====");
					for (int j = 1; j <= 9; j++)
						System.out.println(num1 + " * " + j + " = " + num1 * j);
					num1++;
				}
				break;
			} else {
				System.out.println("2~9사이의 숫자만 입력하세요");
			}

		}
	}

	public void practice11() {
		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요. 단, 출력되는 숫자는 총
		 * 10개입니다.
		 */

		System.out.println("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.println("공차 : ");
		int num1 = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(num + " ");
			num += num1;
		}

	}

	public void practice12() {

		/*
		 * 정수 두 개와 연산자(문자열로 입력 받고 입력된 연산자에 따라 알맞은 결과를 출력하세요. 단, 해당 프로그램은 연산자 입력에
		 * “exit”라는 값이 들어올 때까지 무한 반복하며 exit가 들어오면 “프로그램을 종료합니다.”를 출력하고 종료합니다. 또한 연산자가
		 * 나누기이면서 두 번째 정수가 0으로 들어오면 “0으로 나눌 수 없습니다. 다시 입력해주세요.”를 출력하며, 없는 연산자가 들어올 시 “없는
		 * 연산자입니다. 다시 입력해주세요.”라고 출력하고 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		 */

		while (true) {

			System.out.println("연산자(+, -, *, /, %) : ");
			String str = sc.nextLine();
			System.out.println("정수1 : ");
			int num1 = sc.nextInt();
			System.out.println("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();

			switch (str) {

			case "+":
				System.out.printf("%d %s %d = %d \n", num1, str, num2, num1 + num2);
				break;

			case "-":
				System.out.printf("%d %s %d = %d \n", num1, str, num2, num1 - num2);
				break;
			case "*":
				System.out.printf("%d %s %d = %d \n", num1, str, num2, num1 * num2);
				break;
			case "/":
				if (num2 != 0) {
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1 / num2);
				} else {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요");
				}
				break;
			case "%":
				if (num2 != 0) {
					System.out.printf("%d %s %d = %d \n", num1, str, num2, num1 % num2);
				} else {
					System.out.println("0으로 나눌수 없습니다. 다시 입력해주세요");
				}
				break;
			case "exit":
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("없는 연산자 입니다. 다시 입력해 주세요.");
			}
		}
	}

	public void practice15() {
		/*
		 * 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를
		 * 출력하세요.
		 */
		System.out.println("숫자 : ");
		int num = sc.nextInt();

		if (num >= 2) {
			if (num == 2) {
				System.out.println("소수입니다.");
			} else {
				for (int i = 2; i < num; i++) {
					if (num != i && num % i == 0) {
						System.out.println("소수가 아닙니다.");
						return;
					}
				}
				System.out.println("소수입니다.");
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void practice16() {

		/*
		 * 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		while (true) {
			System.out.println("숫자 : ");
			int num = sc.nextInt();

			if (num >= 2) {
				/*
				 * if (num == 2) { System.out.println("소수입니다."); } else {
				 */
				for (int i = 2; i < num; i++) {
					if (num != i && num % i == 0) {
						System.out.println("소수가 아닙니다.");
						return;
					}
				}
				System.out.println("소수입니다.");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");

			}
		}
	}

	public void practice17() {
		System.out.println("숫자 : ");
		int num = sc.nextInt();
		int c = 0;
		boolean flag = true;
		if (num < 2) {
			System.out.println("잘못입력하셨습니다.");
		} else {
			for (int i = 2; i <= num; i++) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag) {
					System.out.print(i + " ");
					c++;
				}
				flag = true;
			}
		}
		System.out.println();
		System.out.println("2부터 " + num + "까지 소수의 개수는 " + c + "개입니다.");

	}

	public void practice18() {

		/*
		 * 1부터 사용자에게 입력 받은 수까지 중에서 1) 2와 3의 배수를 모두 출력하고 2) 2와 3의 공배수의 개수를 출력하세요.
		 */
		System.out.println("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			} else if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 6 == 0) {
				c++;
			}

		}
		System.out.println();
		System.out.println("count : " + c);

	}

	public void practice19() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i + 1; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public void practice20() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int j = num - 1; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

	public void practice21() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

	public void practice22() {

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || i == num || j == 1 || j == num) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice23() {
		int n = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for (int i = 1; i <= 4; i++) {
			for (int j = 4 - 1; j >= 4 - i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (4 * 2) - n; j++) {
				System.out.print(j);

			}
			n += 2;
			System.out.println();
		}
	}

	public void practice24() {
		int r = 3;
		int e = r;
		int d = r;

		for (int i = 1; i <= 3; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j == e || j == d) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			e--;
			d++;
			System.out.println();

		}
		e = 2;
		d = 4;
		for (int i = 1; i <= 2; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j == e || j == d) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			e++;
			d--;
			System.out.println();
		}

	}

	public void practice25() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
