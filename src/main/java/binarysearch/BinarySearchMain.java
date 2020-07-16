package binarysearch;

/**
 * @author 17666
 */
public class BinarySearchMain {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 4, 6, 7};
        DeformationBinarySearch search = new DeformationBinarySearch();
        search.baseSearch(a, 4);
    }

}
