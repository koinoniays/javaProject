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
		strList.add("Hello"); //0�ε���
		strList.add("Nice");  //1�ε���
		strList.add("Good");  //2�ε���
		strList.add(0, "Very");
		
		for(int i = 0; i < strList.size(); i++) {
			strList.get(i); //�ش� �ε��� ��ġ�� ���� �������� ��
			
		}
		
		strList.remove(2); // �������� ���� �ε����� ��ȣ��
	
		
		
		
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
