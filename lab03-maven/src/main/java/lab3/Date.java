package lab3;
class Date {
    // Contributers: Curtis McHenry, Brandon Bullough
    
  public static void main(String[] args) {
    // Declare variables
    String day, month;
    int date, year;
    
    //Assign values
    day = "Thursday";
    month = "August";
    date = 29;
    year = 2013;
    // Print Output
    System.out.print("\f");
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + ", " + year);
  }
}