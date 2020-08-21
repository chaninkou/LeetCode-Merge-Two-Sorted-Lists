package leetcode21;

public class MergeTwoSortedListsSolution {
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if(l1 == null){
//            return l2;
//        }
//        if(l2 == null){
//            return l1;
//        }
//        if(l1.val < l2.val){
//            l1.next = mergeTwoLists(l1.next,l2);
//            return l1;
//        }else{
//            l2.next = mergeTwoLists(l1,l2.next);
//            return l2;
//        }
//    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	
    	// Good to do error checking, in case neither of them are null, return right away
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        // Placeholder, so we could return the beginning of the result list later, could be 0 or any number
        ListNode placeHolder = new ListNode(0);
        
        // Get a reference of it, since we always want a pointer of the head
        ListNode current = placeHolder;
        
        // Since one list might be bigger than the other, just check which list is shorter
        // The runtime is O(N) where n is the number of node of the shorter list
        while(l1 != null && l2 != null){
        	// Doesn't matter if equal or not, move the pointer of l1 or l2
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            
            // Remember to update the pointer
            current = current.next;
        }
        
        // After the while loop, l1 or l2 will be null, we will add the node that is not null
        if(l1 == null){
            current.next = l2;
        } else {
            current.next = l1;
        }
        
        // Since we had 0 as place holder
        return placeHolder.next;
    }
}
