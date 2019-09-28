package queue;

import lombok.Getter;
import lombok.Setter;

/**
 * @author mirror6
 * @date 2019/9/26 19:22
 */
@Setter
@Getter
class Queue {

    /**
     * maxSize 队列的容量
     */
    private int maxSize;
    /**
     * front 队头
     */
    private int front;
    /**
     * tail 队尾
     */
    private int tail;
    /**
     * array 存放元素
     */
    private int[] array;

    Queue(int maxSize) {
        this.maxSize = maxSize;
        //指向队列头(不包含元素) 即队列头的前一位
        this.front = -1;
        //指向队列尾(包含元素) 即队列尾
        this.tail = -1;
        array = new int[maxSize];
    }

    /**
     * 先判断队列是否已满
     */
    private boolean isFull() {
        return tail == maxSize - 1;
    }

    /**
     * 先判断队列是否为空
     */
    private boolean isEmpty() {
        return tail == front;
    }

    /**
     * 入队操作
     */
    void enterElement(int number) {
        //先判断队列是否已满
        if (isFull())
        {
            System.out.println("~队列已满");
            //不写return呢
        }
        tail++;
        array[tail] = number;
    }

    /**
     * 出队操作
     *
     * @return int 队列元素
     */
    int outElement() {
        //先判断队列是否为空
        if (isEmpty())
        {
            //不写抛出异常呢
            System.out.println("~队列为空");
        }
        front++;
        return array[front];
    }

    /**
     * 遍历队列
     */
    void travel() {
        if (isEmpty())
        {
            System.out.println("~队列为空");
        }
        for (int value : array)
        {
            System.out.println(value);
        }
    }

    /**
     * 查看队头
     */
    int headQueue() {
        if (isEmpty())
        {
            front = -1;
        }
        return array[front + 1];
    }

}
