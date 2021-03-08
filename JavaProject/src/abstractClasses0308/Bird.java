package abstractClasses0308;
//Animal이 가지고있는 추상메소드들을 모두 구현해야함
public class Bird extends Animal {

	public Bird(String species) {
		super(species);
	}
	@Override
	public void sound() {
		System.out.println("짹짹");
		
	}

}
