package inherit.run;

import java.util.Scanner;

import inherit.model.vo.Employee;
import inherit.model.vo.Person;
import inherit.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		Student[] s = new Student[3];
		
		s[0] = new Student("홍길동", 20 , 178.2 , 70 , 1 , "정보시스템공학과");
		s[1] = new Student("김말똥", 21 , 187.3 , 80 , 2 , "경영학과");
		s[2] = new Student("강개순", 23 , 167.0 , 45 , 4 , "정보통신학과");
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].information());
		}
		
		Employee[] e = new Employee[10];
		int count = 0;
		while(true) {
			for(int i = 0; i < e.length; i++) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("키 : ");
			double height = sc.nextDouble();
			System.out.println("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.println("월급 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			System.out.println("부서 : ");
			String dept = sc.nextLine();
			
			
				e[i] = new Employee(name, age, height, weight, salary, dept); 
				
				count++;
				System.out.println("계속 추가하시겠습니까?(y | n) : ");
				String yn = sc.nextLine();
				
				if(yn.equalsIgnoreCase("y")) {
					continue;
				}else {
					for(int j = 0; j < count; j++) {
						System.out.println(e[j].information());
					}	
			}
				break;
			}return;
			
		}
		

	}

}
