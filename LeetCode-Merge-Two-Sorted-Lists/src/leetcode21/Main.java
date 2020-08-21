package leetcode21;


public class Main {
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		MergeTwoSortedListsSolution list = new MergeTwoSortedListsSolution();
		
		ListNode node = list.mergeTwoLists(l1, l2);
		
		display(node);
	}
	
	// Displaying the linked list
	public static void display(ListNode head){
		if(head == null){
			return;
		}
		ListNode current = head;
		while(current != null){
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		
		// Print out the null too, smart idea here
		System.out.println(current);
	}
}
