package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution724 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution724Test {

    private static final Logger log = LoggerFactory.getLogger(Solution724Test.class);

    private Solution724 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution724();
        source1 = new int[]{1, 7, 3, 6, 5, 6};
        source2 = new int[]{1, 2, 3};
        expect1 = 3;
        expect2 = -1;
    }

    @Test
    public void testPivotIndex() {
        int res1 = solution.pivotIndex(source1);
        int res2 = solution.pivotIndex(source2);
        log.info("solution 724 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }

}