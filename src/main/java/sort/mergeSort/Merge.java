package sort.mergeSort;

/**
 * Merge
 *
 * @author mirror6
 * @date 2020/3/1
 * @description 归并排序
 * <p>
 * //归并排序算法，A 是数组，n 表示数组大小
 * merge_sort(A, n) {
 * merge_sort_c(A, 0, n - 1)
 * }
 * <p>
 * merge_sort_c(A, p, r) {
 * //递归终止条件
 * if p >= r then return
 * <p>
 * //取 p 到 r 之间位置 q
 * q = (p + r) / 2
 * //分治递归
 * merge_sort_c(A, p, q)
 * merge_sort_c(A, q + 1, r)
 * //将 A[p...q]和 A[q+1...r]合并为 A[p...r]
 * merge(A[p...r],A[p...q],A[q + 1...r])
 * }
 */
public class Merge {

    private int p;
    private int r;
    private int[] array;

    public Merge(int p, int r, int[] array) {
        this.p = p;
        this.r = r;
        this.array = array;
    }

    public int[] mergeSort(int[] array) {
        return mergeSortC(array, p, r);
    }

    public int[] mergeSortC(int[] array, int p, int r) {
        //递归终止条件
        if (p >= r) {
            return array;
        }
        //分治
        //中间位置
        int q = (p + r) / 2;
        mergeSortC(array, p, q);
        mergeSortC(array, q + 1, r);
        //合并
        return merge(array, mergeSortC(array, p, q), mergeSortC(array, q + 1, r));
    }

    private int[] merge(int[] result, int[] left, int[] right) {
        int i = p;
        int q = (p + r) / 2;
        int j = q + 1;
        int k = 0;
        //临时数组
        int[] tmp = new int[r - p];
        while (i <= q && j <= r) {
            if (left[i] < right[j]) {
                tmp[k++] = left[i];
            } else {
                tmp[k++] = right[j];
            }
        }

        //判断哪个子数组还有剩余元素
        int start = i;
        int end = q;
        if (j <= r) {
            start = j;
            end = r;
        }
        //将剩余数据拷贝到临时数组
        while (start <= end) {
//            tmp[k++] = left[start++];//这里怎么处理
        }
        //将tmp中的数组拷贝到result
        for (int l = 0; l < r - p; l++) {
            result[p + l] = tmp[l];
        }
        return result;
    }

}
