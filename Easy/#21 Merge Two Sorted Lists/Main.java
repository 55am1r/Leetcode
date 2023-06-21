import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(2);
        // list1.next = new ListNode(2);
        // list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        // list2.next = new ListNode(3);
        // list2.next.next = new ListNode(4);

        mergeTwoLists(list1, list2);
    }

    private static ListNode addNodeToLast(ListNode nodeList, int val) {
        if (nodeList == null) {
            nodeList = new ListNode(val);
            return nodeList;
        }
        nodeList.next = addNodeToLast(nodeList.next, val);
        return nodeList;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempList1 = list1;
        ListNode tempList2 = list2;

        ListNode finalList = (list1 == null && list2 == null) ? null : new ListNode(Integer.MAX_VALUE);

        while (tempList1 != null) {
            if (tempList2 != null) {
                if (tempList1.val <= tempList2.val) {
                    if (finalList.val == Integer.MAX_VALUE) {
                        finalList.val = tempList1.val;
                    } else {
                        finalList.next = addNodeToLast(finalList.next, tempList1.val);
                    }
                    tempList1 = tempList1.next;
                } else {
                    if (finalList.val == Integer.MAX_VALUE) {
                        finalList.val = tempList2.val;
                    } else {
                        finalList.next = addNodeToLast(finalList.next, tempList2.val);
                    }
                    tempList2 = tempList2.next;
                }
            } else {
                if (finalList.val == Integer.MAX_VALUE) {
                    finalList.val = tempList1.val;
                } else {
                    finalList.next = addNodeToLast(finalList.next, tempList1.val);
                }
                tempList1 = tempList1.next;
            }
        }

        while (tempList2 != null) {
            if (finalList.val == Integer.MAX_VALUE) {
                finalList.val = tempList2.val;
            } else {
                finalList.next = addNodeToLast(finalList.next, tempList2.val);
            }
            tempList2 = tempList2.next;
        }

        printListValuse(finalList);
        return finalList;
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
