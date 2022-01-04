package instance.mvc_practice.controller;

import instance.mvc_practice.model.vo.Member;

public class MemberController {

	Member mem = new Member("admin", "1234", "홍길동", "901022-1562334", 163.0 );
	
	
	public int login(String id, String pwd) {
		
		if(id.equals(mem.getMemberld()) && pwd.equals(mem.getMemberPwd())) {
			return 1;
		}else {
			return 0;
		}

	}
	
	public Member readinfo() {
		
	
		return  mem;
	}
	
	public int readAge() {
		
	int r =	Integer.parseInt(mem.getCitizenNo().substring(0,2));
	
	if(r <= 22 ) {
		return 22-r+1;
	}else {
		return 122-r+1;
	}
		

	}
	
	public void updateHeight(double height) {
		
	mem.setHeght(height);
	}
	
	
}
