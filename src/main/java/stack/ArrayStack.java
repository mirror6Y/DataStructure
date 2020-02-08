package stack;

import lombok.NoArgsConstructor;

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

    //入栈
    public boolean push(String item) {
        //考虑栈是否已满
        // 如果n==count相等，栈满
        if (n == count) {
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
        //如果count==0，栈空
        if (count == 0) {
            return null;
        }
        //栈内有元素
        String item = items[count - 1];
        count--;
        return item;
    }

    //遍历栈
    public String traversal() {
        //考虑栈是否为空
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result.concat(items[count-i-1]);
        }
        return result;
    }
}
