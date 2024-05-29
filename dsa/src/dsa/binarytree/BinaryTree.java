package dsa.binarytree;

import java.util.Stack;



public class BinaryTree {

	 private TreeNode root;
	 private TreeNode prev;
	 
	 int[] diameter=new int[1];
	 private class TreeNode{
		 private int data;
		 private TreeNode left;
		 private TreeNode right;
		 
		 public TreeNode(int data) {
			 this.data=data;
		 }
	 }
	 
	 private TreeNode createTree() {
		 TreeNode first=new TreeNode(1);
		 TreeNode second=new TreeNode(2);
		 TreeNode third=new TreeNode(3);
		 TreeNode fourth=new TreeNode(4);
		 TreeNode fifth=new TreeNode(5);
		 TreeNode six=new TreeNode(6);
		 
		 this.root=first;
		 first.left=second;
		 first.right=third;
		 second.left=fourth;
		 //fourth.left=third;
		 second.right=fifth;
		 third.left=six;
		 
		 return root;
		 
	 }
	 
//	 public void preOrderTraversal(TreeNode root) {
//		 if(root==null)
//			 return;
//		 TreeNode temp=root;
//		 System.out.print(temp.data+" ");
//		 preOrderTraversal(temp.left);
//		 preOrderTraversal(temp.right);
//	 }
	 
	 public void preOrderTraversal(TreeNode root) {
		 if(root==null) 
			 return;
		 Stack<TreeNode> stack=new Stack<>();
		 stack.push(root);
		 while(!stack.isEmpty()) {
			 TreeNode temp=stack.pop();
			 System.out.print(temp.data+" ");
			 if(temp.right!=null)
				 stack.push(temp.right);
			 if(temp.left!=null)
				 stack.push(temp.left);
		 }
		  
		 }
	public void inOrderTraversal(TreeNode root) {
		 if(root==null)
			 return;
		TreeNode temp=root;
		inOrderTraversal(temp.left);
		System.out.print(temp.data+" ");
		inOrderTraversal(temp.right);
	}
	public void postOrderTraversal(TreeNode root) {
		 if(root==null)
			 return;
		TreeNode temp=root;
		
		postOrderTraversal(temp.left);
		postOrderTraversal(temp.right);
		System.out.print(temp.data+" ");
	}
	public int findMax(TreeNode root) {
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int result=root.data;
		int left=findMax(root.left);
		int right=findMax(root.right);
		if(left>result)
			result=left;
		if(right>result)
			result=right;
		
		return result;
	}
	 public int height(TreeNode root) {
		 if(root==null)
    		 return 0;
    	 int left=height(root.left);
    	 int right=height(root.right);
    	 return Math.max(left, right)+1;
     }
	
	public boolean isBST(TreeNode node) {
		 if(node!=null) {
			 if(!isBST(node.left))
				 return false;
			 
			 if(prev!=null && node.data<=prev.data)
				 return false;
			 
			 prev=node;
			 
			 
				 return isBST(node.right);
		 }
		 return true;
	 }
	 public TreeNode findLCA(TreeNode node,int n1,int n2) {
		 if(node==null)
			 return null;
		 
		 if(node.data==n1||node.data==n2)
			 return node;
		 
		 TreeNode left=findLCA(node.left,n1,n2);
		 TreeNode right=findLCA(node.right,n1,n2);
		 
		 if(left!=null&&right!=null)
			 return node;
		 return left!=null? left:right;
	 }
	 
	 
	 
	 public boolean isBalanced(TreeNode root) {
		 return dfHeight(root)!=-1;
	 }
	 
	 private int dfHeight(TreeNode root) {
		// TODO Auto-generated method stub
		 if(root==null)
		    return 0;
		 int left=dfHeight(root.left);
		 if(left==-1)
			 return -1;
		 int right=dfHeight(root.right);
		 if(right==-1)
			 return -1;
		 if(Math.abs(right-left)>1)
			 return -1;
		 
		 return Math.max(left, right)+1;
	}

	 public int diameter(TreeNode root,int[] diameter) {
		if(root==null)
			return 0;
		int left=diameter(root.left,diameter);
		int right=diameter(root.right,diameter);
		diameter[0]=Math.max(diameter[0], right+left);
		
		return Math.max(left, right)+1;
		 
	 }
	 public int maxPath(TreeNode root) {
		 if(root==null)
			 return 0;
		 int[] max=new int[1];
		 max[0]=Integer.MIN_VALUE;
		 pathDown(root,max);
		 return max[0];
	 }
	private int pathDown(TreeNode root, int[] max) {
		if(root==null)
			return 0;
		int left=Math.max(0, pathDown(root.left, max));
		int right=Math.max(0, pathDown(root.right, max));
		max[0]=Math.max(max[0], right+left+root.data);
		return root.data+Math.max(left, right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree binaryTree=new BinaryTree();
        TreeNode node=binaryTree.createTree();
        binaryTree.preOrderTraversal(node);
        System.out.println();
        binaryTree.inOrderTraversal(node);
        System.out.println();
        binaryTree.postOrderTraversal(node);
        System.out.println();
        System.out.println("Max value is : "+binaryTree.findMax(node));
        System.out.println("Height :"+binaryTree.height(node));
        System.out.println("IS BST:"+binaryTree.isBST(node));
        TreeNode lca=binaryTree.findLCA(node, 4, 5);
        if(lca!=null)
        {
        	System.out.println("The lowest common ancestor of "+4+" and "+5+" : "+lca.data);
        }
        else {
        	System.out.println("No such common ancestor exists");
        }
        boolean bool=binaryTree.isBalanced(node);
        System.out.println("Tree is Balanced: "+bool);
        System.out.println("Diameter : "+binaryTree.diameter(node,binaryTree.diameter));
        System.out.println("Max path sum : "+binaryTree.maxPath(node));
	}

}
