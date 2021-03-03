package objects0303;

import objects0302.Student;

public class MethodExample {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("매개값[" + i + "] : " + args[i]); 
		} // run Configurations...

		Calculator cal = new Calculator(); // Calculator 클래스의 기본 생성자 생성
		double result = cal.getArea(3.5);

		Calculator.getRect(4.5, 2); // static
	}

}
