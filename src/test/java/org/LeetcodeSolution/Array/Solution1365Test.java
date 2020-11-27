package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Solution1365Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1365Test.class);

    private Solution1365 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] expect1;

    private int[] expect2;

    private int[] expect3;

    @Before
    public void before(){
        solution = new Solution1365();
        source1 = new int[]{8, 1, 2, 2, 3};
        source2 = new int[]{6, 5, 4, 8};
        source3 = new int[]{7, 7, 7, 7};
        expect1 = new int[]{4, 0, 1, 1, 3};
        expect2 = new int[]{2, 1, 0, 3};
        expect3 = new int[]{0, 0, 0, 0};
    }

    @Test
    public void testSmallerNumbersThanCurrent() {
        int[] res1 = solution.smallerNumbersThanCurrent(source1);
        int[] res2 = solution.smallerNumbersThanCurrent(source2);
        int[] res3 = solution.smallerNumbersThanCurrent(source3);
        log.info("solution 1365 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
        Assert.assertArrayEquals(expect3, res3);
    }
}