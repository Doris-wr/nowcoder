package test0708;

/**
 * @Author:wangrui
 * @Date:2020/7/8 8:01
 */
/*
 * 功能描述:输入两个链表，找出它们的第一个公共结点。
 * @return 
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution3 {
    public ListNode FindFirstCommonNode(ListNode head1, ListNode head2) {
        if(head1==null||head2==null){
            return null;
        }
        if(head1==head2){
            return head1;
        }
        int len1=0,len2=0;
        ListNode cur1=head1;
        ListNode cur2=head2;
        while(cur1!=null){
            len1++;
            cur1=cur1.next;
        }
        while(cur2!=null){
            len2++;
            cur2=cur2.next;
        }
        cur1=head1;
        cur2=head2;
        if(len1>len2){
            int n=len1-len2;
            while(n!=0){
                cur1=cur1.next;
                n--;
            }
        }else{
            int n=len2-len1;
            while(n!=0){
                cur2=cur2.next;
                n--;
            }
        }
        while(cur1!=cur2&&cur1!=null){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}