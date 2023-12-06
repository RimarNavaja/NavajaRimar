class Gym {
    String name;
    double distance;
    int budget;
    double quality;

    public Gym(String name, double distance, int budget, double quality) {
        this.name = name;
        this.distance = distance;
        this.budget = budget;
        this.quality = quality;
    }
    
    
    void gymInfo(){
      System.out.println("Gym name: " + name);
      System.out.println("Distance: " + distance);
      System.out.println("Budget  : " + budget);
      System.out.println("Rating  : " + quality);
      
    }
}