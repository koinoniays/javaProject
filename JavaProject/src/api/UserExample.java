package api;

import java.util.HashMap;


public class UserExample {

	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		System.out.println("hello2".hashCode());
		
		User user1 = new User();
		user1.userId = "user1";
		user1.score = 80;
		User user2 =new User();
		user2.userId = "user2";
		user2.score = 90;
		
		System.out.println(user1 == user2);
		
		HashMap<User, String> hashMap = new HashMap<>();
		hashMap.put(user1, "홍길동");
		hashMap.put(user2, "박길동");
		
		String r1 = hashMap.get(user1);
		String r2 = hashMap.get(user2);
		// hashMap.get메소드로 key값으로 value값을 읽어올수있다
		// 중복된 값을 허용하지 않는다 ex) user1, "홍길동" / user1 "박길동" -안됨
		System.out.println(r1 + ',' + r2);
	} 

}
