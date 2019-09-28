package array;

/**
 * @author mirror6
 * @date 2019/9/25 13:36
 */
public class SparseArray {

    public static void main(String[] args) {

        //定义一个二维数组
        //0代表没有棋子  1为黑色棋子 2为白色棋子
        int[][] array = new int[11][11];
        array[1][1] = 1;
        array[2][2] = 2;
        //输出数组
        System.out.println("原始数组：");
        new SparseArray().print(array);

        //转为稀疏数组
        //1.先便利数组，获得非零元素的个数 count用于计数
        int count = 0;
        for (int[] row : array)
        {
            for (int data : row)
            {
                if (data != 0)
                {
                    count++;
                }
            }
        }
        //初始化稀疏数组
        int[][] spare = new int[count + 1][3];
        //填充非零元素
        for (int[] row : array)
        {
            for (int data : row)
            {
                if (data != 0)
                {
//                    spare[][]=;
                }
            }
        }
        //输出数组
        System.out.println("稀疏数组：");
        new SparseArray().print(spare);
    }

    //输出数组
    private void print(int[][] array) {
        for (int[] row : array)
        {
            for (int data : row)
            {
                System.out.printf("%d\t", data);
            }
            System.out.println("\n");
        }
    }
}
