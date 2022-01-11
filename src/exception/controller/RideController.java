package exception.controller;

import exception.model.vo.Guests;
import exception.model.vo.RollerCoaster;

public class RideController {

	Guests[] gs = new Guests[4];

	Guests[] onBoard = new Guests[2];

	public RideController() {
		// TODO Auto-generated constructor stub
	}

	RollerCoaster rc = new RollerCoaster();

	public void cutGuest() {

		{
			gs[0] = new Guests("홍길동", 17, 'M', 120.2);
			gs[1] = new Guests("유관순", 20, 'F', 102.3);
			gs[2] = new Guests("김유신", 23, 'M', 110.4);
			gs[3] = new Guests("김흥부", 21, 'M', 112.5);

		}
		try {
			int a = 0;
			for (int i = 0; i < gs.length; i++) {
				if (gs[i].getHeight() >= rc.CUTHEIGHT) {

					onBoard[a] = gs[i];
					a++;
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("몬제가 발생한 해당 배열의 인덱스 번호 : " + e.getMessage().substring(33));
		} finally {
			System.out.println("인원이 가득 찼습니다. 다음 차례를 기다리세요");
			System.out.println("이번 차례 탑승 명단");

			
			for (int i = 0; i < onBoard.length; i++) {

				System.out.println(onBoard[i].toString());
			}
			System.out.println("탑승자 요금 : " + rc.PRICE * 2);
		}
	}

}
