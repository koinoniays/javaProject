package objects1;

public class Student {
	private String stdId;
	private String stdName;
	private int age;
	private String stdPhone;
	private int stdScore;
	
	public Student() {}
	public Student(String strId, String stdName, int age,
			String stdPhone, int stdScore) {
		this.stdId = strId;
		this.stdName = stdName;
		this.age = age;
		this.stdPhone = stdPhone;
		this.stdScore = stdScore;
	}
	
	
	
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public int getStdScore() {
		return stdScore;
	}
	public void setStdScore(int stdScore) {
		this.stdScore = stdScore;
	}
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", age=" + age + ", stdPhone=" + stdPhone
				+ ", stdScore=" + stdScore + "]";
	}
	
	
	
	
	
	
}
