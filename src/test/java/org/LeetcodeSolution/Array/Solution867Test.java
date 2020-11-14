package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

/**
 * Solution867 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution867Test {

    private static final Logger log = LoggerFactory.getLogger(Solution867Test.class);

    private Solution867 solution;

    private int[][] source1;

    private int[][] source2;

    private int[][] expect1;

    private int[][] expect2;

    @Before
    public void before(){
        solution = new Solution867();
        source1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        source2 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        expect1 = new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        expect2 = new int[][]{{1, 4}, {2, 5}, {3, 6}};
    }

    @Test
    public void testTranspose() {
        int[][] res1 = solution.transpose(source1);
        int[][] res2 = solution.transpose(source2);
        log.info("solution 867 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }
}