package controls;

public class Morning0224 {

	public static void main(String[] args) {
		int n1;
		int n2;
		n1 = (int) (Math.random() * 100) + 1;
		n2 = (int) (Math.random() * 100) + 1;
		int n3 = (n1 + n2) / 2;
		String str = " ";

		if (n3 >= 90) {
			str = "��";
		} else if (n3 >= 80) {
			str = "��";
		} else if (n3 >= 70) {
			str = "��";
		} else {
			str = "��";
		}
		System.out.println("���� : " + n1 + "\t ���� : " + n2);
		System.out.println("��� ������ " + str + "�Դϴ�.");

		getAverage(n1, n2);

	}

	public static String getAverage(int n1, int n2) {
		n1 = (int) (Math.random() * 100) + 1;
		n2 = (int) (Math.random() * 100) + 1;
		int n3 = (n1 + n2) / 2;
		String str = " ";

		if (n3 >= 90) {
			str = "��";
		} else if (n3 >= 80) {
			str = "��";
		} else if (n3 >= 70) {
			str = "��";
		} else {
			str = "��";
		}
		System.out.println("���� : " + n1 + "\t ���� : " + n2);
		System.out.println("��� ������ " + str + "�Դϴ�.");

		return str;
	}

}
