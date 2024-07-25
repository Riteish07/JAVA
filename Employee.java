import java.util.Scanner;

class Empinfo
{
	String name[]= new String[4];
	int emp_id[]=new int[4];
	float salary[]=new float[4];
	Scanner sc= new Scanner(System.in);

void getdata()
{
	System.out.println("ENTER THE NAME OF EMPLOYEES:");
	for(int i=0;i<4;i++)
	{

	  name[i]=sc.next();

	}
	
	System.out.println("ENTER THE ID OF EMPLOYEES:");
	for(int i=0;i<4;i++)
	{

	  emp_id[i]=sc.nextInt();

	}
	
	System.out.println("ENTER THE SALARY OF EMPLOYEES:");
	for(int i=0;i<4;i++)
	{

	  salary[i]=sc.nextFloat();

	}
	}
void display()
{
	System.out.println("\n INFORMATION OF EMPLOYEE: \n");
	for(int i=0;i<4;i++)
	{

	  System.out.println( name[i] + "\t");

	}
	for(int i=0;i<4;i++)
	{

	  System.out.println( emp_id[i] + "\t");

	}
	for(int i=0;i<4;i++)
	{

	  System.out.println( salary[i] + "\t");

	}
}
}

class Employee
{
 	public static void main(String args[])
	 {
		Empinfo EM= new Empinfo();
		EM.getdata();
		EM.display();
	}
}




 