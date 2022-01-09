package api.controller;

import java.util.StringTokenizer;

public class TokenController {

	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		String s = "";
		while(st.hasMoreTokens()) {
			s += st.nextToken();
		}
		
		return s;
	}
	
	public String firstCap(String input) {
		
		 String re = input.toUpperCase().charAt(0) + input.substring(1);
		
		return re;
		
	}
	
	public int findChar(String input, char one) {
		int count = 0;
	
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}return count;
		
		
	}
	
	
	
}
