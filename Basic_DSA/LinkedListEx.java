package Basic_DSA;

import java.util.LinkedList;

public class LinkedListEx {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Audi");

    System.out.println("Pos: " + cars.indexOf("Ford"));
    System.out.println(cars);
  }
}