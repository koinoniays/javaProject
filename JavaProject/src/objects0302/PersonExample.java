package objects0302;

public class PersonExample {

	public static void main(String[] args) {
//		Person person = new Person();
//		
//		person.name = "홍길동";
//		person.age = 20;
//		
//		person.eat();
//		person.sleep();
//		person.walk();
//		person.introduce();
//		
//		
//		
//		Person person1 = new Person();
//		
//		person1.name = "김길동";
//		person1.age = 21;
//		
//		person1.eat();
//		person1.sleep();
//		person1.walk();
//		person1.introduce();

		
		
		// (문자열:이름, 정수:나이)를 배열로 선언하기 위해선 (String[], int[])으로 타입을 맞춰줘야하지만
		// 클래스 Person[] : 클래스 타입 배열은 (String, int) 타입 상관없이 선언가능
		
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.5, 72.5);
		persons[1] = new Person("김길동", 25, 125.5, 32.5);
		persons[2] = new Person("이길동", 22, 185.5, 82.5);
		persons[3] = new Person("박길동", 19, 145.5, 42.5);
		persons[4] = new Person("최길동", 35, 185.5, 82.5);
		for (Person person : persons) { // 향상된 for문
			if (person.age > 20 && person.height > 180.0) {
				person.introduce();
			}
		}
	}
}
