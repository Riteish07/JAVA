import java.util.Scanner;

class Exception{

public static void main(String args[])
{
	System.out.println("THE PROGRAM IS STARTED");
	int a=10,b=0,c;
	try{
		c=a/b;
	        System.out.println(c);
	    }

	catch(ArithmeticException e){
	System.out.println("CANNOT DIVIEDED BY 0");
	}
	System.out.println("THE PROGRAM IS ENDED");
}
}