package objects0303;

public class ShopServiceExample {

	public static void main(String[] args) {

		ShopService obj1 = ShopService.get();
		ShopService obj2 = ShopService.get();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü �Դϴ�.");
		}

	}

}
