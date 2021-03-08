package inheritances0305;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모 클래스가 가지고 있는 생성자 호출
	}
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크***");
			return false;
		}
	}
}
