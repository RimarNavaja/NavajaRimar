import java.util.Scanner;
public class ActivityThreeNavaja {

  public static void main(String[] args) {
    double c1 = 100.00;
    double c2 = 150.00;
    double c3 = 200.00;
    double r1 = 35.00;
    double r2 = 50.00;
    double phpToUsd = 56.00;

    Scanner scanner = new Scanner(System.in);

    println("Menu: ");
    println("1. C1 = Php 100.00");
    println("2. C2 = Php 150.00");
    println("3. C3 = Php 200.00");
    println("");
    println("Add ons: ");
    println("4. R1 = Php 35.00");
    println("5. R2 = Php 50.00");
    println("");

    //user inputs
    print("Enter the order code (e.g, C1, R2): ");
    String orderCode = scanner.nextLine();

    print("Enter the quantity: ");
    int quantity = scanner.nextInt();

    double totalPrice = 0;

    if (orderCode.equalsIgnoreCase("C1")) totalPrice = c1 * quantity;
    else if (orderCode.equalsIgnoreCase("C2")) totalPrice = c2 * quantity;
    else if (orderCode.equalsIgnoreCase("C3")) totalPrice = c3 * quantity;
    else if (orderCode.equalsIgnoreCase("R1")) totalPrice = r1 * quantity;
    else if (orderCode.equalsIgnoreCase("R2")) totalPrice = r2 * quantity;
    else {
      print("Invalid item code");
      System.exit(1);
    }

    //Calculation for price in USD
    double totalInUSD = totalPrice / phpToUsd;

    //results
    println("Total Price (PHP): Php " + totalPrice);
    println("Total Price (USD): $ " + totalInUSD);
    println("Quantity: " + quantity);
    println("Order Code: " + orderCode);

    scanner.close();

  }

  //method printLine
  static void println(String word) {
    System.out.println(word);
  }
  //method print
  static void print(String word) {
    System.out.println(word);
  }
}