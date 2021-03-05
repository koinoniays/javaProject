package inheritances0305;

public class CellPhoneEx {

	public static void main(String[] args) {
		// CellPhone 기본 생성자를 호출하여 인스턴스 생성
		CellPhone cp = new CellPhone(); 
		// 필드입력
		cp.model = "Galaxy";
		cp.color = "White";
		// 메소드
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		// 선언한 부모클래스가 없어도 모든 클래스에는 object클래스(최상위클래스)가 있다.
		cp.equals("");
		cp.getClass();
		cp.toString();
		
		
		System.out.println("================================");
		
		// CellPhone(부모클래스) 사용 가능
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.turnOffDmb();
		dp.powerOff();
		
		System.out.println("================================");
		
		// CellPhone, DmbPhone 둘다 사용가능
		SmartPhone sp = new SmartPhone();
		
		sp.model = "LGPhone";
		sp.color = "Pink";
		
		sp.commonMethod();
		System.out.println("================================");
		
		//toString 오버라이딩 결과
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
	}
	

}
