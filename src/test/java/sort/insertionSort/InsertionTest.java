package sort.insertionSort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mirror6
 * @description
 * @createTime 2020/7/16 14:25
 */
public class InsertionTest {

    private Insertion insertion;

    @Before
    public void setUp() throws Exception {
        insertion = new Insertion();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertion() {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        insertion.insertion(a);
    }
}