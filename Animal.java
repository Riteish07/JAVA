import java.util.Scanner;
class Animal{
  
     void move() {
        System.out.println("Animal moves");
    }
} 



 class Cheetah extends Animal {
     void move() {
        System.out.println("This cheetah is running!");
    }
}
 class Main {
    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        // Call the move method on the Animal instance
        animal.move();
        
        // Create an instance of Cheetah
        Cheetah cheetah = new Cheetah();
        // Call the move method on the Cheetah instance
        cheetah.move();
    }
}
 



