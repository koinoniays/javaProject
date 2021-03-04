package objects0303;

public class PrinterExample {
	public static void main(String[] args) {
//		// printer객체를 생성하고 메소드 호출
//		Printer printer = new Printer();
//		
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
		
		// printer객체를 생성하지 않고 호출
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}

}
