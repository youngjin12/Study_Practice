package inherit.model.vo;

public class Student extends Person{
	
	private int grade; 
	private String major;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}

	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}


	public String information() {
		return super.information() + ", 학년 : " + grade + ", 전공 : " + major;
	}
	
	
	
	
}
