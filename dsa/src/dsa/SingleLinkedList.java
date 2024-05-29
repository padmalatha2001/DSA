package dsa;

public class SingleLinkedList {
	
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertAtBegin(ListNode node) {
		if(head==null) {
			head=node;
			return;
		}
		else {
			node.next=head;
			head=node;	
		}
	}
	
	public void inserAtLast(ListNode node) {
		if(head==null) {
			head=node;
			return;
		}
		ListNode current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=node;
	}
	
	public void inserAtPosition(ListNode node,int pos) {
		if(pos==1) {
			insertAtBegin(node);
		}
		int count=1;
		ListNode current=head;
		while(current.next!=null) {
			count++;
			if(count==pos) {
				ListNode temp=current.next;
				current.next=node;
				node.next=temp;
				return;
			}
			current=current.next;
		}
		System.out.println("the position you have given exceeded the size of linkedList");
	}
	
	public int length() {
		ListNode current=head;
		int count=0;
		if(head!=null)
			 count=1;
		while(current.next!=null)
		{  count++;
		  current=current.next;
		}
		
		return count;
	}
	public void print() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current=current.next;
		}
		System.out.println("null");
	}
	
	public void deleteFirst() {
		ListNode current=head;
		if(head!=null) {
			head=head.next;
		}
	}
	public void deleteLast() {
		ListNode current=head;
		ListNode previous=head;
		if(head!=null&&head.next==null) {
			head=null;
		}
		while(current.next!=null) {
			previous=current;
			current=current.next;
		}
		previous.next=null;
		
	}
	public void deleteAtPosition(int pos) {
		if(pos==1) {
			deleteFirst();
		}
		else if(pos==length()) {
			deleteLast();
		}
		else if(pos>length()) {
			System.out.println("No element is present at that position");
		}
		else {
			ListNode current=head;
			int count=1;
			while(current.next!=null&&count<pos-1) {
			     count++;
				current=current.next;
			}
			current.next=current.next.next;
		}
	}
	
	public boolean search(int data) {
		ListNode current=head;
		while(current!=null) {
			if(current.data==data)
				return true;
			current=current.next;
		}
		return false;
	}
	public SingleLinkedList reverse(SingleLinkedList singleLinkedList) {
		SingleLinkedList list=new SingleLinkedList();
		ListNode current=singleLinkedList.head;
		while(current!=null)
		{
			ListNode temp=new ListNode(current.data);
			list.insertAtBegin(temp);
			current=current.next;
		}
		return list;
	}
	public ListNode middleNode() {
		ListNode fst=head;
		ListNode sl=head;
		while(fst!=null&&fst.next!=null) {
			sl=sl.next;
			fst=fst.next.next;
		}
		 
		 return sl;
		  
	}
	
	public SingleLinkedList mergeLists(SingleLinkedList list,SingleLinkedList list1) {
		SingleLinkedList list2=new SingleLinkedList();
		ListNode temp=list.head;
		ListNode temp1=list1.head;
		ListNode store=null;
		if(temp==null)
		{
			list2.head=list1.head;
		}
		else if (temp1==null)
		{
			list2.head=list.head;
		}
		else {
			while(temp!=null&&temp1!=null) {
				store=new ListNode(temp.data);
				list2.inserAtLast(store);
				store=new ListNode(temp1.data);
				list2.inserAtLast(store);
				temp=temp.next;
				temp1=temp1.next;
			}
			while(temp!=null)
			{
				 list2.inserAtLast(new ListNode(temp.data));
				 temp=temp.next;
			}
			while(temp1!=null)
			{
				 list2.inserAtLast(new ListNode(temp1.data));
				 temp1=temp1.next;
			}
		}
		return list2;
	}
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList= new SingleLinkedList();
		ListNode node=new ListNode(1);
		singleLinkedList.insertAtBegin(node);
	    node=new ListNode(2);
	    singleLinkedList.insertAtBegin(node);
	    node=new ListNode(3);
		singleLinkedList.inserAtLast(node);
		
		node=new ListNode(4);
		singleLinkedList.inserAtLast(node);
		node=new ListNode(5);
		singleLinkedList.inserAtPosition(node, 3);
		node=new ListNode(6);
		singleLinkedList.inserAtPosition(node, 3);
		singleLinkedList.deleteFirst();
		singleLinkedList.deleteLast();
		singleLinkedList.deleteAtPosition(3);
		System.out.println("is present : "+singleLinkedList.search(3));
		System.out.println("Length of llinked list :"+singleLinkedList.length());
		SingleLinkedList reversedList=singleLinkedList.reverse(singleLinkedList);
	    singleLinkedList.print();
	    reversedList.print();
	    System.out.println(singleLinkedList.middleNode().data);
		SingleLinkedList singleLinkedList2= new SingleLinkedList();
		 node=new ListNode(7);
		singleLinkedList2.insertAtBegin(node);
	    node=new ListNode(8);
	    singleLinkedList2.insertAtBegin(node);
	    node=new ListNode(9);
		singleLinkedList2.inserAtLast(node);
		
		node=new ListNode(10);
		singleLinkedList2.inserAtLast(node);
		singleLinkedList2.print();
		singleLinkedList.mergeLists(singleLinkedList, singleLinkedList2).print();
	}

}
