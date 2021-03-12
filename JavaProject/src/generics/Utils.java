package generics;


public class Utils {
	public <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setBox(t);
		return box;
	}
	
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K,V> p2) {
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return KeyCompare && valueCompare;
	}
	// 메소드 오버로딩
	public static <T> int compare(T t1, T t2) {
		return 0;
	}
	
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
