package polymophism3.model.vo;

public class Cat extends Animal{

	private String location;
	private String color;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, String kind, String location, String color) {
		super(name, kind);
		this.location = location;
		this.color = color;
	}
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void speak() {
	System.out.println(super.toString() + " " + location + "에 서식하며, 색상은 " + color + "입니다. ");
		
	}

	@Override
	public String toString() {
		return super.toString() + " " + location + "에 서식하며, 색상은 " + color + "입니다. ";
	}
	
	
	
}
