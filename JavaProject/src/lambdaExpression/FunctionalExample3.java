package lambdaExpression;
// 리턴타입이 있는 람다식

@FunctionalInterface // 생략가능하나 체크를 위해 씀
interface MyFuncInterface {
	int run(int a, int b);
}
public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (a, b) ->	a + b;			

		int result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
		
		mfi = (num1, num2) -> num1 * num2;
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
		
		mfi = (aa, bb) -> {
			return (aa * bb) / 2;
		};
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result);
	}
}
