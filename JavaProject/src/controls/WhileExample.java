package controls;

public class WhileExample {

	public static void main(String[] args) {

		// for (�ʱⰪ; ���ǽ�; ������;)
		int sum = 0;
		int i = 1; 					// �ʱⰪ
		while (i <= 10) { 			// ���ǽ�
			sum = sum + i;			// ���๮
			i++; 					// ������
		}
		System.out.println("1 ~ 10 ��: " + sum);
		
		
		i = 1;
		sum = 0;
		while (true) {
			sum = sum + i;
			if (i >= 10) {
				break;
			}
			i++; 					//��ġ�߿�
		}
		System.out.println("1 ~ 10 ��: " + sum);
		
	}
}
