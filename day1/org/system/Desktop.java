package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
	System.out.println("1920x1080");
	}
	
	public static void main(String[] args) {
		Desktop desk =new Desktop();
		desk.desktopSize();
		desk.computerModel();;
		
	}

}
