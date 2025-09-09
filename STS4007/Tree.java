package STS4007;

//preorder
import java.util.*;
import java.lang.*;

//class Node{
//  int data;
//  Node left;
//  Node right;
//  Node(int data){
//      this.data = data;
//      left = null;
//      right = null;   // initialy null
//  }
//}
public class Tree{
  
  static int sum=0;
  static int num=0;
  
  public static int sumRootToLeaf(Node node){
      // if(node == null){
      //     return 0;
      // }
      num = (num*10) + node.data;
      if(node.left==null && node.right==null){
         sum+=num; 
      }
     
    
      // System.out.println(n1+n2);
      
      return sumRootToLeaf(node.left)+sumRootToLeaf(node.right);
  }
  
  // public static void BST(Node int mini, )
  
  public static void preOrder(Node node){
      if(node  == null){
          return;
      }
    System.out.println(node.data+" ");
  
      preOrder(node.left);
       
      preOrder(node.right);
      
  }
  
  public static void levelOrder(Node node){
      Queue<Node> q = new LinkedList<Node>();
      q.add(node);
      while(!q.isEmpty()){
          int n = q.size();
          for(int i=0;i<n;i++){
          Node curr = q.poll();
          if(i==n-1){
          System.out.println(curr.data+" ");
          }
          if(curr.left!=null){
              q.add(curr.left);
          }
          if(curr.right!=null){
              q.add(curr.right);
          }
      }
      }}
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      String s[] = sc.nextLine().split(" ");
      // int n = sc.nextInt();
      // String val = sc.next(); // input as strings
      Node root = new Node(Integer.parseInt(s[0])); //converts strings to integers
      int n = s.length;
      Queue<Node> q = new LinkedList<Node>();
      q.add(root);
      int i=1;
      while(i<n){
          Node curr = q.poll(); // root node will be popped out and return the value
          String left = s[i];//sc.next();
          if(!left.equals("N")){
              curr.left = new Node(Integer.parseInt(left));
              q.add(curr.left);
          }
          i++;
          if(i<n){
              String right = s[i]; // sc.next();
              if(!right.equals("N")){
                  curr.right = new Node(Integer.parseInt(right));
                  q.add(curr.right);
              }
              i++;
          }
          //curr.left!="N"
      }
      preOrder(root);
      // levelOrder(root);
      
      // sumRootToLeaf(root);
//      System.out.println(sumRootToLeaf(root));
  }
}