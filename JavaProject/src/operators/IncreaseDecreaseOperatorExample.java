package operators;

public class IncreaseDecreaseOperatorExample {
//증감연산자
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println(x++); //= 연산처리 후 증감결과 반영
		System.out.println(++x);
		System.out.println(x);
		System.out.println("--------------");
		
		z = ++x + ++y;
		System.out.println("z: " + z + ", x: " + x + ", y:" + y);		
	}

}
