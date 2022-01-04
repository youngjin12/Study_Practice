package instance.mvc_practice.model.vo;

public class Member {

	private String memberld;
	private String memberPwd;
	private String memberName;
	private String citizenNo;
	private double heght;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	
	public Member(String memberld, String memberPwd, String memberName, String citizenNo, double heght) {
		super();
		this.memberld = memberld;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.citizenNo = citizenNo;
		this.heght = heght;
	}


	/**
	 * @return the memberld
	 */
	public String getMemberld() {
		return memberld;
	}

	/**
	 * @param memberld the memberld to set
	 */
	public void setMemberld(String memberld) {
		this.memberld = memberld;
	}

	/**
	 * @return the memberPwd
	 */
	public String getMemberPwd() {
		return memberPwd;
	}

	/**
	 * @param memberPwd the memberPwd to set
	 */
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	/**
	 * @return the memberName
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * @param memberName the memberName to set
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	/**
	 * @return the citizenNo
	 */
	public String getCitizenNo() {
		return citizenNo;
	}

	/**
	 * @param citizenNo the citizenNo to set
	 */
	public void setCitizenNo(String citizenNo) {
		this.citizenNo = citizenNo;
	}

	/**
	 * @return the heght
	 */
	public double getHeght() {
		return heght;
	}

	/**
	 * @param heght the heght to set
	 */
	public void setHeght(double heght) {
		this.heght = heght;
	}


	public String information() {
		return "Member [memberld=" + memberld + ", memberPwd=" + memberPwd + ", memberName=" + memberName
				+ ", citizenNo=" + citizenNo + ", heght=" + heght + "]";
	}
	
	
	
	
	
	
	
	
}
