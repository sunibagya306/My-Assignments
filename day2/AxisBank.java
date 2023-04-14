package week3.day2;

public class AxisBank extends BankInfo {


		public void deposit() {
			System.out.println("deposit amount from axisbank");
		}
		
		public static void main(String[] args) {
			
			AxisBank axis=new AxisBank();
			
			axis.deposit();
			axis.saving();
			axis.fixed();
		
			
	}

}
