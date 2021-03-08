package interfaces0308;
// 인터페이스
public interface RemoteControl {
	static final int MAX_VOLUMR = 10;		//인터페이스의 필드는 상수(바꿀 수 없는 값)
	static final int MIN_VOLUME = 0;		//static final 생략 가능
	
	void turnOn(); //추상메소드(구현부분이 없음)
	void turnOff();
	void setVolume(int volume);
}
