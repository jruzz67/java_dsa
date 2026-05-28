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
public class Deletion{
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

/*
 * Testcase:
 * Input: 
 * 5
 * 50 30 20 40 70
 * 20
 * Output: 
 * Before deletion of key value: 
 * 20 30 40 50 70 
 * After deleting key value: 
 * 30 40 50 70 
 */
