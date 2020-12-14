package SINHVIEN_PRO;

public class SINHVIEN {
	int id;
	String fullname, gender, email, phoneNumber;
	int age;
	public SINHVIEN(int id, String fullname, String gender, String email,
			String phoneNumber, int age) {
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	
	public SINHVIEN(String fullname, String gender, String email,
			String phoneNumber, int age) {
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}

