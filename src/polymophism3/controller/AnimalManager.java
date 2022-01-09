package polymophism3.controller;

import polymophism3.model.vo.Animal;
import polymophism3.model.vo.Cat;
import polymophism3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a = new Animal[5];

		a[0] = new Dog("불독" , "개" , 10);
		a[1] = new Dog("골든리트리버" , "개" , 20);
		a[2] = new Cat("사막여우" , "여우" , "사막" , "주황색");
		a[3] = new Dog("치와와" , "개" , 5);
		a[4] = new Cat("사바나캣" , "고양이" , "사막" , "흰색");
		
		
		
		for(int i = 0; i < a.length; i++) {
			     a[i].speak();
		}
		
	}

}
