package practice;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = (0.5 *(lengthTop + lengthBottom) * height );
		System.out.println("area1: " + area);
		
		area = getRecArea(lengthTop, lengthBottom, height);
		System.out.println("area2: " + area);
	}
	// ��ٸ� ���� ���̸� ���ϴ� �޼ҵ�
	public static double getRecArea(int top, int bottom, int height) {
		double area = (double)(top + bottom) / 2 * height;
		return area;
	}
}
