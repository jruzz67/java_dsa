// Node class (now outer class)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Singly Linked List - Simplified version
 */
public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete first occurrence of value
    public boolean delete(int data) {
        if (head == null) {
            return false;
        }

        if (head.data == data) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Bubble Sort (ascending order) - by swapping data
    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    // Swap data
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    // ────────────────────────────────────────────────
    //                  DEMONSTRATION
    // ────────────────────────────────────────────────
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(50);
        list.insert(20);
        list.insert(80);
        list.insertAtBeginning(5);
        list.insert(30);

        System.out.println("Original list:");
        list.display();

        System.out.println("\nAfter sorting:");
        list.sort();
        list.display();

        System.out.println("\nAfter deleting 30:");
        list.delete(30);
        list.display();

    }
}
