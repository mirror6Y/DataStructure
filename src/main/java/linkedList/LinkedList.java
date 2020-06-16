package linkedList;

/**
 * LinkedList
 *
 * @author mirror6
 * @date 2020/2/16
 * @description
 */
public class LinkedList<E> {

    /**
     * 链表中元素个数
     */
    private int size;

    /**
     * 头结点
     */
    private Node<E> head;

    LinkedList() {
        this.size = 0;
        this.head = null;
    }

    /**
     * 结点 类
     *
     * @param <E>
     */
    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }

    /**
     * 返回链表中的元素个数
     *
     * @return int
     */
    int size() {
        return size;
    }

    /**
     * 添加元素
     *
     * @param e 元素
     * @return boolean
     */
    boolean add(E e) {
        linkLast(e);
        return true;
    }

    /**
     * 默认在链表尾部插入元素
     *
     * @param e 元素
     */
    private void linkLast(E e) {
        //添加到链表的尾部
        //判断链表是否为空
        if (head == null) {
            head = new Node<>(e, null);
            size++;
            //没有return会继续走下去，逻辑异常
            return;
        }
        //获取要插入结点的前驱结点,从头结点开始遍历
        Node<E> pre = head;
        while (pre.next != null) {
            pre = pre.next;
        }
        pre.next = new Node<>(e, null);
        size++;
    }

    /**
     * 删除元素
     *
     * @return 被删除的元素
     */
    E remove() {
        return removeFirst();
    }

    /**
     * 默认删除链表头结点
     *
     * @return 被删除的元素
     */
    private E removeFirst() {
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

    /**
     * 查找元素
     *
     * @param index 索引
     * @return 元素
     * @throws Exception 异常
     */
    E get(int index) throws Exception {
        //是否越界
        if (index < 0 || index > size) {
            throw new Exception("下标越界");
        }
        Node<E> back = head;
        for (int i = 0; i < index; i++) {
            back = back.next;
        }
        return back.item;
    }

    //修改元素

    /**
     * 遍历
     *
     * @return String
     * @throws Exception 异常
     */
    String traversal() throws Exception {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(get(i));
        }
        return result.toString();
    }

    /**
     * 链表的反转
     */
    public Node reverse() {
        //链表为空或只有一个元素
        if (head == null || head.next == null) {
            return head;
        }

        Node pre = null;
        Node cur = head;
        Node tmp;
        while (cur != null) {
            tmp = cur.next;
            cur.next = pre;

            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
