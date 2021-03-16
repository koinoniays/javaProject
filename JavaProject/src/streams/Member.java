package streams;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.sex + this.age;

	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member) obj;
		return this.name.equals(member.name)
				&& this.age == member.age 
				&& this.sex == member.sex;
				}

	@Override
	public String toString() {
		return "Member [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	

}
