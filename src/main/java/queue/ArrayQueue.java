package queue;

import lombok.NoArgsConstructor;

/**
 * ArrayQueue
 *
 * @author mirror6
 * @date 2020/2/15
 * @description 基于数组实现的单向队列
 */
@NoArgsConstructor
public class ArrayQueue {

    //定义一个顺序队列
    private String[] items;
    //队列的大小
    private int n;
    //头指针
    private int head;
    //尾指针
    private int tail;

    //初始化队列
    public ArrayQueue(int n) {
        this.items = new String[n];
        this.n = n;
        this.head = -1;
        this.tail = -1;
    }

    //队列中元素的个数
    public int size() {
        return tail - head;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return head == tail;
    }

    //判断队列是否已满
    public boolean isFull() {
        return tail - head == n;
    }

    //入队
    public boolean enQueue(String item) {
        //判断队列是否已满
        if (isFull()) {
            return false;
        }
        items[tail + 1] = item;
        tail++;
        return true;
    }

    //出队
    public String deQueue() throws Exception {
        //判断队列是否已空
        if (isEmpty()) {
            throw new Exception("队列已空");
        }
        String item = items[head + 1];
        head++;
        return item;
    }

    //遍历
    public String traversal() {
        StringBuilder result = new StringBuilder();
        if (size() > 0) {
            for (int i = head + 1; i <= tail; i++) {
                result.append(items[i]);
            }
        }
        return result.toString();
    }

    //清空队列
    public void clear() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈已空");
        }
        for (int i = size(); i > 0; i--) {
            items[size() - i] = null;
        }
        head = -1;
        tail = -1;
    }
}
