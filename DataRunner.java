import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    UserStory carStory = new UserStory("brands.txt", "models.txt", "prices.txt", "horsepowers.txt", "topspeeds.txt", "accelerations.txt");

    // Ask the user what category to analyze, or random car
    System.out.println("What category do you want to analyze?");
    System.out.println("(1) Price" + "\n" +
                      "(2) Horsepower" + "\n" +
                      "(3) Top speed" + "\n" +
                      "(4) Acceleration" + "\n" +
                      "(5) Pick a random car!");
    System.out.print("Input here: ");

    /*
    Ask the user for highest/lowest of the category and print an output
    If option is not valid program asks user to retry.
    */
    int categoryOption = scanner.nextInt(); 
    System.out.println();
    if (categoryOption == 1) {
      System.out.println("What category do you want to analyze?");
      System.out.println("(1) Most cheap" + "\n" +
                        "(2) Most expensive");
      System.out.print("Input here: ");
      System.out.println(carStory.findByPrice(scanner.nextInt())); 
    } else if (categoryOption == 2) {
      System.out.println("What category do you want to analyze?");
      System.out.println("(1) Least horsepower" + "\n" +
                        "(2) Most horsepower");
      System.out.print("Input here: ");
      System.out.println(carStory.findByHorsepower(scanner.nextInt())); 
    } else if (categoryOption == 3) {
      System.out.println("What category do you want to analyze?");
      System.out.println("(1) Lowest top speed" + "\n" +
                        "(2) Highest top speed");
      System.out.print("Input here: ");
      System.out.println(carStory.findByTopSpeed(scanner.nextInt())); 
    } else if (categoryOption == 4) {
      System.out.println("What category do you want to analyze?");
      System.out.println("(1) Slowest acceleration" + "\n" +
                        "(2) Fastest acceleration");
      System.out.print("Input here: ");
      System.out.println(carStory.findByAcceleration(scanner.nextInt()));
    } else if (categoryOption == 5) {
      System.out.println(carStory.pickRandom());
    } else {
      System.out.println("Please retry and choose a valid option.");
    }
    scanner.close();
  }
}