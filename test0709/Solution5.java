package test0703;

/**
 * @Author:wangrui
 * @Date:2020/7/3 21:59
 */
/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
/*
 * 功能描述:给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @return 
 */
public class Solution5 {
    public ListNode EntryNodeOfLoop(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }
        //没有环
        if (fast == null || fast.next == null) {
            return null;
        }
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

}
