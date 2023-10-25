/*
Rimar M. Navaja
BSIT-2B
*/
import java.util.Scanner;

public class MDA  {
   public static void main (String []args){
   
      Scanner s = new Scanner(System.in);
      
      
      System.out.print("Enter First Number : ");
      int num1 = s.nextInt();
      System.out.print("Enter Second Number : ");
      int num2 = s.nextInt();
      
      Cal c = new Cal(num1, num2 );
      
     

           
   }  
   
class Cal {
         int num1, num2;
         
         Cal(int num1, int num2){
             this.num1 = num1;
             this.num2 = num2;  
         }
         
         int add(int num1, int num1){
            sum = num1 + num2;
            return sum;
         }
         
      
      }
     
}