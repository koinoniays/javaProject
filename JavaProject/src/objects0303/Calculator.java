package objects0303;

public class Calculator {
	double pi = 3.14;
	
	// static�� ������ �ν��Ͻ� �����ؾ� ��
	public double getArea(double radius) {
		double result = pi * radius * radius;
		return result;
	}
	
	// static�� �ν��Ͻ��� ������ �ʾƵ� ����� �غ� �Ǿ��ִٴ� ��
	public static double getRect(double d1, double d2) {
		double result = d1 * d2;
		return result;
	}

}
