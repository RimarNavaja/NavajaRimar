public class Encapsulation{
   public static void main(String[]args){
      
      Person p = new Person("Rimar", "M", "Navaja", 22,"June 12, 2001" , "Cebu City");
      
      System.out.println("First Name: " + p.getFirstName());
      System.out.println("Middle Name: " + p.getMiddleName());
      System.out.println("Last Name: " + p.getLastName());
      System.out.println("Age: " + p.getAge());
      System.out.println("Birthday: " + p.getBirthday());
      System.out.println("Address: " + p.getAddress());

   }
   
}


class Person{
   private String firstName, middleName, lastName;
   private int age;
   private String address, birthday;
   
   Person(String firstName, 
          String middleName, 
          String lastName, 
          int age, 
          String birthday, 
          String address){
          
          this.firstName = firstName; 
          this.middleName = middleName;
          this.lastName = lastName;
          this.age = age;
          this.birthday = birthday;
          this.address = address;
          
          
          
   }
   //setter and getter of FirstName
   void setFirstName(String firstName){
      this.firstName = firstName;
   }
   
   String getFirstName(){
      return firstName;
   }
   
   //setter and getter of MiddleName
   void setMiddleName(String middleName){
      this.middleName = middleName;
   }
   
   String getMiddleName(){
      return middleName;
   }
   
   //setter and getter of LastName
   void setLastName(String lastName){
      this.lastName = lastName;
   }  
   
   String getLastName(){
      return lastName;
   }
   
   //setter and getter of Age
   void setAge(int age){
      this.age = age;
   }
   
   int getAge(){
      return age;
   }
   
   //setter and getter of Birthday
   
   void setBirthday(String birthday){
      this.birthday = birthday;
   }
   
   String getBirthday(){
      return birthday;
   }
   
   //setter and getter of Address
   
   void setAddress(String address){
      this.address = address;
   }
   
   String getAddress(){
      return address;
   }
        
      

}