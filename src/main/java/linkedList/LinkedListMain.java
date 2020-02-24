package linkedList;

/**
 * LinkedListMain
 *
 * @author mirror6
 * @date 2020/2/19
 * @description
 */
public class LinkedListMain {

    public static void main(String[] args) throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.traversal());
        System.out.println(linkedList.remove());
        System.out.println(linkedList.traversal());
    }

}
