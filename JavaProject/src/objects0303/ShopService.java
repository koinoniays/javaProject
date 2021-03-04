package objects0303;

//ΩÃ±€≈Ê
public class ShopService {
	private static ShopService shopservice = new ShopService();

	private ShopService() {

	}

	public static ShopService get() {
		return shopservice;
	}
}
