package Week3.Day1;

public class StudentsAssignment {
	public void getStudentInfo(int id)
	{
		System.out.println("method1:" + (id));
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Method2:" + (id));
		System.out.println("Method2:" + (name));
	}
	public void getStudentInfo(String email,String phoneNumber)
	{
		System.out.println("Method3:" + (email));
		System.out.println("Method3:" + (phoneNumber));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsAssignment S=new StudentsAssignment();
		S.getStudentInfo(2301390);
		S.getStudentInfo(41, "Umar");
		S.getStudentInfo("mohammedshadab41@gmail.com", "9898090654");

	}

}