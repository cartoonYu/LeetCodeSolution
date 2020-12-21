package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/21
 */
public class Solution1672Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1672Test.class);

    private Solution1672 solution;

    private int[][] source1;

    private int[][] source2;

    private int[][] source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution1672();
        source1 = new int[][]{{1, 2, 3}, {3, 2, 1}};
        source2 = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        source3 = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        expect1 = 6;
        expect2 = 10;
        expect3 = 17;
    }

    @Test
    public void testMaximumWealth(){
        int res1 = solution.maximumWealth(source1);
        int res2 = solution.maximumWealth(source2);
        int res3 = solution.maximumWealth(source3);
        log.info("solution 1672 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}
