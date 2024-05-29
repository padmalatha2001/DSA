package practice;

import java.lang.reflect.Constructor;

public class DoubleLinkedList {

	
	  private TreeNode head;
	  private TreeNode tail;
	  private int length;
	  
	  private static class TreeNode{
		  private int data;
		  private TreeNode next;
		  private TreeNode previous;
		  
		  TreeNode(int data){
			  this.data=data;
		  }
	  }
	  public void insertBegin(int data) {
		  TreeNode node=new TreeNode(data);
		  if(this.head==null&&this.tail==null)
		  {
			  head=node;
			  tail=node;
			  length++;
			  return;
		  }
		 
		  node.next=head;
		  head.previous=node;
		  head=node;
		  length++;
		 
	  }
	  public void insertLast(int data) {
		  TreeNode node=new TreeNode(data);
		  if(this.head==null&&this.tail==null)
		  {
			  head=node;
			  tail=node;
			  length++;
			  return;
		  }
		     tail.next=node;
		     node.previous=tail;
		     tail=node;
		     length++;
	  }
	  
	  public void print() {
		  TreeNode temp=head;
		  while(temp!=null) {
			  System.out.print(temp.data+"->");
			  temp=temp.next;
		  }
		  System.out.print("null");
	  }
	  
	  public void backTraversal() {
		  TreeNode temp=tail;
		  while(temp!=null) {
			  System.out.print(temp.data+" ->");
			  temp=temp.previous;
		  }
		  System.out.print("null");
	  }
	  
	  public DoubleLinkedList merge(DoubleLinkedList list1,DoubleLinkedList list2) {
		  int n1=list1.length;
		  int n2=list2.length;
		  DoubleLinkedList dl=new DoubleLinkedList();
		  TreeNode temp1=list1.head;
		  TreeNode temp2=list2.head;
		  while(temp1!=null&&temp2!=null) {
			  if(temp1.data<temp2.data) {
				  dl.insertLast(temp1.data);
				  temp1=temp1.next;
			  }
			  else {
				  dl.insertLast(temp2.data);
				  temp2=temp2.next;
			  }
		  }
		  while(temp1!=null) {
			  dl.insertLast(temp1.data);
			  temp1=temp1.next;  
		  }
		  while(temp2!=null) {
			  dl.insertLast(temp2.data);
			  temp2=temp2.next;  
		  }
		  return dl;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  DoubleLinkedList dl=new DoubleLinkedList();
		  dl.insertLast(4);
		  dl.insertBegin(2);
		  dl.insertBegin(3);
		  dl.insertBegin(8);
		  System.out.println("first list");
		  dl.print();
		  System.out.println();
		  DoubleLinkedList dl2=new DoubleLinkedList();
		  dl2.insertLast(5);
		  dl2.insertBegin(1);
		  dl2.insertBegin(6);
		  System.out.println("second list");
		 dl2.print();
		 System.out.println();
		 DoubleLinkedList dl3=dl.merge(dl, dl2);
		 System.out.println("merged list");
		 dl3.print();
		 
	}

}
