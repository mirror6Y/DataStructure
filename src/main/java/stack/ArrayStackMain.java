package stack;

public class ArrayStackMain {

    public static void main(String[] args) throws Exception {

        ArrayStack stack = new ArrayStack(8);
        System.out.println("判断栈是否为空:" + stack.isEmpty());
        stack.push("1");
        stack.push("3");
        stack.push("4");
        stack.push("7");
        System.out.println("栈中元素个数:" + stack.size());
        System.out.println("判断栈是否为空:" + stack.isEmpty());
        System.out.println("判断栈是否已满:" + stack.isFull());
        System.out.println("栈的遍历:" + stack.traversal());
        System.out.println("栈的遍历:" + stack.traversal());
        String first = stack.pop();
        System.out.println("第一次出栈的元素:" + first);
        String peek = stack.peek();
        System.out.println("栈顶元素为:" + peek);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("判断栈是否为空:" + stack.isEmpty());
        System.out.println("栈的遍历:" + stack.traversal());
    }
}
