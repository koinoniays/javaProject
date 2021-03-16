package lambdaExpression;

interface MyFuntionInterface {
	void run(); // 구현해야 할 메소드가 하나만 있는 인터페이스 : FunctionalInterface
}

class MyFunctionClass implements MyFuntionInterface {

	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}
}


public class FunctionalExample {
	public static void main(String[] args) {
		MyFuntionInterface mif = new MyFuntionInterface() {

			@Override
			public void run() {
				System.out.println("run()를 실행합니다.");
			}
			
		}; // 익명 구현 객체
		mif.run();
		
		// 람다 표현식
		mif = () -> 
			System.out.println("run() 메소드를 실행합니다.");
		
		mif.run();
	}

}
