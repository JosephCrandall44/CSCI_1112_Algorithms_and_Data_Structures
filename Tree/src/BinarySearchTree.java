public class BinarySearchTree {
	private static BTNode<Integer> rootNode;

	public BinarySearchTree(int inputVal) {
		rootNode = new BTNode<Integer>(inputVal, null, null);

	}

	public boolean search(int value) {
		return search(value, rootNode);
	}

	boolean search(int value, BTNode<Integer> treeNode) {
		if (value == treeNode.getData()) {
			return true;
		} else {
			if (value < treeNode.getData()) {
				// search left subtree if not null
				if (treeNode.getLeft() == null)
					return false;
				else
					return search(value, treeNode.getLeft());
			} else {
				// search right subtree if not null
				if (treeNode.getRight() == null)
					return false;
				return search(value, treeNode.getRight());
			}
		}
	}
	
	
	
	public static void insertValue(int val, BTNode<Integer> treeNode) {
		if (val < treeNode.getData()) {
			if (treeNode.getLeft() == null) {
			BTNode<Integer> newNode = new BTNode<Integer>(val, null, null);
			
			treeNode.setLeft(newNode);
			} else {
				insertValue(val, treeNode.getLeft());
			}
		} else if (val >= treeNode.getData()){
			if (treeNode.getRight() == null){
			BTNode<Integer> newNode = new BTNode<Integer>(val, null, null);
			treeNode.setRight(newNode);}
		} else {
			insertValue(val, treeNode.getRight());
		}
		} 
	
	public static void insertValue(int val) {
		insertValue(val, rootNode);
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree newTree = new BinarySearchTree(14);
		
		insertValue(17);
		insertValue(11);
		insertValue(9);
		insertValue(53);
		insertValue(4);
		insertValue(13);
		insertValue(19);
		insertValue(7);
		
		newTree.rootNode.inorderPrint();
	}
}

