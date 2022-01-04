package variable.run;

import java.util.Arrays;

import variable.example.VariablePractice;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablePractice v = new VariablePractice();
		//v.method1();
		//v.method2();
		//v.method3();
		//v.method4();
		
		
		int[] a = {1,2,3,4};
		int[] b = new int[a.length];
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.println(Arrays.toString(b));
	}

}
