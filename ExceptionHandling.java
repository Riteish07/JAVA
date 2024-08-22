import java.util.Scanner;
class ExceptionHandling
{
public static void main(String[] args)
 {
	System.out.println("PROGRAM IS STARTED");
	Scanner sc=new Scanner(System.in);
	int []marks=new int[5];
	int divisor;
	System.out.println("ENTER ELEMENTS OF ARRAY: ");
	for(int i=0;i<5;i++)
	   {
		marks[i]=sc.nextInt();
	   }
	System.out.println("ENTER THE DIVISOR: ");
	divisor=sc.nextInt();
	int arr[]=new int[5];
	try{
		for(int i=0;i<5;i++){
		arr[i]=marks[i]%divisor;
		System.out.println("AFTER DIVIDING ELEMENTS OF ARRAY: ");
		for(int i=0;i<5;i++)
		{
		System.out.println(arr[i]);
		}
	   }
	}
	catch(java.lang.Exception e){
		System.out.println("EXCEPTION OCCURED BECAUSE DIVISOR IS ZERO");
		}
		System.out.println("PROGRAM IS ENDED.");
	}
}