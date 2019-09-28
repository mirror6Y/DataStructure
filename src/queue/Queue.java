package queue;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author mirror6
 * @date 2019/9/26 19:22
 */
public class Queue {

    /**
     * maxSize 队列的容量
     */
    private int maxSize;
    /**
     * font 队头
     */
    private int font = -1;
    /**
     * font 队尾
     */
    private int tail = -1;
    /**
     * array 存放元素
     */
    private int[] array;

    public Queue(int maxSize, int font, int tail, int[] array) {
        this.maxSize = maxSize;
        this.font = font;
        this.tail = tail;
        this.array = array;
    }
}
