import java.util.Scanner;
class Mobile
{
String brand;
int price;
static String name;
Scanner sc=new Scanner(System.in);

public void getdata()
{
System.out.println("Enter the Mobile Brand");
brand=sc.next();
System.out.println("Enter the Mobile price");
price=sc.nextInt();
System.out.println("Enter the Mobile Name");
name=sc.next();
}

public void show()
{
System.out.println("Enter the Mobile Brand="+brand);
System.out.println("Enter the Mobile price="+price);
System.out.println("Enter the Mobile name="+name);
}
}
class static_variable
{
public static void main(String []args)
{
Mobile mb=new Mobile();
Mobile mb2=new Mobile();

mb2.getdata();
mb.brand="Samsung";
mb.price=200000;
mb.name="S23 Ultra";

mb2.show();
}
}












