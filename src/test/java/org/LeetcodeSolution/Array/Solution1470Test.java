package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1470Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1470Test.class);

    private Solution1470 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private int[] source3Param1;

    private int source3Param2;

    private int[] expect1;

    private int[] expect2;

    private int[] expect3;

    @Before
    public void before(){
        solution = new Solution1470();
        source1Param1 = new int[]{2, 5, 1, 3, 4, 7};
        source1Param2 = 3;
        source2Param1 = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
        source2Param2 = 4;
        source3Param1 = new int[]{1, 1, 2, 2};
        source3Param2 = 2;
        expect1 = new int[]{2, 3, 5, 4, 1, 7};
        expect2 = new int[]{1, 4, 2, 3, 3, 2, 4, 1};
        expect3 = new int[]{1, 2, 1, 2};
    }

    @Test
    public void shuffle() {
        int[] res1 = solution.shuffle(source1Param1, source1Param2);
        int[] res2 = solution.shuffle(source2Param1, source2Param2);
        int[] res3 = solution.shuffle(source3Param1, source3Param2);
        log.info("solution 1470 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
        Assert.assertArrayEquals(expect3, res3);
    }
}