package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution832 Tester.
 * @author cartoon
 * @date 11/15/2020
 * @version 1.0
 */
public class Solution832Test {

    private static final Logger log = LoggerFactory.getLogger(Solution832Test.class);

    private Solution832 solution;

    private int[][] source1;

    private int[][] source2;

    private int[][] expect1;

    private int[][] expect2;

    @Before
    public void before(){
        solution = new Solution832();
        source1 = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        source2 = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        expect1 = new int[][]{{1, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        expect2 = new int[][]{{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
    }

    @Test
    public void testFlipAndInvertImage() {
        int[][] res1 = solution.flipAndInvertImage(source1);
        int[][] res2 = solution.flipAndInvertImage(source2);
        log.info("solution 832 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }
}