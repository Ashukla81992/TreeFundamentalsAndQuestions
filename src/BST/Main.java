package BST;

import node.Node;


public class Main {
	
	   public static void main(String args[]) 
	    { 
	  
	        /* creating a binary tree and entering 
	        the nodes */
		   BinarySearchTree tree1 = new BinarySearchTree(); 
	        tree1.root = new Node(1); 
	        tree1.root.left = new Node(2); 
	        tree1.root.right = new Node(3); 
	        tree1.root.left.left = new Node(4); 
	        tree1.root.left.right = new Node(5); 
//	        tree.root.right.left = new Node(6); 
	        tree1.root.right.right = new Node(7); 
	        
			   BinarySearchTree tree2 = new BinarySearchTree(); 
			   tree2.root = new Node(5); 
			   tree2.root.left = new Node(2); 
			   tree2.root.right = new Node(7); 
			   tree2.root.left.left = new Node(1); 
			   tree2.root.left.right = new Node(3); 
			   tree2.root.right.left = new Node(6); 
			   tree2.root.right.right = new Node(8); 
	        
	       System.out.println("Given tree1 is " + (tree1.isBinarySearchTree()==true?"":"not ") + "a binary search tree");
	       System.out.println("Given tree2 is " + (tree2.isBinarySearchTree()==true?"":"not ") + "a binary search tree");
	        
	    } 

}
