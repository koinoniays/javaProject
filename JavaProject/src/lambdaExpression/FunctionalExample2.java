package lambdaExpression;
// 매개값이 있는 람다식

@FunctionalInterface // 메소드가 2개가 정의되면 에러를 일으켜줌
interface MyFunctionInterface {
	void run(String str);
	
}
public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mfi = (str) -> System.out.println(str + "을 실행합니다.");
			
		mfi.run("run()");
		mfi.run("call()");
	}
}
