package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution496Test {

    private static final Logger log = LoggerFactory.getLogger(Solution496Test.class);

    private Solution496 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){
        solution = new Solution496();
        source1Param1 = new int[]{4, 1, 2};
        source1Param2 = new int[]{1, 3, 4, 2};
        expect1 = new int[]{-1, 3, -1};
        source2Param1 = new int[]{2, 4};
        source2Param2 = new int[]{1, 2, 3, 4};
        expect2 = new int[]{3, -1};
    }

    @Test
    public void nextGreaterElement() {
        int[] res1 = solution.nextGreaterElement(source1Param1, source1Param2);
        int[] res2 = solution.nextGreaterElement(source2Param1, source2Param2);
        log.info("solution 485 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }
}