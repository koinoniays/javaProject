package objects0303;

public class Member {

	// �ʵ�
	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[5];

	// ������
	
	public Member() {
		
	}
	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// �޼ҵ�
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookName().equals(book.getBookName())) {
				rentBooks[i] = null;
			}
		}
	}

	public String getBookInfo() {
		String result = "";
		result = memberName;
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				result = result + "/" + rentBooks[i].getBookName();
			}
		}
		return result;
	}
}
