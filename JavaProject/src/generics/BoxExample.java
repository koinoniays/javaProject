package generics;

public class BoxExample {

	public static void main(String[] args) {
		String str = new String("apple");
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		Box<Apple> box = new Box<Apple>();
		box.setBox(apple);
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.setBox(orange);
		
//		String newStr = box.getBox();
//		Apple newApple = box.getbox();
//		Orange newOrange = box.getBox();

	}

}
