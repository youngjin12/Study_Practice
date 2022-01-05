package instanceArray.example;

public class InstanceArray {

	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	
	public InstanceArray() {
		// TODO Auto-generated constructor stub
	}


	public InstanceArray(int empNo, String empName, int age, char gender, 
			 String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
	}


	public InstanceArray(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}


	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}


	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}


	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}


	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}


	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}


	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}


	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
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
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}


	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}


	/**
	 * @return the bonusPoint
	 */
	public double getBonusPoint() {
		return bonusPoint;
	}


	/**
	 * @param bonusPoint the bonusPoint to set
	 */
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	public String information() {
		return  empNo + ", " + empName + ", " + dept + ", " + job + ", "
				+ age + ", " + gender + ", " + salary + ", " + bonusPoint + ", " + phone
				+ ", " + address ;
	}
	

	
	
	
}
