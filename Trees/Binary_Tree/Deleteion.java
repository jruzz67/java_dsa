import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BST{
    private Node root=null;
    public void insert(int data){
        root=insert(root,data);
    }
    private Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data>data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    public void display(){
        display(root);
    }
    private void display(Node root){
        if(root==null){
            return;
        }
        display(root.left);
        System.out.print(root.data+" ");
        display(root.right);
    }
    public void remove(int data){
        remove(root,data);
    }
    private Node remove(Node root,int data){
        if(root==null){
            return null;
        }
        if(root.data>data){
            root.left=remove(root.left,data);
        }else if(root.data<data){
            root.right=remove(root.right,data);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }else if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node temp=root.right;
                while(temp.left!=null){
                    temp=temp.left;
                }
                root.data=temp.data;
                root.right=remove(root.right,temp.data);
            }
        }
        return root;
    }
}
class Main{
    public static void main(String aaa[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        BST b=new BST();
        for(int i=0;i<n;i++){
            b.insert(s.nextInt());
        }
        System.out.println("Before deletion of key value: ");
        b.display();
        int key=s.nextInt();
        b.remove(key);
        System.out.println("\nAfter deleting key value: ");
        b.display();
    }
}
