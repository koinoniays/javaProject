package objects0303;

public class SingletonExample {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();  클래스에서 생성자를 private 타입으로 설정하여 객체생성 불가 
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("자바", "저자", "출판사", 1000);
		Book b2 = new Book("자바", "저자", "출판사", 1000);
		
		System.out.println(s1 == s2);
		System.out.println(b1 == b2);

	}

}
