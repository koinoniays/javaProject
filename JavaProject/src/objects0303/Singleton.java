package objects0303;

// 싱글톤 
public class Singleton {
	// 필드
	private static Singleton singleton = new Singleton();
	// 자신의 타입으로 정적 필드 선언 자신의 객체를 생성해 초기화
	// private를 붙여 외부에서 필드 값 변경 불가하도록

	// 생성자 - 외부에서 호출 못하도록
	private Singleton() {

	}

	// 메소드 외부에서 호출 가능하도록
	public static Singleton getInstance() {
		return singleton;
	}
}
