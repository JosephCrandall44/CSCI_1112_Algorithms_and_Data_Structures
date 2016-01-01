
public class Example {
	
	
	public static void main(String[]args){
		
	BTNode<Integer> leaf19 = new BTNode <Integer> (19,null,null);
	BTNode<Integer> leaf7 = new BTNode <Integer> (7,null,null);
	BTNode<Integer> node4 = new BTNode <Integer> (4,leaf19,leaf7);
	BTNode<Integer> node11 = new BTNode <Integer> (1,node4,null);
	
	BTNode<Integer> leaf13 = new BTNode <Integer> (13,null,null);
	BTNode<Integer> node9 = new BTNode <Integer> (9,null,leaf13);
	BTNode<Integer> leaf53 = new BTNode <Integer> (53,null,null);
	BTNode<Integer> node17 = new BTNode <Integer> (17,node9,leaf53);

	BTNode<Integer> node14 = new BTNode <Integer> (14,node17,node11);
	
	node14.preorderPrint();
	node14.inorderPrint();
	node14.postorderPrint();
	System.out.println();
	
	BTNode<Integer> node19Binary = new BTNode <Integer> (19,null,null);
	BTNode<Integer> node7Binary = new BTNode <Integer> (7,null,null);
	BTNode<Integer> node4Binary = new BTNode <Integer> (4,null,node7Binary);
	BTNode<Integer> node53binary = new BTNode <Integer> (53,node19Binary,null);
	BTNode<Integer> node13Binary = new BTNode <Integer> (13,null,null);
	BTNode<Integer> node9Binary = new BTNode <Integer> (9,node4Binary,null);
	BTNode<Integer> node11Binary = new BTNode <Integer> (11,node9Binary,node13Binary);
	BTNode<Integer> node17Binary = new BTNode <Integer> (17,node17,node53binary);
	BTNode<Integer> node14Binary = new BTNode <Integer> (14,node11Binary,node17Binary);

	node14Binary.preorderPrint();
	node14Binary.inorderPrint();
	node14Binary.postorderPrint();
	}

}
