package Week3.Day1;

public class DesktopAssignment extends ComputerAssignment{
	public void desktopSize()
	{
		System.out.println("36cm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Computer*******");
		ComputerAssignment c=new ComputerAssignment();
		c.computerModel();
		System.out.println("*******Desktop********");
		DesktopAssignment D=new DesktopAssignment();
		D.computerModel();
		D.desktopSize();
	}
}