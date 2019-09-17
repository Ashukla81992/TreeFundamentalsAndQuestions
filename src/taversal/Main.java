package taversal;

import node.Node;

public class Main {
	
	   public static void main(String args[]) 
	    { 
	  
	        /* creating a binary tree and entering 
	        the nodes */
	        BinaryTree tree = new BinaryTree(); 
	        tree.root = new Node(1); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	        tree.root.right.left = new Node(6); 
	        tree.root.right.right = new Node(7);
	        tree.root.right.left.left = new Node(8);
	        tree.root.right.left.right = new Node(9);
	        
//	        tree.inorderIt(); 
//	        tree.inorder();
//	        tree.postorderItS1();
//	        tree.postorderItS2();
//	        tree.postorderR();
//	        tree.preorderIt();
//	        tree.preorderR();
//	        tree.spiralOrderTraversal();
//	        tree.levelOrderTraversal();
	        
	        tree.findLowestCommonAncestor(8, 5);
	        
	    } 

}
