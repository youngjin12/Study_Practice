package instance.nonStaticSample.run;

import java.util.Scanner;

import instance.nonStaticSample.example.NonStaticSample;


public class Run {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NonStaticSample nss = new NonStaticSample();
		
	/*	System.out.println("정수 : ");
		int d = sc.nextInt();
		System.out.print("크기가 " + d + "인 랜덤값 : ");
		int[] ind = nss.intArrayAllocation(d);
		//for(int i = 0; i < ind.length; i++) {
		//	System.out.print(ind[i] + " ");
			
		nss.display(ind);*/
		
		//nss.countChar("banana", 'n');
		
		//nss.totlaValue(13, 7);
		
		//nss.pCharAt("programming", 3);
		
		nss.pConcat("JAVA", "programming");
		}
		
		
	}


