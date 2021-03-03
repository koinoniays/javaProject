package objects0303;

public class Calculator {
	double pi = 3.14;
	
	// static이 없으면 인스턴스 생성해야 함
	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;
	}
	
	// static는 인스턴스를 만들지 않아도 사용할 준비가 되어있다는 뜻
	public static double getRect(double d1, double d2) {
		double result = d1 * d2;
		return result;
	}

}
