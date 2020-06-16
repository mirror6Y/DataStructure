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
        System.out.println(linkedList.traversal());
        linkedList.reverse();

    }

}
