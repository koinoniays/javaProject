package inheritances0305;

// 상속받은 클래스를 또 상속받을수있다
public class SmartPhone extends DmbPhone {
	@Override
	public String toString() {
		return "SmartPhone => model : " + model + "color : " + color;
	}
	
	@Override
	void powerOn() {
		System.out.println("SmartPhone 전원을 켭니다.");
		// super.powerOn(); //super = 부모클래스가 가지고있는 메소드를 호출
	}

	@Override
	void powerOff() {
		System.out.println("SmartPhone 전원을 끕니다.");
	}

}
