package dsa.queue;

public class Queue {
	
	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data=data;
		}
	}
     public boolean isEmpty() {
    	 return length==0;
     }
     public int length()
     {
    	 return length;
     }
     public void enqueue(int data)
     {
    	 ListNode node=new ListNode(data);
    	 if(isEmpty())
    		 front=node;
    	 else
    		rear.next=node;
    	 rear=node;
    	 length++;
     }

     public void dequeue() {
    	 if(isEmpty())
    		 System.out.println("Queue is empty");
    	 front=front.next;
    	 if(front==null) {
    		 rear=null;
    	 }
     }
     
     public void print() {
    	 ListNode temp=front;
    	 while(temp!=null) {
    		 System.out.print(temp.data+" ");
    		 temp=temp.next;
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Queue queue=new Queue();
         queue.enqueue(1);
         queue.enqueue(2);
         queue.enqueue(3);
         queue.enqueue(4);
         queue.enqueue(5);
         queue.enqueue(6);
         queue.print();
         System.out.println();
         queue.dequeue();
         queue.print();
         
        
	}

}
