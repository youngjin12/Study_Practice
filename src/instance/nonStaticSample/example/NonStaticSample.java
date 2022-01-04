package instance.nonStaticSample.example;

import java.util.Arrays;
import java.util.Scanner;

public class NonStaticSample {
Scanner sc = new Scanner(System.in);
	public int[] intArrayAllocation(int length) {
		
		int[] ind = new int[length];
		for(int i = 0; i < ind.length; i++) {
			ind[i] = (int)(Math.random()*100+1);
			
		}return ind;
		
		
	}
	
	public void display(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("인덱스1 : ");
		int i1 = sc.nextInt();
		System.out.println("인덱스2 : ");
		int i2 = sc.nextInt();
		
		swap(arr, i1, i2);
		sortDescending(arr);
		sortAscending(arr);
		
	}
	
	public void swap(int[] arr , int idx1 , int idx2) {
		
		int[] t = new int[10];
	//	for(int i = 0; i < arr.length; i++) {
		
			for(int i = 0; i < arr.length; i++) {
				 t[0] = arr[idx1];
				arr[idx1] = arr[idx2];
				arr[idx2] = t[0];
				
			}System.out.print(Arrays.toString(arr));
			
		}
		

	
	public void sortDescending(int[] arr) {
		System.out.println();
		int t;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				
					
				}
			}
		}System.out.print("내림차순 : " + Arrays.toString(arr));
		
		
		
		
	}
	
	public void sortAscending(int[] arr) {
		System.out.println();
		Arrays.sort(arr);
		System.out.println("오름차순 : " + Arrays.toString(arr));
		
	}
	
	public int countChar(String str, char c) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}System.out.println(str + "문자열에 " + c + "의 갯수 : " + count);
		return 0;
		
	}
	
	public int totlaValue(int num1, int num2) {
		
		if(num1 < num2) {
			int sum = 0;
			for(int i = 1; i < num2-num1; i++) {
				sum += num1+i; 
			}
			System.out.println(num1 + "과" + num2 + "사이 정수들의 합계 : " + sum);
		}else {
			int sum = 0;
			for(int i = 1; i < num1-num2; i++) {
				sum += num2+i; 
			}		System.out.println(num2 + "과" + num1 + "사이 정수들의 합계 : " + sum);
		}
		return 0;
	}
	
	public char pCharAt(String str, int index) {
		System.out.print(str+ "문자열의 " + index + "번 인덱스 문자 : ");
		for(int i = 0; i < str.length(); i++) {
			if(i == index) {
				System.out.print(str.charAt(i));
			}
		}
		
		
		return 's';
	}
	
	public String pConcat(String str1 , String str2) {
		
		System.out.println(str1 + "와 " + str2 + "을 합친 문자열 : " +str1+str2);
		
		return null;
	}
	
	
	
	
	
}
