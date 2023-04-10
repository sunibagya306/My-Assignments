package week3.day1;

public class Samsung extends AndroidTV implements Android {

	public void watchVideo() {
		System.out.println("play music");
		
	}

	@Override
	public void openApp() {
		System.out.println("App opened");
		
	}
	public static void main(String[] args) {
	 Samsung sam =new Samsung();
       sam.playMusic();
       sam.openApp();
       sam.watchVideo();
	}


}
