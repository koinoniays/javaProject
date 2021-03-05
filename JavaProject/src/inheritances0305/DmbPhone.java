package inheritances0305;

// 자식클래스 : extends + 부모클래스
public class DmbPhone extends CellPhone {
	// CellPhone(부모클래스)+자식클래스 추가 가능
	int channel;
	
	// 생성자
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널: " + channel + " 방송을 수신합니다.");
	}
	
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + " 로 변경합니다.");
	}
	
	void turnOffDmb() {
		System.out.println("방송을 종료합니다.");
	}
	
	// 메소드 재정의(@Override) source - 오버라이드
	// DmbPhone이 가지고 있는 메소드
	@Override
	void powerOn() {
		System.out.println("DmbPhone 전원을 켭니다.");
		// super.powerOn(); //super = 부모클래스가 가지고있는 메소드를 호출
	}

	@Override
	void powerOff() {
		System.out.println("DmbPhone 전원을 끕니다.");
	}

	@Override
	void bell() {
		System.out.println("DmbPhone 벨이 울립니다.");
	}
	
	@Override
	public String toString() {
		return "DmbPhone => model : " + model + "color : " + color + "channel : " + channel;
	
	}
	
}
