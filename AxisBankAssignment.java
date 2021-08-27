package Week3.Day1;

public class AxisBankAssignment extends BankInfoAssignment {
	public void deposit()
	{
		System.out.println("deposit:30,000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******BankInfo****");
		BankInfoAssignment Bank=new BankInfoAssignment();
		Bank.saving();
		Bank.fixed();
		Bank.deposit();
		System.out.println("*****AxisBank******");
		AxisBankAssignment Axis=new AxisBankAssignment();
		Axis.deposit();
	}

}