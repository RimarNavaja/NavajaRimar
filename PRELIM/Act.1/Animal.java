/*
Rimar M. Navaja
BSIT 2 
Sept. 6, 2023
Activity 1.0 "Animal sound"

*/

import java.util.Scanner;

class Program {
   public static void main (String args[]){
   Scanner s = new Scanner(System.in);
   
      
      Animal a = new Dog();
      Animal b = new Cat();
      Animal c = new Cow();
      Animal d = new Fox();
      
   System.out.println("What does the animal say");
   System.out.println("Select an animal:");
   System.out.println("1. Dog");
   System.out.println("2. Cat");
   System.out.println("3. Cow");
   System.out.println("4. Fox");   
   
   System.out.print(" Enter selected number: ");
   int num = s.nextInt();
   
   switch (num) {
      case 1: System.out.println("Animal Dog"); 
              a.animalSound();
      break;
      case 2: System.out.println("Animal Cat"); 
              b.animalSound();
      break;
      case 3: System.out.println("Animal Cow"); 
              c.animalSound();
      break;
      case 4: System.out.println("Animal Fox");
              d.animalSound();
      break;
   
   }
   
   } 
}


abstract class Animal {
   abstract void animalSound();
} 
class Dog extends Animal {

   public void animalSound() {
      System.out.println("Arf Arf Arf!"); 
   }
}

class Cat extends Animal {
   public void animalSound() {
      System.out.println("Meow Meow Meow!"); 
   }
}

class Cow extends Animal {
   public void animalSound() {
      System.out.println("Moo.. Moo.. Moo!"); 
   }
}   

class Fox extends Animal {
   public void animalSound() {
      System.out.println("Ding Ding Ding!"); 
   }
}

