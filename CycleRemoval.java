package linkedlist;

class ListNode {
	  int val;
	  ListNode next;

	  ListNode(int x) {
	    val = x;
	    next = null;
	  }
	}
public class CycleRemoval {
	public static void main(String args[]) {
	    ListNode head = new ListNode(2);
	    ListNode l1 = new ListNode(8);
	    head.next = l1;
	    ListNode l2 = new ListNode(3);
	    l1.next = l2;
	    ListNode l3 = new ListNode(5);
	    l2.next = l3;
	    ListNode l4 = new ListNode(10);
	    l3.next = l4;
	    l4.next = l2;
	    
	    CycleRemoval s1 = new  CycleRemoval();
	    s1.removeLoop(head);
	    while (head != null) {
	      System.out.print(head.val + "->");
	      head = head.next;
	    }
	    System.out.println("NULL");
	  }
	public static void removeLoop(ListNode head) {
	    ListNode ptr1 = head;
	    ListNode ptr2 = head;
	    boolean flag = false;
	    while (ptr2 != null && ptr2.next != null) {
	      ptr1 = ptr1.next;
	      ptr2 = ptr2.next.next;
	  
	      if (ptr1 == ptr2) {
	        flag = true;
	        break;
	      }
	    }
	    if (flag) {
	        ptr1 = head;
	        while (ptr1.next != ptr2.next) {
	          ptr1 = ptr1.next;
	          ptr2 = ptr2.next;
	        }
	        ptr2.next = null;
	      }

	    }
	}
