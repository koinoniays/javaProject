package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 10);
		map.put("김민수", 20);
		map.remove("홍길동");
		
		Integer result = map.get("홍길동"); // get메소드
		System.out.println("key: 홍길동" + ", val: " + result);
		if(map.containsKey("홍길동")) {
			System.out.println("key: 홍길동" + ", val: " + result);
		}
		
		Set<String> set = map.keySet(); // key 값만 가지고오는 메소드
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			Integer val = map.get(key);
			System.out.println("key: " + key + ", val: " + result);
		}
		// Map.Entry<String, Integer>
		Set<Entry<String, Integer>> entSet = map.entrySet(); // key value 둘다 가져오는 메소드
		Iterator<Entry<String, Integer>> entIter = entSet.iterator();
		while(entIter.hasNext()) {
			Entry<String, Integer> ent = entIter.next();
			String key = ent.getKey();
			Integer val = ent.getValue();
			System.out.println("key: " + key + ", val: " + result);
		}
	}
}
