package inheritances0305;

public class CellPhoneEx2 {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = (CellPhone) new DmbPhone(); // int = (int) byte 자동형태변환
//		cp = new SmartPhone(); // 모든 자식클래스의 인스턴스를 담을수 있음
		
		cp.color = "";
		
		if(cp instanceof DmbPhone) { // 현재 cp에는 CellPhone객체가 담겨져 있기때문에
		DmbPhone dp = (DmbPhone) cp; 
		dp.model = "";
		dp.color = "";
		dp.channel = 15; 
		dp.powerOn();
		} else {
			System.out.println("Casting할 수 없습니다.");
		}
		
		// 다형성
		// 부모클래스 = 자식들...
		// 부모.메소드 = 자식.메소드;
		cp = new DmbPhone();
		cp.powerOn();
		
		cp = new SmartPhone();
		cp.powerOn();
	}

}
