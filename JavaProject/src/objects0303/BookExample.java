package objects0303;

public class BookExample {

	public static void main(String[] args) {
		
		
		Book book1 = new Book("�ڹ�", "����1", "���ǻ�1", 10000);
//		System.out.println(book1); - book1�� ������ �ִ� �޸��� �ּҰ�
//		System.out.println(book1.getBookName()); - �ڹ� ���
		Book book2 = new Book("HTML", "����2", "���ǻ�2", 20000);
		Book book3 = new Book("CSS", "����3", "���ǻ�3", 30000);
		Book book4 = new Book("�ڹٽ�ũ��Ʈ", "����4", "���ǻ�4", 40000);
		
		Member mem1 = new Member("s111", "��ȿ��");
		mem1.rent(book1);
		mem1.rent(book2);
//		mem1.overdue(book2);
		
		String str = mem1.getBookInfo();
		System.out.println(str);
		
		Member mem2 = new Member("a222", "���Ѽ�");
		mem2.rent(book3);
		mem2.rent(book4);
		
		System.out.println(mem2.getBookInfo());
	}

}
