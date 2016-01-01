public class Example {

	public static void main(String[] args) {
		
		//CREATE THE BINARY TREE
		BTNode<Integer> nodeOne = new BTNode<Integer>(19, null, null);

		BTNode<Integer> nodeTwo = new BTNode<Integer>(7, null, null);
		
		BTNode<Integer> nodeThree = new BTNode<Integer>(4, nodeTwo, nodeOne);
		
		BTNode<Integer> nodeFour = new BTNode<Integer>(13, null, null);
		
		BTNode<Integer> nodeFive = new BTNode<Integer>(9, null, nodeFour);
		
		BTNode<Integer> nodeSix = new BTNode<Integer>(53, null, null);
		
		BTNode<Integer> nodeSeven = new BTNode<Integer>(17, nodeFive, nodeSix);
		
		BTNode<Integer> nodeEight = new BTNode<Integer>(11,nodeThree ,null );
		
		BTNode<Integer> nodeParent = new BTNode<Integer>(14, nodeSeven, nodeEight);
		
		
		//PRINT THE BINARY TREE
		nodeParent.inorderPrint();
		nodeParent.preorderPrint();
		nodeParent.postorderPrint();
		
		//CREATE THE BINARY SEARCH TREE
		BTNode<Integer> nodeOneS = new BTNode<Integer>(4, null, null);

		BTNode<Integer> nodeTwoS = new BTNode<Integer>(53, null, null);
		
		BTNode<Integer> nodeThreeS = new BTNode<Integer>(17, null, nodeTwoS);
		
		BTNode<Integer> nodeFourS = new BTNode<Integer>(19, null, null);
		
		BTNode<Integer> nodeFiveS = new BTNode<Integer>(14,nodeFourS, nodeThreeS);
		
		BTNode<Integer> nodeSixS = new BTNode<Integer>(7, nodeOneS, null);
		
		BTNode<Integer> nodeSevenS = new BTNode<Integer>(9, null, null);
		
		BTNode<Integer> nodeEightS = new BTNode<Integer>(11, nodeSixS, nodeSevenS);
		
		BTNode<Integer> nodeParentS = new BTNode<Integer>(13, nodeEightS, nodeFiveS);
		
		//PRINT BINARY SEARCH TREE
		nodeParentS.inorderPrint();
		nodeParentS.preorderPrint();
		nodeParentS.postorderPrint();
		
		
	}

}

