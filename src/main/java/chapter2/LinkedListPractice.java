package chapter2;

import model.ListNode;

public class LinkedListPractice {

    public ListNode sumList(ListNode n1, ListNode n2) {

        int carry =  0;
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;

        n1 = reverse(n1);
        n2 = reverse(n2);

        while( n1 != null ||  n2 != null ) {
            int val1 = n1 != null ? n1.val : 0;
            int val2 = n2 != null ? n2.val : 0;
            int sum = val1 + val2+ carry;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            n1 = n1!=null? n1.next : null;
            n2 = n2!= null ? n2.next : null;
        }

        if(carry != 0) cur.next = new ListNode(carry);

        return reverse(dummyHead.next);
    }



    public boolean isPalindrom(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode current = head;
        ListNode helper = reverse(head);

        while(helper != null && current != null) {
            if(helper.val != current.val) return false;
            helper = helper.next;
            current = current.next;
        }
        return true;

    }


    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;

        while(cur != null){
            next = cur.next;
            head.next = prev;
            head = next;
            prev = cur;
            cur = next;
        }
        return prev;
    }


    public int kthToLast(ListNode head , int k) {

        ListNode current = head;

        int size = size(head);

        if(size == k ) return head.val;
        if(size < k) return -1;

        int length = size - k;
        for(int i = 0 ; i < length; i++){
            current = current.next;
        }
        int result = current.val;

        return result;

    }


    public int size(ListNode head){
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        return size;
    }


}


