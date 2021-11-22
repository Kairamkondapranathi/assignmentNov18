package linkedlist;

public class MiddleElement {
	int data;
	  private LinkedList next;
	public Node head;
	  
	  public LinkedList() {
		  
	  }
	  public LinkedList(int data) {
		  this.data=data;
	  }
	  
	  
	public static void middleFinder() {
		
	}
	public static void main(String[] args) {
	LinkedList node1 = new LinkedList();
	LinkedList node2 = new LinkedList();
	LinkedList node3 = new LinkedList();
	LinkedList node4 = new LinkedList();
	LinkedList node5 = new LinkedList();
	LinkedList node6 = new LinkedList();
	LinkedList node7 = new LinkedList();
	
	 node1.data=1;
	 node2.data=2;
	 node3.data=3;
	 node4.data=4;
	 node5.data=5;
	 node6.data=6;
	 node7.data=7;
	
	
	node1.next=node2;
	node2.next=node3;
	node3.next=node4;
	node4.next=node5;
	node5.next=node6;
	node6.next=node7;
	node7.next=null;
	
	
	LinkedList L = new LinkedList();
	System.out.print(L.MiddleElement(node1));
}
	private int MiddleElement(LinkedList List) {
		LinkedList slow = List;
		LinkedList fast = List;
		
		while(fast.next != null && fast.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}


}
