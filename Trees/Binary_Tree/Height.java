// You are using Java
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Binary{
    private Node root=null;
    private Queue<Node> q=new LinkedList<>();
    public void insert(int data){
        Node obj=new Node(data);
        if(root==null){
            root=obj;
            q.add(root);
            return;
        }
        Node front=q.peek();
        if(front.left==null){
            front.left=obj;
        }else{
            front.right=obj;
            q.poll();
        }
        q.add(obj);
    }
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root==null){
            return 0;
        }
        return 1+height(root.left);
    }
    public void display(){
        display(root);
    }
    private void display(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
}
class Main{
    public static void main(String aaa[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Binary b=new Binary();
        for(int i=0;i<n;i++){
            b.insert(s.nextInt());
        }
        b.display();
        System.out.print("\n"+b.height());
    }
}
