package lambdaExpression;
// �Ű����� �ִ� ���ٽ�

@FunctionalInterface // �޼ҵ尡 2���� ���ǵǸ� ������ ��������
interface MyFunctionInterface {
	void run(String str);
	
}
public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mfi = (str) -> System.out.println(str + "�� �����մϴ�.");
			
		mfi.run("run()");
		mfi.run("call()");
	}
}
