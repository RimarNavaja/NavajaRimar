import java.util.Scanner;

public class RouteToMoalboal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Eta e = new Eta();
        int speed;

        println("==== Welcome! ====");
        println("Route To Moalboal!");
        defaultRoutes();
        println("");
        print("Is Barili route obstructed? (Type Yes or No): ");
        String choiceDefault = s.nextLine(); 
        if (choiceDefault.equalsIgnoreCase("No")) {
            double distance = 95.2;
            recommendedRoutes();
            println("");
            print("How fast are you going? ");
            speed = s.nextInt();
            double arrivalTime = e.etaCalculation(distance, speed);
            int hours = (int) arrivalTime;
            int minutes = (int) ((arrivalTime - hours) * 60);
            println("Distance: " + distance + "km");
            println("Speed: " + speed + " km/hr");
            println("Estimated Time Arrival: " + hours + " hour(s) and " + minutes + " minutes");
        } else {
            print("Is Dumanjug route obstructed? (Type Yes or No): ");
            String choiceRecommend = s.nextLine();
            if (choiceRecommend.equalsIgnoreCase("yes")) {
                double distance = 102.0;
                recommendedRoutes2();
                println("");
                print("How fast are you going? ");
                speed = s.nextInt();
                double arrivalTime = e.etaCalculation(distance, speed);
                int hours = (int) arrivalTime;
                int minutes = (int) ((arrivalTime - hours) * 60);
                println("Distance: " + distance + "km");
                println("Speed: " + speed + " km/hr");
                println("Estimated Time Arrival: " + hours + " hour(s) and " + minutes + " minutes");
            } else {
                double distance = 100.0;
                recommendedRoutes1();
                println("");
                print("How fast are you going? ");
                speed = s.nextInt();
                double arrivalTime = e.etaCalculation(distance, speed);
                int hours = (int) arrivalTime;
                int minutes = (int) ((arrivalTime - hours) * 60);
                println("Distance: " + distance + "km");
                println("Speed: " + speed + " km/hr");  
                println("Estimated Time Arrival: " + hours + " hour(s) and " + minutes + " minutes");
            }
        }
    }

    // Route Methods
    static void defaultRoutes() {
        println("");
        println("Default Routes: ");
        println("Cebu City (Start)");
        println("Minglanilla (Route 1)");
        println("San Fernando (Route 2)");
        println("Carcar (Route 3)");
        println("Barili (Route 4.1)");
        println("Dumanhog (Route 4.1.1)");
        println("Alcantara (Route 4.1.2)");
        println("Moalboal (End)");
    }

    static void recommendedRoutes() {
        println("");
        println("Recommended Routes: ");
        println("Cebu City (Start)");
        println("Minglanilla (Route 1)");
        println("San Fernando (Route 2)");
        println("Carcar (Route 3)");
        println("Barili (Route 4.1)");
        println("Dumanhog (Route 4.1.1)");
        println("Alcantara (Route 4.1.2)");
        println("Moalboal (End)");
    }

    static void recommendedRoutes1() {
        println("");
        println("Recommended Routes 1.0 : ");
        println("Cebu City (Start)");
        println("Minglanilla (Route 1)");
        println("San Fernando (Route 2)");
        println("Carcar (Route 3)");
        println("Sibonga (Route 4.2)");
        println("Dumanhog (Route 4.2.1)");
        println("Alcantara (Route 4.2.2)");
        println("Moalboal (End)");
    }

    static void recommendedRoutes2() {
        println("");
        println("Recommended Routes 2.0 : ");
        println("Cebu City (Start)");
        println("Minglanilla (Route 1)");
        println("San Fernando (Route 2)");
        println("Carcar (Route 3)");
        println("Sibonga (Route 4.2)");
        println("Argao (Route 5)");
        println("Ronda (Route 5.1)");
        println("Alcantara (Route 5.2)");
        println("Moalboal (End)");
    }

    // Methods for println & print
    static void println(String word) {
        System.out.println(word);
    }

    static void print(String word) {
        System.out.print(word);
    }

    static class Eta {
        double etaCalculation(double distance, int speed) {
            return distance / speed;
            
        }
    }
}
