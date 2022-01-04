package instance.staticSample.run;

import instance.staticSample.example.StaticSample;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticSample s = new StaticSample();
		
		s.setValue("Java"); 
		System.out.println("value : " + s.getValue());
		
		s.toUpper();
		s.valueLength();
		s.valueConcat("PROGRAMMING");
		s.setChar(0, 'C');
	}

}
