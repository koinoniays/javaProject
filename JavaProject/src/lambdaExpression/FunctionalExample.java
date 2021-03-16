package lambdaExpression;

interface MyFuntionInterface {
	void run(); // �����ؾ� �� �޼ҵ尡 �ϳ��� �ִ� �������̽� : FunctionalInterface
}

class MyFunctionClass implements MyFuntionInterface {

	@Override
	public void run() {
		System.out.println("run�� �����մϴ�.");
	}
}


public class FunctionalExample {
	public static void main(String[] args) {
		MyFuntionInterface mif = new MyFuntionInterface() {

			@Override
			public void run() {
				System.out.println("run()�� �����մϴ�.");
			}
			
		}; // �͸� ���� ��ü
		mif.run();
		
		// ���� ǥ����
		mif = () -> 
			System.out.println("run() �޼ҵ带 �����մϴ�.");
		
		mif.run();
	}

}
