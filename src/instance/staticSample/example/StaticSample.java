package instance.staticSample.example;

public class StaticSample {
	private String value;

public StaticSample() {
	// TODO Auto-generated constructor stub
}	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	public void toUpper() {
	
		System.out.println("대문자로 : " + value.toUpperCase());

	}
	
	public void setChar(int index, char c) {
		StringBuilder str = new StringBuilder(value.toUpperCase());
		String s = value;
		str.setCharAt(index, c);
		System.out.println("J => C : " + str);
	}
	
	public int valueLength() {
		
		System.out.println("길이 : " + value.length());
		
		return 0;
	}
	
	public String valueConcat(String str) {
		
		System.out.println("PROGRAMMING 붙여서 " + (value.toUpperCase()+str));
		
		return "";
	}

}
