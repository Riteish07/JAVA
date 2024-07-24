import java.util.Scanner;
class matrix
{
	public static void main(String args[])
{
	int a,b,sum,sub,multi,div,remainder;
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 1st number:");
	a = sc.nextInt();
     System.out.println("Enter 2nd number:");
	b = sc.nextInt();

	sum= a+b;
	System.out.println("Addition is:" + sum + "\n");

 	sub= a-b;
	System.out.println("Subtraction is:" + sub + "\n");

	multi= a*b;
	System.out.println("Multipliction is:" + multi + "\n");

	div= a/b;
	System.out.println("Division is:" + div + "\n");

	remainder=a%b;
	System.out.println("Remainder is:" + remainder + "\n");
}
}

	