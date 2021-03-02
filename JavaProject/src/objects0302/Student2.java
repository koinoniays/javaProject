package objects0302;

public class Student2 {
	// 필드
	private String name; //private 해당 클래스 안에서는 name 필드에 접근가능
	private int eng;
	private int math;
	
	// 생성자
	Student2() { //생성자도 접근제한자 사용 가능
		
	}
	Student2(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		
	}
	
	// 메소드
	void showInfo() {
		System.out.println("이름 - " + this.name + " 영어 - " + this.eng + " 수학 - " + this.math);
	}
	
	public void setName(String name) {
		this.name = name;  // private 필드를 사용하려면 public메소드를 사용하여 컨트롤
	}
	public void setEng(int eng) {
		if(eng<0){			// 사용자가 잘못된 값을 넣지 못하도록 하기위해 private사용
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
