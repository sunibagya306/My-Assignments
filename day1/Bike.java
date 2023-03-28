package week1.day1;

public class Bike {
	public void applyBreak() {
		System.out.println("breaks are not applied");
	}
	public void soundHorn() {
		System.out.println("no horn");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike honda = new Bike();
        Car nissan = new Car();
        honda.applyBreak();
        honda.soundHorn();
        nissan.applyBreak();
        nissan.soundHorn();
        
	}

}
