package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("ȫ�浿", 15); // put ���� ��� �޼ҵ�
		map.put("��μ�", 20);
		map.put("�ڼҿ�", 23);
		map.put("ȫ�浿", 25); // 15���ƴ� 25����µ�
		
		Integer result = map.get("ȫ�浿"); // get�޼ҵ忡 key�Ű������Է��ϸ� value���� �������ش�
		
		Set<String> set = map.keySet(); // key�� �ش�Ǵ� �κ��� �������� �޼ҵ�
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
		
//		Iterator<String> iter = set.iterator(); //	�ݺ���
//		while(iter.hasNext()) {
//			String key = iter.next(); // next�޼ҵ�� key���� �����´�
//			Integer val = map.get(key);
//			System.out.println("key: " + key + ", val: " + val); //set�÷����� ������ ���� �������� ����
//		}
//		
//		Map<Integer, String> sMap = new HashMap<>();
//		String sResult = sMap.get(10);
		

	}

}
