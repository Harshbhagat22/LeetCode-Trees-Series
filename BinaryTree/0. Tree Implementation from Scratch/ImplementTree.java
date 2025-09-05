class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
        public TreeNode(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
}

public class ImplementTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right.right = new TreeNode(20);
		
		
		// call to print Tree Traversal
		inorder(root);
	
	}
	
	public static void inorder(TreeNode root){
	    if(root == null){
	        return;
	    }
	    
	    inorder(root.left);
	    System.out.print(root.data+" ");
	    inorder(root.right);
	}
}