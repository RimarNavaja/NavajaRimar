import java.util.Scanner;

public class EncapsulationStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();
        
        Student student = new Student();
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setLastName(lastName);
        student.setSuffix(suffix);

        //full name 
        System.out.println("Full Name: " + student.getFullName());
    }
}

class Student {
    private String first_name = "";
    private String middle_name = "";
    private String last_name = "";
    private String suffix = "";

    // Default constructor
    Student() {
    }

    // Getters
    String getFirstName() {
        return first_name;
    }

    String getMiddleName() {
        return middle_name;
    }

    String getLastName() {
        return last_name;
    }

    String getSuffix() {
        return suffix;
    }

    // Setters
    void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    void setMiddleName(String middle_name) {
        this.middle_name = middle_name;
    }

    void setLastName(String last_name) {
        this.last_name = last_name;
    }

    void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    // Method to get the full name
    String getFullName() {
        return first_name + " " + middle_name + " " + last_name + " " + suffix;
    }
}
