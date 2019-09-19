package mergeTwo;

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
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode placeHolder = new ListNode(0);
        
        ListNode current = placeHolder;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            
            current = current.next;
        }
        
        // After the while loop, l1 or l2 will be null, we will add the node that is not null
        if(l1 == null){
            current.next = l2;
        } else {
            current.next = l1;
        }
        
        return placeHolder.next;
    }
}
