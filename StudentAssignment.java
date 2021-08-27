package Week3.Day1;



public class StudentAssignment extends DepartmentAssignment {
	public void studentName()
	{
		System.out.println("Aswini");
	}
	public void studentDept()
	{
		System.out.println("MCA");
	}
	public void studentId()
	{
		System.out.println("2301390");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******College*******");
		CollegeAssignment C=new CollegeAssignment();
		C.collegeCode();
		C.collegeName();
		C.collegeRank();
		System.out.println("*******Department*****");
		DepartmentAssignment D=new DepartmentAssignment();
		D.deptName();
		D.collegeCode();
		D.collegeName();
		D.collegeRank();
		System.out.println("*******Student*******");
		StudentAssignment S=new StudentAssignment();
		S.studentDept();
		S.studentId();
		S.studentName();
		S.collegeCode();
		S.collegeName();
		S.collegeRank();
	}

}