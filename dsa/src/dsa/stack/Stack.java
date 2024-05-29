package dsa.stack;

public class Stack {

	private ListNode top;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	
	public Stack() {
		top=null;
		length=0;
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length==0;
	}
	
	public void push(int data) {
		ListNode node=new ListNode(data);		
			node.next=top;
			top=node;
			length++;
		
	}
	public int pop()
	{
		if(length==0) {
			throw new RuntimeException("Stack is empty");
		}
		int k=top.data;
		top=top.next;
		length--;
		return k;
	}
	public int peek()
	{
		return top.data;
	}
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push(5);
		stack.push(15);
		stack.push(25);
		stack.push(35);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		
	}
}
