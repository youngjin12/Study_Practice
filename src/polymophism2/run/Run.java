package polymophism2.run;

import polymophism2.model.vo.GalaxyNote9;
import polymophism2.model.vo.SmartPhone;
import polymophism2.model.vo.V40;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new V40();
		phone[1] = new GalaxyNote9();
		
		for(int i = 0; i < phone.length; i++) {
			phone[i].printMaker();
			phone[i].makeacall();
			phone[i].takeaCall();
			phone[i].touch();
			phone[i].charge();
			phone[i].picture();
			System.out.println();
			
		}
		
	}

}
