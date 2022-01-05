package instanceArray2.example;

public class InstanceArray2 {
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public InstanceArray2() {
		// TODO Auto-generated constructor stub
	}

	public InstanceArray2(int grade, int classroom, String name, int kor, int eng, int math) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	 * @return the classroom
	 */
	public int getClassroom() {
		return classroom;
	}

	/**
	 * @param classroom the classroom to set
	 */
	public void setClassroom(int classroom) {
		this.classroom = classroom;
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
	 * @return the kor
	 */
	public int getKor() {
		return kor;
	}

	/**
	 * @param kor the kor to set
	 */
	public void setKor(int kor) {
		this.kor = kor;
	}

	/**
	 * @return the eng
	 */
	public int getEng() {
		return eng;
	}

	/**
	 * @param eng the eng to set
	 */
	public void setEng(int eng) {
		this.eng = eng;
	}

	/**
	 * @return the math
	 */
	public int getMath() {
		return math;
	}

	/**
	 * @param math the math to set
	 */
	public void setMath(int math) {
		this.math = math;
	}


	public String information() {
		return  grade + ", " + classroom + ", " + name + ", " + kor
				+ ", " + eng + ", " + math ;
	}
	
	
	
	
	
	
	
	
}
