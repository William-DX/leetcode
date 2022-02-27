public class MergeLinkedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //保护节点
        ListNode protect = new ListNode(-1);
        ListNode cur = protect;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return protect.next;
    }
}
