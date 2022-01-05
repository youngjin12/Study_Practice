package instanceArray.run;

import java.util.Arrays;

import instanceArray.example.InstanceArray;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 InstanceArray[] ind = new InstanceArray[3];
		 
		
		 ind[0] = new InstanceArray();
		 ind[1] = new InstanceArray(1, "홍길동", 19, 'M', "01022223333" , "서울 잠실");
		 ind[2] = new InstanceArray(2, "강말순", "고육부", "강사", 20, 'F', 1000000, 0.01, "01011112222" , "서울 마곡");
		
		 for(int i = 0; i < ind.length; i++) {
		 System.out.println("emp[" + i  +"] : " + ind[i].information());
			 
		 }
		 
		 ind[0] = new InstanceArray(0, "김말똥", "영업부" , "팀장" , 30 , 'M' , 3000000 , 0.2 , "01055559999" , "전라도 광주");
		 ind[1] = new InstanceArray(1, "홍길동", "기획부" , "부장" , 19, 'M', 4000000 , 0.3 , "01022223333" , "서울 잠실");
		 
		 System.out.println("============================================================================");
		 for(int i = 0; i < ind.length -1; i++) {
			 System.out.println("emp[" + i  +"] : " + ind[i].information());
				 
			 }
		 
		 System.out.println("============================================================================");
		 for(int i = 0; i < ind.length; i++) {
	System.out.println(ind[i].getEmpName() + "의 연봉 : " + (int)(ind[i].getSalary() + (ind[i].getSalary()*ind[i].getBonusPoint()))*12 + "원");
	
		 }
		 
		 System.out.println("============================================================================");
		 
		 int num = 0;
		 for(int i = 0; i < ind.length; i++) {
			num += (int)(ind[i].getSalary() + (ind[i].getSalary()*ind[i].getBonusPoint()))*12;
				
					 }System.out.println("직원들의 연봉의 평균 : " + num/3 + "원");
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	

}
