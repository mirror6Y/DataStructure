package stack;

import lombok.NoArgsConstructor;

/**
 * ArrayStack
 *
 * @author mirror6
 * @date 2020/2/8
 * @description 基于数组实现的顺序栈
 */
@NoArgsConstructor
public class ArrayStack {

    //定义一个顺序栈
    private String[] items;
    //栈的大小
    private int n;
    //栈中元素的个数
    private int count;

    //初始化栈
    public ArrayStack(int n) {
        this.items = new String[n];
        this.n = n;
        this.count = 0;
    }

    //栈中元素的个数
    public int size() {
        return count;
    }

    //判断栈是否为空
    public boolean isEmpty() {
        //如果count==0，栈空
        return count == 0;
    }

    //判断栈是否已满
    public boolean isFull() {
        // 如果n==count相等，栈满
        return count == n;
    }

    //入栈
    public boolean push(String item) {
        //考虑栈是否已满
        if (isFull()) {
            return false;
        }
        //空间充足，入栈
        items[count] = item;
        count++;
        return true;
    }

    //出栈
    public String pop() {
        //考虑栈是否已空
        if (isEmpty()) {
            return null;
        }
        //栈内有元素
        String item = items[count - 1];
        count--;
        return item;
    }

    //返回栈顶元素
    public String peek() throws Exception {
        //判断栈是否为空,否则数组越界
        if (isEmpty()) {
            throw new Exception("栈已空");
        }
        return items[count - 1];
    }

    //从栈顶到栈底遍历栈
    public String traversal() {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result.concat(items[count - i - 1]);
        }
        return result;
    }

    //清空栈
    public void clear() throws Exception {
        if (isEmpty()) {
            throw new Exception("栈已空");
        }
        for (int i = 0; i < count; i++) {
            items[count] = null;
        }
        count = 0;
    }

    //销毁栈
    public void destroy() {
    }
}
