//My name is Joseph Pederson.
//This is a java application that demonstrates the use of classes, contructors, getters and setters using creatures called Spoots.

public class Main {
  public static void main (String[] args) {
    // Initialize the three Spoot instances.
    Spoot spoots[] = new Spoot[] {
      new Spoot ("Fluffy", "red", 2.5, 3),
      new Spoot ("Paws", "blue", 3.25, 2),
      new Spoot ("Poofy", "yellow", 1.5, 1)
    };
    ///loops to call each Spoots details.
    for (Spoot spoot : spoots) {
      System.out.println(spoot.details());
    }
  }
}