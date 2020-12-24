package org.LeetcodeSolution.Chart;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/24
 */
public class Solution1615Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1615Test.class);

    private Solution1615 solution;

    private int source1Param1;

    private int[][] source1Param2;

    private int source2Param1;

    private int[][] source2Param2;

    private int source3Param1;

    private int[][] source3Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution1615();
        source1Param1 = 4;
        source1Param2 = new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}};
        source2Param1 = 5;
        source2Param2 = new int[][]{{0, 1}, {0, 3}, {1, 2}, {1, 3}, {2, 3}, {2, 4}};
        source3Param1 = 8;
        source3Param2 = new int[][]{{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        expect1 = 4;
        expect2 = 5;
        expect3 = 5;
    }

    @Test
    public void testMaximalNetworkRank(){
        int res1 = solution.maximalNetworkRank(source1Param1, source1Param2);
        int res2 = solution.maximalNetworkRank(source2Param1, source2Param2);
        int res3 = solution.maximalNetworkRank(source3Param1, source3Param2);
        log.info("solution 1615 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}
