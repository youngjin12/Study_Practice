package inherit.model.vo;

public class Person {

	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String information() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight;
	}
	
	
	
}
