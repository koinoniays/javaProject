package objects0302;

public class Student3 {
	
	//private 필드
	private String name;
	private int eng;
	private int math;
	
	//public 생성자
	public Student3() {
		
	}
	
	// 마우스 오른쪽 - source - Generate Constructor using Fields 하면 쉽게 생성자 생성가능
	public Student3(String name, int eng, int math) {
		this.name = name; //this.name의 뜻 - 해당 클래스가 참조하는 네임필드
		this.eng = eng;	  //매개변수 name과 헷갈리지 않기위해 쓴다
		this.math = math;
	}
	
	
	// 마우스 오른쪽 - source - Generate Getters and Setters 메소드 생성
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
