package MemberManagementPackage;

public class Members {
	private String code;
	private String sex;
	private String name;
	private String age;
	private String phone;
	private String addr;
	private String year;
	private String department;
	private String sclass;
	private String rank;
	private String aincome;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getAincome() {
		return aincome;
	}
	public void setAincome(String aincome) {
		this.aincome = aincome;
	}
	public int getbyte()
	{
		int n=0;
		n = this.code.getBytes().length
		+this.sex.getBytes().length
		+this.name.getBytes().length
		+this.age.getBytes().length
		+this.phone.getBytes().length
		+this.addr.getBytes().length
		+this.year.getBytes().length
		+this.department.getBytes().length
		+this.sclass.getBytes().length
		+this.rank.getBytes().length
		+this.aincome.getBytes().length;
		
		return n;
	}
}
