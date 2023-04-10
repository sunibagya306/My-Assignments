package week3.day1;

public class Automation extends MultipleLanguage implements TestTool,Language {
	public static void main(String[] args) {
	
		Automation auto = new Automation ();
		auto.python();
		auto.ruby();
		auto.Selenium();
		auto.Java();
		}
	public void Java() {
		System.out.println("JAVA");
	}
                                                                                             
	public void Selenium() {
		System.out.println("Selenium");
	}
	
	
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		
	}
	
}
