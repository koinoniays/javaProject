package references;

public class AryExample {

	public static void main(String[] args) {
		arrayCopy();
		String[] names = { "�Ӽ���", "���ؿ�", "���ն�" };
		int[] scores = { 88, 89, 90 };
		for (int i = 0; i < scores.length; i++) {
			System.out.println(names[i] + "���� : " + scores[i]);
		}
//���� for��
		for (String name : names) {
			System.out.println(name);
		}
		int sum = 0;
		for (int score : scores) {
			System.out.println(score);
			sum = sum + score;
		}
		System.out.println("�հ����� : " + sum);
	}

//�迭 ����
	public static void arrayCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];

		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}

		System.out.println(newAry[0]);
		System.out.println(newAry[1]);
		System.out.println(newAry[2]);

		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 0, newAry2, 0, 3);
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		System.out.println(newAry2[3]);
		System.out.println(newAry2[4]);
	}

}
