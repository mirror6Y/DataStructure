package binarysearch;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mirror6
 * @description 查找符合目标值的下标集合
 * @createTime 2020/6/22 17:00
 */
public class DeformationBinarySearch {

    public List<Integer> baseSearch(int[] a, int value) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                List<Integer> list = new ArrayList<>();
                //向mid 索引值的左边检索
                int tmp = mid - 1;
                while (tmp >= 0 && a[tmp] == value) {
                    list.add(tmp);
                    tmp -= 1;
                }
                list.add(mid);
                tmp = mid + 1;
                while (tmp <= a.length - 1 && a[tmp] == value) {
                    list.add(tmp);
                    tmp += 1;
                }
                return list;
            }
        }

        return new ArrayList<>();
    }
}
