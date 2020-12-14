package baiso7;

public class SINHVIEN {
	private int id;
	private String fullname;
	private int gender;
	private String email;
	private int phone;
	private int age;

	public SINHVIEN() {
	}

	public SINHVIEN(String fullname, int gender, String email, int phone, int age) {
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	public SINHVIEN(int id, String fullname, int gender, String email, int phone, int age) {
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
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

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
