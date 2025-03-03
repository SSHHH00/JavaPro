package zzgggo;

public class Member {

	String name;
	String id;
	String pss;
	int age;
	
	boolean login(String id, String pss) {
		
		return true;
	}
	
	public Member() {

	}
	public Member(String name) {
		this.name = name;
	}

	public Member(String name, String id) {
		this.name=name;
		this.id=id;
	}
}