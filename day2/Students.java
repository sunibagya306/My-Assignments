package week3.day2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Studend id : " + id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Studend id and Name of Student : " +id+  " and " + name);
		
	}
	public void getStudentInfo(String email,long phno) {
		System.out.println("Studend email and PhoneNo is : " +email+  " and " + phno);
		
	}
	
	public static void main(String[] args) {
		int id = 306;
		String name = "Suneetha";
		String email ="suni.bhagya306@gmail.com";
		long phno = 1234567890;
		
		Students stu=new Students();
		stu.getStudentInfo(id);
		stu.getStudentInfo(id, name);
		stu.getStudentInfo(email, phno);
		
		
		
		

	}

}
