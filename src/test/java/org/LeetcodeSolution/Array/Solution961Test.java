package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Solution961 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution961Test {

    private static final Logger log = LoggerFactory.getLogger(Solution961Test.class);

    private Solution961 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution961();
        source1= new int[]{1, 2, 3, 3};
        source2 = new int[]{2, 1, 2, 5, 3, 2};
        source3 = new int[]{5, 1, 5, 2, 5, 3, 5, 4};
        expect1 = 3;
        expect2 = 2;
        expect3 = 5;
    }

    @Test
    public void testRepeatedNTimes() {
        int res1 = solution.repeatedNTimes(source1);
        int res2 = solution.repeatedNTimes(source2);
        int res3 = solution.repeatedNTimes(source3);
        log.info("solution 961 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}, " +
                "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}