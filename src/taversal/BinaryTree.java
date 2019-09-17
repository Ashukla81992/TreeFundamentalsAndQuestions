package taversal;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import node.Node;

public class BinaryTree {
	Node root; 
	
	
	public void inorderIt() {
		System.out.println("\ninorderIT");
		if(root == null)
			return; 
		Stack<Node> stack = new Stack<Node>();
		Node n = root;
		while(true) {
			
			while(n!=null) {
				stack.push(n);
				n = n.left;
			}
			if(stack.empty()) {
				break;
			}
			n=stack.pop();
			System.out.print(n.data + " ");
			n=n.right;
		}
		
	}
	public void postorderItS1() {
//		1. Right child of 1 exists. 
//		   Push 3 to stack. Push 1 to stack. Move to left child.
//		        Stack: 3, 1
//
//		2. Right child of 2 exists. 
//		   Push 5 to stack. Push 2 to stack. Move to left child.
//		        Stack: 3, 1, 5, 2
//
//		3. Right child of 4 doesn't exist. '
//		   Push 4 to stack. Move to left child.
//		        Stack: 3, 1, 5, 2, 4
//
//		4. Current node is NULL. 
//		   Pop 4 from stack. Right child of 4 doesn't exist. 
//		   Print 4. Set current node to NULL.
//		        Stack: 3, 1, 5, 2
//
//		5. Current node is NULL. 
//		    Pop 2 from stack. Since right child of 2 equals stack top element, 
//		    pop 5 from stack. Now push 2 to stack.     
//		    Move current node to right child of 2 i.e. 5
//		        Stack: 3, 1, 2
//
//		6. Right child of 5 doesn't exist. Push 5 to stack. Move to left child.
//		        Stack: 3, 1, 2, 5
//
//		7. Current node is NULL. Pop 5 from stack. Right child of 5 doesn't exist. 
//		   Print 5. Set current node to NULL.
//		        Stack: 3, 1, 2
//
//		8. Current node is NULL. Pop 2 from stack. 
//		   Right child of 2 is not equal to stack top element. 
//		   Print 2. Set current node to NULL.
//		        Stack: 3, 1
//
//		9. Current node is NULL. Pop 1 from stack. 
//		   Since right child of 1 equals stack top element, pop 3 from stack. 
//		   Now push 1 to stack. Move current node to right child of 1 i.e. 3
//		        Stack: 1
//
//		10. Repeat the same as above steps and Print 6, 7 and 3. 
//		    Pop 1 and Print 1.
		System.out.println("\npostorder1StackIT");
		if(root == null)
			return; 
		Stack<Node> stack = new Stack<Node>();
		Node n = root;
		while(true) {
			
			while(n!=null) {
				stack.push(n);
				stack.push(n);
				n = n.left;
			}
			if(stack.empty()) {
				break;
			}
			n=stack.pop();
			
			if(!stack.empty() && stack.peek()==n ) {
					n=n.right;
			}
			else {
				System.out.print(n.data + " ");
				n=null;
			}
			
			
		}
		
	}
	public void postorderItS2() {
//	1. Push 1 to first stack.
//	      First stack: 1
//	      Second stack: Empty
//
//	2. Pop 1 from first stack and push it to second stack. 
//	   Push left and right children of 1 to first stack
//	      First stack: 2, 3
//	      Second stack: 1
//
//	3. Pop 3 from first stack and push it to second stack. 
//	   Push left and right children of 3 to first stack
//	      First stack: 2, 6, 7
//	      Second stack: 1, 3
//
//	4. Pop 7 from first stack and push it to second stack.
//	      First stack: 2, 6
//	      Second stack: 1, 3, 7
//
//	5. Pop 6 from first stack and push it to second stack.
//	      First stack: 2
//	      Second stack: 1, 3, 7, 6
//
//	6. Pop 2 from first stack and push it to second stack. 
//	   Push left and right children of 2 to first stack
//	      First stack: 4, 5
//	      Second stack: 1, 3, 7, 6, 2
//
//	7. Pop 5 from first stack and push it to second stack.
//	      First stack: 4
//	      Second stack: 1, 3, 7, 6, 2, 5
//
//	8. Pop 4 from first stack and push it to second stack.
//	      First stack: Empty
//	      Second stack: 1, 3, 7, 6, 2, 5, 4


		System.out.println("\npostorder2StackIT");
		if(root == null)
			return; 
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		Node n = root;
		while(true) {
			if(n!=null) {
				stack1.push(n);
				stack2.push(n.left);
				stack2.push(n.right);
			}
			if(!stack2.empty()) {
				n=stack2.pop();
			}
			else
				break;
		}
		Node v = null;
		while(true) {
			if(!stack1.isEmpty()) {
				v=stack1.pop();
				System.out.print(v.data + " ");
			}
			else 
				break;
		}
		
	}
	public void preorderIt() {
		System.out.println("\npreorderIT");
		if(root == null)
			return; 
		
		Stack<Node> stack = new Stack<Node>();
		Node n = root;
		while(true) {
			if(n!=null) {
				System.out.print(n.data+ " ");
				stack.push(n.right);
				stack.push(n.left);
			}
			if(stack.empty()) {
				break;
			}
			n=stack.pop();
			
		}
		
	}
	
	
	public void inorder() {
		System.out.println("\nInorderR");
		inorder(root);
	}
	private void inorder(Node n) {
		if(n!=null) {
			inorder(n.left);
			System.out.print(n.data + " ");
			inorder(n.right);
		}
		
	}
	public void postorderR() {
		System.out.println("\nPostorderR");
		postorderR(root);
	}
	private void postorderR(Node n) {
		if(n!=null) {
			postorderR(n.left);
			postorderR(n.right);
			System.out.print(n.data + " ");	
		}
	}
	public void preorderR() {
		System.out.println("\nPreorderR");
		preorderR(root);
	}
	private void preorderR(Node n) {
		if(n!=null) {
			System.out.print(n.data + " ");	
			preorderR(n.left);
			preorderR(n.right);
		}
	}
	
