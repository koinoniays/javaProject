package references;

public class intAry {

	public static void main(String[] args) {
		int[] intAry = { 4, 8, 3 };
		for (int i = 0; i < intAry.length; i++) {
			for (int j = i + 1; j < intAry.length; j++) {
				if(intAry[i]>intAry[j]) {   
					int temp = intAry[i]; 
					intAry[i] = intAry[j];  
					intAry[j] = temp;		// temp의 값이 intAry[j]에 담겨 값이 바뀜
				}
			}
			System.out.println(intAry[i]);
		}
	}
}