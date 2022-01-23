package week1.day1;

public class Student {
	
	private String name = "Babitha";
	public int rollNo=3;
	
	public void college()
	{
		 String collegeName="SRM";
		System.out.println("College Name is "+collegeName);
		
	}

	public static void main(String[] args) {
	
Student stuobj=new Student();

  String output =stuobj.name;
  System.out.println("Student name is "+output);
  int rollnumber =stuobj.rollNo;
  System.out.println("Rollnumber is "+rollnumber);
  stuobj.college();
  
  	}

}
