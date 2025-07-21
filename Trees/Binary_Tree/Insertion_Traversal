import java.util.*;
class Node
{
    int data;
    Node right;
    Node left;
    Node(int data)
    {
        this.data=data;
        right=null;
        left=null;
    }
}
class Binary{
    private Node root = null;
    private Queue<Node> q = new LinkedList<>();
    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
            q.add(root);
            return;
        }
        Node front = q.peek();
        if (front.left == null) {
            front.left = newNode;
        } else {
            front.right = newNode;
            q.poll();
        }
        q.add(newNode);
    }
    public void display()
    {
        display(root);
    }
    public void display(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Binary obj=new Binary();
        for(int i=0;i<n;i++)
        {
            int m=s.nextInt();
            obj.insert(m);
        }
        System.out.print("Preorder Traversal: ");
        obj.display();
    }
}
