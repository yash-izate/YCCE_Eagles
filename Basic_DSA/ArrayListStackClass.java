package Basic_DSA;

import java.util.ArrayList;

public class ArrayListStackClass {

  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty() {
      return list.size() == 0;
    }

    public static void push(int data) {
      list.add(data);
    }

    public static int pop() {
      if (isEmpty()) {
        return -1;
      }

      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    // display
    public static int peek() {
      if (isEmpty()) {
        System.out.println("Stack is empty! No top element.");
        return -1;
      }
      return list.get(list.size() - 1);
    }
  }

  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Stack s = new Stack();

    s.push(1);
    s.push(2);
    s.push(3);

    System.out.print("Stack elements (from top to bottom): ");
    while (!s.isEmpty()) {
      System.out.print(s.peek() + " ");
      s.pop();
    }
  }
}
