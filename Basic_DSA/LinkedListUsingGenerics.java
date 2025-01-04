package Basic_DSA;

// Node class
class Node1<T> {
    T data;
    Node1<T> next;

    Node1(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListUsingGenerics<T> {

    private Node1<T> head; // by default null

    // 1. Insert node at the end of the linked list
    public void append(T data) {
        if (head == null) {
            head = new Node1<>(data);
            return;
        }
        Node1<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node1<>(data);
    }

    // 2. Insert before head
    public void prepend(T data) {
        Node1<T> newHead = new Node1<>(data);
        newHead.next = head;
        head = newHead;
    }

    // 3. Delete node with value
    public void deleteWithValue(T data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node1<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // 4. Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // 5. Print the list
    public void printList() {
        Node1<T> current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // 6. Add element at a specific position
    public void add(int index, T data) {
        if (index < 0) throw new IllegalArgumentException("Index cannot be negative.");

        if (index == 0) {
            prepend(data);
            return;
        }

        Node1<T> current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            current = current.next;
        }

        Node1<T> newNode = new Node1<>(data);
        newNode.next = current.next;
        current.next = newNode;
    }

    // 7. Get element at a specific position
    public T get(int index) {
        if (index < 0) throw new IllegalArgumentException("Index cannot be negative.");

        Node1<T> current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds.");
            }
            current = current.next;
        }

        if (current == null) throw new IndexOutOfBoundsException("Index out of bounds.");
        return current.data;
    }

    // 8. Find size
    public int size() {
        int count = 0;
        Node1<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // 9. Remove and return the first element from the list
    public T remove() {
        if (head == null) throw new IllegalStateException("List is empty.");
        T data = head.data;
        head = head.next;
        return data;
    }

    // 10. Get the last element
    public T getLast() {
        if (head == null) throw new IllegalStateException("List is empty.");

        Node1<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public static void main(String[] args) {
        LinkedListUsingGenerics<String> list = new LinkedListUsingGenerics<>();
        list.append("Akshay"); // 1
        list.prepend("Anurag"); // 2
        list.append("Kartik");
        list.prepend("Adarsh");
        list.append("Sahil");
        list.printList(); // 3

        list.deleteWithValue("Kartik"); // 4
        list.printList();
        System.out.println("Is empty? " + list.isEmpty()); // 5

        list.add(2, "Ajinkya"); // 6
        list.printList();
        System.out.println("Element at index 2: " + list.get(2)); // 7
        System.out.println("Size of Linked List: " + list.size()); // 8
        System.out.println("First Element: " + list.remove()); // 9
        System.out.println("Last Element: " + list.getLast()); // 10
    }
}
