import java.util.*;

class Node {
    int data;
    Node right;
    Node left;
    Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}

class Binary {
    Node root = null;
    
    // Recursive Insertion -> Easy to write
    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    
    public void insert(int data) {
        root = insert(root, data);
    }
    
    // Iterative Insertion -> Slight efficient in space compl. but time compl. similar
    public void insertIterative(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }
    
    public void display() {
        display(root);
    }
    
    public void display(Node root) {
        if (root == null) {
            return;
        }
        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Binary obj = new Binary();
        for (int i = 0; i < n; i++) {
            int value = s.nextInt();
            obj.insert(value);
        }
        System.out.print("In-order traversal: ");
        obj.display();
        System.out.println();
    }
}
