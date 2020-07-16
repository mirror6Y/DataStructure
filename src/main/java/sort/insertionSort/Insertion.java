package sort.insertionSort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/16 13:50
 */
public class Insertion {

    public void insertion(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int value = a[i];

            int j = i - 1;
            while (j >= 0) {
                if (a[j] > value) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = value;
        }

    }
}
