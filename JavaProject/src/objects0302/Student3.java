package objects0302;

public class Student3 {
	
	//private �ʵ�
	private String name;
	private int eng;
	private int math;
	
	//public ������
	public Student3() {
		
	}
	
	// ���콺 ������ - source - Generate Constructor using Fields �ϸ� ���� ������ ��������
	public Student3(String name, int eng, int math) {
		this.name = name; //this.name�� �� - �ش� Ŭ������ �����ϴ� �����ʵ�
		this.eng = eng;	  //�Ű����� name�� �򰥸��� �ʱ����� ����
		this.math = math;
	}
	
	
	// ���콺 ������ - source - Generate Getters and Setters �޼ҵ� ����
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	

}
