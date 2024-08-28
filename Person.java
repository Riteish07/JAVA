import java.util.Scanner;
class Person{
   String firstName;
   String lastName;

   Person(String firstName, String lastName){
      this.firstName= firstName;
      this.lastName= lastName;
   }

  String getfirstName()
	{
	return firstName;
	}

  String getlastName()
	{
 	return lastName;
	}
}

class Employee extends Person{
 	int employeeId;
	String jobTitle;
 	
	Employee(String firstName, String lastName,int employeeId,String jobTitle){
	super(firstName,lastName);
	this.employeeId= employeeId;
	this.jobTitle= jobTitle;
	}
    
    	int getemployeeId()
	{
	return employeeId;
	}

	String getlastName(){
	return super.getlastName() + "," + jobTitle;
	}
}

class Main{

	public static void main(String args[])
 	{
	  Employee employee1 = new Employee("Ritesh", "Upadhye", 128 , "HR Manager");

	  System.out.println(employee1.getfirstName() + " " + employee1.getlastName() + " (" + employee1.getemployeeId() + ")");

	  Employee employee2 = new Employee("Junior", "Philipa", 4452, "Software Manager");
        
          System.out.println(employee2.getfirstName() + " " + employee2.getlastName() + " (" + employee2.getemployeeId() + ")");
        }
       } 
