package polymophism3.model.vo;

public class Dog extends Animal{

	public static String PLACE = "애견카페";

	private int weight;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Dog(String name, String kind, int weight) {
		super(name, kind);
		this.weight = weight;
	}

    

	/**
	 * @return the pLACE
	 */
	public static String getPLACE() {
		return PLACE;
	}



	/**
	 * @param pLACE the pLACE to set
	 */
	public static void setPLACE(String pLACE) {
		PLACE = pLACE;
	}



	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}



	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}



	@Override
	public void speak() {
		System.out.println(super.toString() + " 몸무게는 " + weight + "kg 입니다.");
		
	}



	@Override
	public String toString() {
		return super.toString() + " 몸무게는 " + weight + "kg 입니다.";
	}
	
	
}
