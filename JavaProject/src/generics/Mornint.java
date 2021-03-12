package generics;

public class Mornint {

	public static void main(String[] args) {
		checkGendar("111111-22222222");
		
		//두 수의 합을 구하고 합의 결과를 3자리단위로 보여주는 메소드
		sum("100000", "234000");
	}
	
	public static void sum(String a, String b) {
		System.out.println(a + b);
	}
	public static String checkGendar (String j) {
		char x = j.charAt(7);
		if(x == '1' || x == '3') {
			System.out.println("남자");
		} else if ( x == '2' || x == '4') {
			System.out.println("여자");
		}
		
		return j;
		
	}
}
