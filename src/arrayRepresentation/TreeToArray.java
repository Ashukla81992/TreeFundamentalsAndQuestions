package arrayRepresentation;


import node.Node;

public class TreeToArray {
	
	Node root;
	int max;
	
	public void toArray() {
		int[] a = new int[20];
		int position = 0;
		max=0;
		toArray(root, position,a);
		for(int i=0; i<=max; i++) {
			System.out.print("Value at "+i +": "+ a[i]+ " ");
		}
	}

	private void toArray(Node node, int position, int[] a) {

		if(node!=null) {
			if(max<position) {
				max=position;
			}
			a[position]= node.data;
			toArray(node.left, 2*position+1, a);
			toArray(node.right, 2*position+2, a);
		}
		else
			return;
	}

}
