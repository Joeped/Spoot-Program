//My name is Joseph Pederson.
//This is a java application that demonstrates the use of classes, contructors, getters and setters using creatures called Spoots.


public class Spoot {
  //Name of spoot
  private String name;
  //color of spoot
  private String color;
  //weight of spoot
  private double weight;
  //age of spoot
  private int age;
  /// constructs a new Spoot object
  public Spoot (String name, String color, double weight, int age) throws IllegalArgumentException {
    setName (name);
    setColor (color);
    setWeight (weight);
    setAge (age);
  }
  //returns the name of Spoot
  public String getName () {
    return name;
  }
  public void setName (String name) throws IllegalArgumentException{
    if (name == null || name.trim().isEmpty())
      throw new IllegalArgumentException ("name parameter should not be null.");
    this.name=name;
  }
  //returns the color of Spoot
  public String getColor() {
    return color;
  }
    public void setColor (String color) throws IllegalArgumentException{
    if (color == null || color.trim().isEmpty())
      throw new IllegalArgumentException ("color parameter should not be null.");
    this.color=color;
  }
  //return the weight of Spoot
  public double getWeight() {
    return weight;
  }
   public void setWeight (double weight) throws IllegalArgumentException{
    if (weight <=0)
      throw new IllegalArgumentException ("weight parameter should not be zero or less than zero.");
    this.weight=weight;
  }
  //return the age of Spoot
  public int getAge() {
    return age;
  }
     public void setAge (int age) throws IllegalArgumentException{
    if (age < 0)
      throw new IllegalArgumentException ("age parameter should not be less than zero.");
    this.age=age;
  }
  //returns a string containing the details of the Spoot
  public String details() {
    return this.toString();
  }
  //returns a string representation of the Spoot object
  public String toString() {
    return String.format("I am a Spoot. My name is " + getName() + ". My color is " + getColor() + ". My weight is " + getWeight() + " pounds. My age is " + getAge() + " years old.");
  }
}