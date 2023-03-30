package week1.day2;

public class Tab {

	public int tabPrice(int tabPrice) {
		return tabPrice;
		
	}
	
	public String tabBrand(String brandName) {
		return brandName;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tab tab =new Tab();
		String brand = tab.tabBrand("Oppo Tab");
		int price = tab.tabPrice(20000);
		System.out.println("Tab brand is " +brand);
		System.out.println("Price of Tab is " +price);

	}

}
