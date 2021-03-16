package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(85));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Iterator<Integer> iter = scores.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("---------------------------------");
		iter = scores.descendingIterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------------------------------");
		NavigableSet<Integer> nset = scores.descendingSet();
		for(Integer i : nset) {
			System.out.println(i);
		}
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("���� ���� ����: " + score);
		
		score = scores.last();
		System.out.println("���� ���� ����: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95�� �Ʒ� ����: " + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("95�� ���� ����: " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("95�� �̰ų� �ٷ� �Ʒ� ����: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ����: " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(���� ��ü ��: " + scores.size() + ")");
			
			
		}
	}
}
