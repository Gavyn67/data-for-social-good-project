public class Car {

  private String brand;
  private String model;
  private int price; // $USD
  private int horsepower;
  private int topSpeed; // Miles per hour
  private double acceleration; // 0-60mph in seconds

  /*
  Constructor which takes in arguments of the passed in car data.
  */
  public Car(String brand, String model, int price, int horsepower, int topSpeed, double acceleration) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    this.horsepower = horsepower;
    this.topSpeed = topSpeed;
    this.acceleration = acceleration;
  }

  // Returns brand of car.
  public String getBrand() {
    return brand;
  }
  // Returns model of car.
  public String getModel() {
    return model;
  }
  // Returns price of car in $USD.
  public int getPrice() {
    return price;
  }
  // Returns horsepower of car.
  public int getHorsepower() {
    return horsepower;
  }
  // Returns top speed of car in miles per hour.
  public int getTopSpeed() {
    return topSpeed;
  }
  // Returns the 0-60mph time in seconds.
  public double getAcceleration() {
    return acceleration;
  }

  /*
  Returns all specifications/statistics of the car object.
  All specifications are on new line.
  Formatted so it is as easy as possible for user to read.
  */
  public String toString() {
    return
      "Brand: " + brand + "\n" +
      "Model: " + model + "\n" +
      "Price: $" + price + "\n" +
      "Horsepower: " + horsepower + " HP" + "\n" +
      "Top speed: " + topSpeed + " MPH" + "\n" +
      "0-60mph time: " + acceleration + "s";
  }
}