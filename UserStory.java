import java.util.Scanner;
import java.lang.Math;

public class UserStory {
  // Array that holds all Car objects.
  private Car[] cars;

  /*
  UserStory constructor, having passed arguments of the car data as text files (strings).
  It calls a local method that returns an array of all car objects, setting array cars as the return value.
  */
  public UserStory(String brandsFile, String modelsFile, String pricesFile, String horsepowerFile, String topspeedFile, String accelerationFile) {
    this.cars = createCars(brandsFile, modelsFile, pricesFile, horsepowerFile, topspeedFile, accelerationFile);
  }

  /*
  Takes in the files (strings) as arguments and converts them to arrays based on their data type.
  A local array carsArray is made to hold all car objects and be passed as the return value.
  Iterates over however many cars there are and instantiates car objects, putting them into carsArray.
  carsArray is returned and cars now holds all car objects.
  */
  public Car[] createCars(String brandsFile, String modelsFile, String pricesFile, String horsepowerFile, String topspeedFile, String accelerationFile) {
    String[] brands = FileReader.toStringArray(brandsFile);
    String[] models = FileReader.toStringArray(modelsFile);
    int[] prices = FileReader.toIntArray(pricesFile);
    int[] horsepowers = FileReader.toIntArray(horsepowerFile);
    int[] topspeeds = FileReader.toIntArray(topspeedFile);
    double[] accelerations = FileReader.toDoubleArray(accelerationFile);
    
    Car[] carsArray = new Car[brands.length];
    for (int i = 0; i < carsArray.length; i++) {
      carsArray[i] = new Car(brands[i], models[i], prices[i], horsepowers[i], topspeeds[i], accelerations[i]);
    }
    return carsArray;
  }

  /*
  If the user chooses option 1, iterates through all car objects and returns the toString method of the car with least price.
  If the user chooses option 2, iterates through all car objects and returns the toString method of the car with most price.
  If option is not 1 or 2 then tell user to retry.
  */
  public String findByPrice(int option) {
    Car chosenCar = cars[0];
    if (option == 1) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getPrice() < chosenCar.getPrice()) {
          chosenCar = cars[i];
        }
      }
      return "\nThe most cheap car is:\n" + chosenCar.toString();
    }
    if (option == 2) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getPrice() > chosenCar.getPrice()) {
          chosenCar = cars[i];
        }
      } 
      return "\nThe most expensive car is:\n" + chosenCar.toString();
    }     
    return "\nPlease retry and choose a valid option.";
  }

  /*
  If the user chooses option 1, iterates through all car objects and returns the toString method of the car with least horsepower.
  If the user chooses option 2, iterates through all car objects and returns the toString method of the car with most horsepower.
  If option is not 1 or 2 then tell user to retry.
  */
  public String findByHorsepower(int option) {
    Car chosenCar = cars[0];
    if (option == 1) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getHorsepower() < chosenCar.getHorsepower()) {
          chosenCar = cars[i];
        }
      }
      return "\nThe car with the least horsepower is:\n" + chosenCar.toString();
    }
    if (option == 2) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getHorsepower() > chosenCar.getHorsepower()) {
          chosenCar = cars[i];
        }
      } 
      return "\nThe car with the most horsepower is:\n" + chosenCar.toString();
    }     
    return "\nPlease retry and choose a valid option.";
  }

  /*
  If the user chooses option 1, iterates through all car objects and returns the toString method of the car with least topspeed.
  If the user chooses option 2, iterates through all car objects and returns the toString method of the car with most topspeed.
  If option is not 1 or 2 then tell user to retry.
  */
  public String findByTopSpeed(int option) {
    Car chosenCar = cars[0];
    if (option == 1) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getTopSpeed() < chosenCar.getTopSpeed()) {
          chosenCar = cars[i];
        }
      }
      return "\nThe car with the lowest top speed is:\n" + chosenCar.toString();
    }
    if (option == 2) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getTopSpeed() > chosenCar.getTopSpeed()) {
          chosenCar = cars[i];
        }
      } 
      return "\nThe car with the highest top speed is:\n" + chosenCar.toString();
    }     
    return "\nPlease retry and choose a valid option.";
  }

  /*
  Picks a random index of the cars array and returns its toString() method.
  Because the expresion after int i = is a double, we must use (int) to convert it into an int since i is an int.
  Expression is rounded since index cannot be a decimal.
  */
  public String pickRandom() {
    int i = (int) Math.round(Math.random() * (cars.length - 1));
    Car chosenCar = cars[i];
    return "Your random car is:\n" + chosenCar.toString();
  }

  /*
  If the user chooses option 1, iterates through all car objects and returns the toString method of the car with highest 0-60 time.
  If the user chooses option 2, iterates through all car objects and returns the toString method of the car with least 0-60 time.
  If option is not 1 or 2 then tell user to retry.
  */
  public String findByAcceleration(int option) {
    Car chosenCar = cars[0];
    if (option == 1) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getAcceleration() > chosenCar.getAcceleration()) {
          chosenCar = cars[i];
        }
      }
      return "\nThe car with the slowest acceleration is:\n" + chosenCar.toString();
    }
    if (option == 2) {
      for (int i = 0; i < cars.length; i++) {
        if (cars[i].getAcceleration() < chosenCar.getAcceleration()) {
          chosenCar = cars[i];
        }
      } 
      return "\nThe car with the fastest acceleration is:\n" + chosenCar.toString();
    }     
    return "\nPlease retry and choose a valid option.";
  }
}