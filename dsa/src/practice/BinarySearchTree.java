package practice;

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
		   if(root==null) 
		   {
	           root=new TreeNode(value);
			   return root;
		   }
		   if(value<root.data)
			   root.left=insert(root.left,value);
		   if(value>root.data)
			   root.right=insert(root.right,value);
		   return root;
	   }
	   public void preOrder(TreeNode root) {
		   if(root==null)
			   return;
		
		   System.out.print(root.data+"->");
		   preOrder(root.left);
		   preOrder(root.right);
	   }
	   public void inOrder(TreeNode root) {
		   if(root==null)
			   return;
		  
		   inOrder(root.left);
		   System.out.print(root.data+"->");
		   inOrder(root.right);
	   }
	   public void postOrder(TreeNode root) {
		   if(root==null)
			    return;
		  
		   postOrder(root.left);
		   postOrder(root.right);
		   System.out.print(root.data+"->");
	   }
	public static void main(String[] args) {
		BinarySearchTree binarySearchTree=new BinarySearchTree();
		TreeNode root=binarySearchTree.insert(null, 9);
		binarySearchTree.insert(root, 4);
		binarySearchTree.insert(root, 8);
		binarySearchTree.insert(root, 3);
		binarySearchTree.insert(root, 16);
		binarySearchTree.insert(root, 13);
		binarySearchTree.insert(root, 18);
		System.out.println("-------PreOrder----------");
		binarySearchTree.preOrder(root);
		System.out.println("\n--------InOrder-----------");
		binarySearchTree.inOrder(root);
		System.out.println("\n--------PostOrder---------");
		binarySearchTree.postOrder(root);

	}

}
