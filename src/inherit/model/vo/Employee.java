package inherit.model.vo;

public class Employee extends Person{

	private int salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public void setname() {
		this.name = name;
	}
	
	public String getname() {
		return name;
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

	
	public String information() {
		return super.information() + ", 월급 : " + salary + ", 부서 : " + dept;
	}
	
	
	
	
}
