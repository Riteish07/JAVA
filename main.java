interface animal{
    void makesound();
    
    default void sleep(){
    System.out.println("Zzzz....");
    }
    
    }
    class Dog implements animal{
    public void makesound(){
    System.out.println("Woof");
    }
    }
    class Cat implements animal{
    public void makesound(){
    System.out.println("meow");
    }
    }
    public class main
    {
    public static void main(String[] args){
    animal myDog=new Dog();
    animal myCat=new Cat();
    myDog.makesound();
    myDog.sleep();
    
    myCat.makesound();
    myCat.sleep();
    }
    }
