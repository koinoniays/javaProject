package objects0302;

public class Student2 {
	// �ʵ�
	private String name; //private �ش� Ŭ���� �ȿ����� name �ʵ忡 ���ٰ���
	private int eng;
	private int math;
	
	// ������
	Student2() { //�����ڵ� ���������� ��� ����
		
	}
	Student2(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		
	}
	
	// �޼ҵ�
	void showInfo() {
		System.out.println("�̸� - " + this.name + " ���� - " + this.eng + " ���� - " + this.math);
	}
	
	public void setName(String name) {
		this.name = name;  // private �ʵ带 ����Ϸ��� public�޼ҵ带 ����Ͽ� ��Ʈ��
	}
	public void setEng(int eng) {
		if(eng<0){			// ����ڰ� �߸��� ���� ���� ���ϵ��� �ϱ����� private���
			this.eng = 0;
		}else {
			this.eng = eng;			
		}
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public String getName() {
		return this.name;
	}
}
