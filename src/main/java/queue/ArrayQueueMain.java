package queue;

/**
 * ArrayQueueMain
 *
 * @author mirror6
 * @date 2020/2/15
 * @description
 */
public class ArrayQueueMain {

    public static void main(String[] args) throws Exception {

        ArrayQueue queue = new ArrayQueue(4);
        System.out.println("队列是否为空：" + queue.isEmpty());
        queue.enQueue("A");
        queue.enQueue("B");
        queue.enQueue("C");
        queue.enQueue("D");
        System.out.println("队列是否为空：" + queue.isEmpty());
        System.out.println("队列是否已满：" + queue.isFull());
        queue.enQueue("E");
        System.out.println("第一个出队的元素：" + queue.deQueue());
        System.out.println("遍历：" + queue.traversal());
        queue.clear();
        System.out.println("遍历：" + queue.traversal());
    }
}
