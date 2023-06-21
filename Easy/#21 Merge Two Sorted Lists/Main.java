import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        // list1.next = new ListNode(2);
        // list1.next.next = new ListNode(4);

        // ListNode list2 = new ListNode(1);git 
        // list2.next = new ListNode(3);
        // list2.next.next = new ListNode(4);

        printListValuse(mergeTwoLists(list1, null));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempList1 = list1;
        ListNode tempList2 = list2;

        if (tempList1 == null) {
            return tempList2;
        } else if (tempList2 == null) {
            return tempList1;
        }
        if (tempList1.val <= tempList2.val) {
            tempList1.next = mergeTwoLists(tempList1.next, tempList2);
            return tempList1;
        } else {
            tempList2.next = mergeTwoLists(tempList1, tempList2.next);
            return tempList2;
        }
    }

    private static void printListValuse(ListNode list) {
        Queue<ListNode> queue = new LinkedList<>();
        queue.add(list);
        while (!queue.isEmpty()) {
            ListNode tempNode = queue.remove();
            if (tempNode != null) {
                queue.add(tempNode.next);
                System.out.println(tempNode.val);
            }
        }
    }
}
