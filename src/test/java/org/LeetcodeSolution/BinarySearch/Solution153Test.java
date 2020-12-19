package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/20
 */
public class Solution153Test{

    private static final Logger log = LoggerFactory.getLogger(Solution153Test.class);

    private Solution153 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution153();
        source1 = new int[]{3, 4, 5, 1, 2};
        source2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        source3 = new int[]{1};
        expect1 = 1;
        expect2 = 0;
        expect3 = 1;
    }

    @Test
    public void testFindMin() {
        int res1 = solution.findMin(source1);
        int res2 = solution.findMin(source2);
        int res3 = solution.findMin(source3);
        log.info("solution 153 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}