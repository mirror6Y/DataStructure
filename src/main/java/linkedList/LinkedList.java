package linkedList;

/**
 * LinkedList
 *
 * @author mirror6
 * @date 2020/2/16
 * @description
 */
public class LinkedList<E> {

    //链表中元素个数
    private int size;

    //头结点
    private Node<E> head;

    //初始化链表
    public LinkedList() {
        this.size = 0;
        this.head = null;
    }

    //内部结点类
    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    //返回链表中的元素个数
    public int size() {
        return size;
    }

    //添加元素
    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    //默认在链表尾部插入元素
    void linkLast(E e) {
        //添加到链表的尾部
        //判断链表是否为空
        if (head == null) {
            head = new Node<>(e, null);
        }
        //获取要插入结点的前驱结点
        Node<E> pre = head;
        pre.next = new Node<>(e, null);
        size++;
    }

    //删除元素
    public E remove() {
        return removeFirst();
    }

    //默认删除链表头结点
    E removeFirst() {
        //判断链表是否为空
        if (head == null) {
            return null;
        }
        E element = head.item;
        //头结点的下一个结点
        Node<E> back = head.next;
        head.next = null;
        head.item = null;
        head = back;
        size--;
        return element;
    }

    //查找元素
    public E get(int index) throws Exception {
        //是否越界
        if (index < 0 || index > size) {
            throw new Exception("下标越界");
        }
        Node<E> back = head;
        for (int i = 0; i < index; i++) {
            back = back.next;
//            System.out.println(back.item);
        }
        return back.item;
    }

    //修改元素

    //遍历
    public String traversal() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(get(i));
        }
        return result.toString();
    }
}
