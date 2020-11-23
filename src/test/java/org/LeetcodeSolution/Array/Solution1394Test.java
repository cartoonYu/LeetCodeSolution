package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1394Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1394Test.class);

    private Solution1394 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int[] source4;

    private int[] source5;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    private int expect5;

    @Before
    public void before(){
        solution = new Solution1394();
        source1 = new int[]{2, 2, 3, 4};
        source2 = new int[]{1, 2, 2, 3, 3, 3};
        source3 = new int[]{2, 2, 2, 3, 3};
        source4 = new int[]{5};
        source5 = new int[]{7, 7, 7, 7, 7, 7, 7};
        expect1 = 2;
        expect2 = 3;
        expect3 = -1;
        expect4 = -1;
        expect5 = 7;
    }

    @Test
    public void testFindLucky() {
        int res1 = solution.findLucky(source1);
        int res2 = solution.findLucky(source2);
        int res3 = solution.findLucky(source3);
        int res4 = solution.findLucky(source4);
        int res5 = solution.findLucky(source5);
        log.info("solution 1394 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
    }
}