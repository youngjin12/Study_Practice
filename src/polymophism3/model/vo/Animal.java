package polymophism3.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;

	protected Animal() {
		// TODO Auto-generated constructor stub
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the kinds
	 */
	public String getKinds() {
		return kinds;
	}

	/**
	 * @param kinds the kinds to set
	 */
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak();
		

}
