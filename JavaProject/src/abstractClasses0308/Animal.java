package abstractClasses0308;
// 추상클래스
public abstract class Animal {
	String species;
	
	public Animal() {
		
	}
	public Animal(String species) {
		this.species = species;
	}
	
	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다.");
	}
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	// 추상클래스에 오는 추상메소드 : 기능없이 메소드만 정의, 상속되는 메소드에 반드시 정의해야함
	public abstract void sound();
	
	
}
