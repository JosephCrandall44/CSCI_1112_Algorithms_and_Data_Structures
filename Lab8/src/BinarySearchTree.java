public class BinarySearchTree {
	
	private BTNode<Integer> root;
	
	BinarySearchTree(int x){
		root = new BTNode<Integer>(x, null, null);	
	}
	
	private void insert(int value){
		insert(value, root);
	}
		
	private void insert(int value, BTNode<Integer> treeNode) {

		BTNode<Integer> valueNode = new BTNode<Integer>(value, null, null);

		if (valueNode.getData() < treeNode.getData()) {
			// search left subtree if not null
			if (treeNode.getLeft() == null) {
				treeNode.setLeft(valueNode);
			} else
				insert(value, treeNode.getLeft());
		} else {
			// search right subtree if not null
			if (treeNode.getRight() == null) {
				treeNode.setRight(valueNode);
			}
			insert(value, treeNode.getRight());
		}
	}
}
