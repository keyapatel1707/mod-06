package oop;
class person{
	void displaydetail()
	{
		System.out.println("men");
	}
}
class student  extends person 
{
	void study()
	{
		System.out.println("student");
	}
}
	
public class singleinheritance
{
	public static void main(String[] args) 
	{
		student student = new student();
		student.displaydetail();
		student.study();
		
		

	}

}
