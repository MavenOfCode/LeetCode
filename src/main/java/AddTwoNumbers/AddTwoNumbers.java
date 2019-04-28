package AddTwoNumbers;

import java.util.List;


public class AddTwoNumbers {

    //defined nodes as per site for singly linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode (int x){
            val = x;
        }
    }
//WRONG
//    //brute force solution first
//    public ListNode AddTwoNumbers (ListNode List1, ListNode List2){
//
//        //use helper to reverse both lists
//        List1 = reverseList(List1);
//        List2 = reverseList(List2);
//
//        ListNode ResultList = null;
//        ResultList.val = List1.val + List2.val;
//        while(List1.next !=null && List2.next != null){
//          ResultList.next.val = List1.next.val + List2.next.val;
//        }
//        return ResultList;
//    }
//
//    public static ListNode reverseList(ListNode node){
//        ListNode before = null;
//        ListNode temp = node;
//        ListNode next = temp.next;
//        node = next.next;
//        while(temp.next !=null){
//            if (next == null){
//                return node;
//            }
//            temp.next = before;
//            before = temp;
//            temp = next;
//            node = temp.next;
//        }
//        return node;
//    }

    //Solution with help by looking at https://leetcode.com/problems/add-two-numbers/discuss/1453/My-Accepted-JAVA-solution

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        //pointer
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carryValue = 0;
        while(l1 != null || l2 !=null || carryValue !=0){
            //second pointer
            ListNode current = new ListNode(0);
            int sum = ((l1 == null ) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carryValue;
            //capture both values, one in new linked list of list nodes
            current.val = sum%10;
            carryValue = sum/10;
            //move both pointers to same location to restart process
            prev.next = current;
            prev = current;
            //move along the 2 list nodes as long as they still have values
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        //returning prev value's next which is the new linked list head
        return head.next;
    }
}
