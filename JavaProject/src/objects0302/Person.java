package objects0302;

public class Person {
	
	// 필드
	String name;
	int age;
	double weight;
	double height;
	
	//기본 생성자
	Person() {
		
	}
	
	// Person[] 배열 생성자
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	
	
	}
	// 메소드
	void eat() {
		System.out.println("밥을 먹습니다.");
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	void walk() {
		System.out.println("걷습니다.");
	}
	void introduce() {
		System.out.println("이름은 : " + this.name + ", 나이는 : " + this.age + " 입니다.");
	}
}
