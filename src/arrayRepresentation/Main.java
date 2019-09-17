package arrayRepresentation;

import node.Node;


public class Main {
	
	   public static void main(String args[]) 
	    { 
	  
	        /* creating a binary tree and entering 
	        the nodes */
		   TreeToArray tree = new TreeToArray(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
//	        tree.root.right.left = new Node(6); 
	        tree.root.right.right = new Node(7); 
	        
	        tree.toArray();
	        
	    } 

}
