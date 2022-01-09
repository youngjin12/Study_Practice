package polymophism.model.vo;

public class AniBook extends Book{

	private int accessAge;
	
	public AniBook() {
		// TODO Auto-generated constructor stub
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	/**
	 * @return the accessAge
	 */
	public int getAccessAge() {
		return accessAge;
	}

	/**
	 * @param accessAge the accessAge to set
	 */
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + " 제한나이 : " + accessAge;
	}
	
	
	
	
}
