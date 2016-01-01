public class NumberOfLeaves {		
	public int Test (BTNode T){
		if ( T == null )
			 return 0;
			 else if ( (T.getLeft() != null) || (T.getRight() != null) )
			 return (Test(T.getLeft()) +
			 Test(T.getRight()));
			 else return 1; //if we got here this must be a leaf
			}
}