	public void spiralOrderTraversal() {
		System.out.print("\nSpiral order Traversal");
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();		
		if(root==null) {
			return;
		}
		
		Node node = root;
		s1.push(node);
		while(true) {
			System.out.println();
			while(!s1.empty()) {
				node = s1.pop();
				System.out.print(node.data + " ");
				if(node.left!=null)
					s2.push(node.left);
				if(node.right!=null)
					s2.push(node.right);
			}
			System.out.println();
			while(!s2.empty()) {
				node = s2.pop();
				System.out.print(node.data + " ");
				if(node.right!=null)
					s1.push(node.right);
				if(node.left!=null)
					s1.push(node.left);
			}
			if(s1.empty() && s2.empty()) {
				return;
			}
			
		}
	}
	
	public void levelOrderTraversal() {
		System.out.print("\nLevel order Traversal");
		LinkedList<Node> s1 = new LinkedList<>();
		LinkedList<Node> s2 = new LinkedList<>();		
		if(root==null) {
			return;
		}
		
		Node node = root;
		s1.add(node);
		while(true) {
			System.out.println();
			while(!s1.isEmpty()) {
				node = s1.poll();
				System.out.print(node.data + " ");
				if(node.left!=null)
					s2.add(node.left);
				if(node.right!=null)
					s2.add(node.right);
			}
			System.out.println();
			while(!s2.isEmpty()) {
				node = s2.poll();
				System.out.print(node.data + " ");
				if(node.left!=null)
					s1.add(node.left);
				if(node.right!=null)
					s1.add(node.right);
			}
			if(s1.isEmpty() && s2.isEmpty()) {
				return;
			}
			
		}
	}
	
	
	public void findLowestCommonAncestor(int first, int second) {
		
		if(root==null) {
			return;
		}
		Node node = root;
		Integer value = lowestCommonAncestor(first, second, node);
		System.out.println("LowestCommonAncestor is "+value);
	}
	private Integer lowestCommonAncestor(int first, int second, Node parent) {
		Integer value_right = null;
		Integer value_left = null;
		if(parent.right!=null) {
			value_right = lowestCommonAncestor(first, second, parent.right);
		}
		if(parent.left!=null) {
			value_left = lowestCommonAncestor(first, second, parent.left);
		}
		if(parent.data==first || parent.data==second ) {
			return parent.data;
		}
		if(value_right!=null && value_left!=null && (value_right == first || value_right == second) 
				&& (value_left == first || value_left == second)) {
			return parent.data;
		}
		if(value_right != null && value_left == null) {
			return value_right;
		}
		if(value_right == null && value_left != null) {
			return value_left;
		}
		
		return null;
	}
}