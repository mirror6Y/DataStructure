package queue;

import java.util.Scanner;

/**
 * @author mirror6
 * @date 2019/9/27 19:39
 */
public class ArrayQueue {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        //输出 菜单
        while (loop)
        {
            System.out.println("s:遍历队列");
            System.out.println("a:入队");
            System.out.println("g:出队");
            System.out.println("h:队头");
            System.out.println("e:退出");
            key = scanner.next().charAt(0);
            switch (key)
            {
                case 's':
                    queue.travel();
                    break;
                case 'a':
                    queue.enterElement(scanner.nextInt());
                    break;
                case 'g':
                    System.out.println(queue.outElement());
                    break;
                case 'h':
                    System.out.println(queue.headQueue());
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}
