package dsa;

public class DoublyLinkedList {
 
    private ListNode head;
    private ListNode tail;
    private int length;
    
    private static class ListNode{
    	   private int data;
    	   private  ListNode previous;
    	   private ListNode next;
    	   
    	   ListNode(int data){
    		   this.data=data;
    	   }
    }
    
    public void insertBegin(ListNode node) {
    	if(head==null) {
    		head=node;
    		tail=node;
    		length++;
    		
    	}
    	else {
    		head.previous=node;
    		node.next=head;
    		head=node;
    		length++;
    	}
    }
    public void insertLast(ListNode node) {
    	if(head==null) {
    		head=node;
    		tail=node;
    		length++;
    	
    	}
    	else {
    		tail.next=node;
    		node.previous=tail;
    		tail=node;
    		length++;
    	}
    }
    
    public void deleteFirst() {
    	
    	head=head.next;
    	head.previous=null;
    }
    public void deleteLast() {
    	tail=tail.previous;
    	tail.next=null;
    }
    public void print() {
    	ListNode temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data+"-->");
    		temp=temp.next;
    	}
    	System.out.print("null");
    }
    public static void main(String[] args) {
		DoublyLinkedList dl=new DoublyLinkedList();
		ListNode node=new ListNode(1);
		dl.insertBegin(node);
	    node=new ListNode(2);
	    dl.insertBegin(node);
	    node=new ListNode(3);
	    dl.insertLast(node);
	    node=new ListNode(4);
	    dl.insertBegin(node);
	    node=new ListNode(5);
	    dl.insertLast(node);
	    dl.print();
	    System.out.println();
	    dl.deleteFirst();
	    dl.print();
	    System.out.println();
	    dl.deleteLast();
	    dl.print();
	}
}
