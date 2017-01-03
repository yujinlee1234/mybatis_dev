package kr.or.dgit.bigdata.mybatis_dev.dto;

import java.util.List;

public class Tutor {
	private int tutorId;
	private String name;
	private String email;
	private PhoneNumber phone;
	private Address address;
	private List<Course> course;
	public int getTutorId() {
		return tutorId;
	}
	public void setTutorId(int tutorId) {
		this.tutorId = tutorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return String.format("Tutor [%s, %s, %s, %s, %s, %s]", tutorId, name,
				email, phone, address, course);
	}
	
	
}
