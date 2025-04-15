package homework.work2;

public class StartListNode {
    public static void main(String[] args) {

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head1 = new ListNode(1, node2);

        ListNode.print(head1);

        ListNode head6 = ListNode.reverseListNode(head1);

        ListNode.print(head6);

        CustomList head7 = new CustomList();
        head7.add(head6);
        head7.add(head1);
        head7.print();

        String[] arrStr = new String[]{"Java", "Python", "C++"};
        CustomList myList = new CustomList();
        myList.add("Привет");
        myList.add("Мир");
        myList.addArr(arrStr);
        myList.print();


       if (myList.del(1)) {
            System.out.println("Удалили элемент");
        };
        myList.print();

        myList.del("Python");
        myList.print();




        //----------------------------------------



    }
}
