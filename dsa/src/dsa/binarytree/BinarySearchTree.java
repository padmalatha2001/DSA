package dsa.binarytree;

public class BinarySearchTree {
     private TreeNode root;
     private class TreeNode{
    	 private int data;
    	 private TreeNode left;
    	 private TreeNode right;
    	 
    	 TreeNode(int data){
    		 this.data=data;
    	 }
     }
     
     public TreeNode insert(TreeNode root,int value) {
    	 if(root==null) {
    		 root=new TreeNode(value);
    		 return root;
    	 }
    	 
    	 if(value<root.data)
    		root.left= insert(root.left,value);
    	 if(value>root.data)
    		root.right= insert(root.right,value);
    	 
    	 return root;
     }
     
     public void inOrder(TreeNode root) {
    	 if(root==null)
    		 return;
    	 inOrder(root.left);
    	 System.out.print(root.data+" ");
    	 inOrder(root.right);
     }
     
     public int height(TreeNode root) {
    	 if(root==null)
    		 return 0;
    	 int left=height(root.left);
    	 int right=height(root.right);
    	 return Math.max(left, right)+1;
     }
     public static void main(String[] args) {
		
    	 BinarySearchTree tree=new BinarySearchTree();
    	TreeNode root=tree.insert(null,5);
    	tree.insert(root, 3);
    	tree.insert(root, 1);
    	tree.insert(root, 4);
    	tree.insert(root, 6);
    	tree.insert(root, 7);
    	tree.insert(root, 8);
    	tree.inOrder(root);
    	System.out.println();
    	System.out.println("Height:"+tree.height(root));
    	
	}
}
