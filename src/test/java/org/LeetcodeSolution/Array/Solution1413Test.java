package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1413Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1413Test.class);

    private Solution1413 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution1413();
        source1 = new int[]{-3, 2, -3, 4, 2};
        source2 = new int[]{1, 2};
        source3 = new int[]{1, -2, -3};
        expect1 = 5;
        expect2 = 1;
        expect3 = 5;
    }

    @Test
    public void minStartValue() {
        int res1 = solution.minStartValue(source1);
        int res2 = solution.minStartValue(source2);
        int res3 = solution.minStartValue(source3);
        log.info("solution 1413 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}