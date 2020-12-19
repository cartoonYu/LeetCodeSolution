package org.LeetcodeSolution.BinarySearch;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/20
 */
public class Solution74Test{

    private static final Logger log = LoggerFactory.getLogger(Solution74Test.class);

    private Solution74 solution;

    private int[][] source1Param1;

    private int source1Param2;

    private int[][] source2Param1;

    private int source2Param2;

    private int[][] source3Param1;

    private int source3Param2;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    @Before
    public void before(){
        solution = new Solution74();
        source1Param1 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        source1Param2 = 3;
        source2Param1 = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        source2Param2 = 13;
        source3Param1 = new int[0][0];
        source3Param2 = 0;
        expect1 = true;
        expect2 = false;
        expect3 = false;
    }

    @Test
    public void testSearchMatrix() {
        boolean res1 = solution.searchMatrix(source1Param1, source1Param2);
        boolean res2 = solution.searchMatrix(source2Param1, source2Param2);
        boolean res3 = solution.searchMatrix(source3Param1, source3Param2);
        log.info("solution 74 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}