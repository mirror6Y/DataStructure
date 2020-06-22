package binarysearch;

/**
 * @author 17666
 */
public class BaseBinarySearch {

    /**
     * 非递归 二分查找 （还有优化空间）
     *
     * @param a     数组
     * @param value 目标值
     * @return 元素所在位置
     */
    public int baseSearch(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            //可能会溢出
//            int mid = (low + high) / 2;
            int mid = low + (high - low) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    /**
     * 递归 二分查找
     *
     * @param a      数组
     * @param target 目标值
     * @return 元素所在位置
     */
    public int bSearch(int[] a, int target) {
        return bSearchInternally(a, 0, a.length - 1, target);
    }

    /**
     * @param a     数组
     * @param low   最小索引
     * @param high  最大索引
     * @param value 目标值
     * @return 元素所在位置
     */
    private int bSearchInternally(int[] a, int low, int high, int value) {
        if (low > high) {
            return -1;
        }
        //和low+(high-low)/2一样，效率更高
        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return bSearchInternally(a, low, mid - 1, value);
        } else {
            return bSearchInternally(a, mid + 1, high, value);
        }
    }


}
