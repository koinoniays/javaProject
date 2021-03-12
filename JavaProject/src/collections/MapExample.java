package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 15); // put 값을 담는 메소드
		map.put("김민수", 20);
		map.put("박소연", 23);
		map.put("홍길동", 25); // 15가아닌 25가출력됨
		
		Integer result = map.get("홍길동"); // get메소드에 key매개값을입력하면 value값을 리턴해준다
		
		Set<String> set = map.keySet(); // key에 해당되는 부분을 가져오는 메소드
		for(String key : set) {
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + val);
		}
		
//		Iterator<String> iter = set.iterator(); //	반복자
//		while(iter.hasNext()) {
//			String key = iter.next(); // next메소드로 key값을 가져온다
//			Integer val = map.get(key);
//			System.out.println("key: " + key + ", val: " + val); //set컬렉션은 순서가 없이 무작위로 나옴
//		}
//		
//		Map<Integer, String> sMap = new HashMap<>();
//		String sResult = sMap.get(10);
		

	}

}
