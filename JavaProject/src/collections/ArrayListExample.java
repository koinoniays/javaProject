package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] strAry = new String[10];
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i] != null) {
//				System.out.println(strAry[i]);
			}
		}
		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		
		List<String> strList = new ArrayList<>();
		strList.add("Hello"); //0인덱스
		strList.add("Nice");  //1인덱스
		strList.add("Good");  //2인덱스
		strList.add(0, "Very");
		
		for(int i = 0; i < strList.size(); i++) {
			strList.get(i); //해당 인덱스 위치의 값을 가져오는 것
			
		}
		
		strList.remove(2); // 지우고싶은 값의 인덱스를 괄호에
	
		
		
		
//		for(int i =0; i < 50; i++) {
//			strList.add(String.valueOf(i));
//		}
//		strList.add(100);
//		for(Object obj : strList) {
//			String str = (String)obj;
//			System.out.println(str);
//		}
	}

}
