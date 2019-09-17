package BST;

import node.Node;

public class BinarySearchTree {
	
	Node root;
	
	private boolean isBinarySearchTree(Node root){
		boolean result = false;
		boolean left = true;
		boolean right = true;
		if(root == null)
			return true;
		
		if(root.left!=null)
			left = root.data >= root.left.data;
		if(root.right!=null)
			right = root.data <= root.right.data;
		
		result = left && right && isBinarySearchTree(root.left) && isBinarySearchTree(root.right);
		return result;
	}

	public boolean isBinarySearchTree() {
		return isBinarySearchTree(root);
	}
	

}
