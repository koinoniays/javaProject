package inheritances0305;

public class Friend {
	String name;
	String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
}
