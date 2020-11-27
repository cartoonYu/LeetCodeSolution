package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class Solution1351Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1351Test.class);

    private Solution1351 solution;

    private int[][] source1;

    private int[][] source2;

    private int[][] source3;

    private int[][] source4;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    @Before
    public void before(){
        solution = new Solution1351();
        source1 = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        source2 = new int[][]{{3, 2}, {1, 0}};
        source3 = new int[][]{{1, -1}, {-1, -1}};
        source4 = new int[][]{{-1}};
        expect1 = 8;
        expect2 = 0;
        expect3 = 3;
        expect4 = 1;
    }

    @Test
    public void testCountNegatives() {
        int res1 = solution.countNegatives(source1);
        int res2 = solution.countNegatives(source2);
        int res3 = solution.countNegatives(source3);
        int res4 = solution.countNegatives(source4);
        log.info("solution 1351 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }
}