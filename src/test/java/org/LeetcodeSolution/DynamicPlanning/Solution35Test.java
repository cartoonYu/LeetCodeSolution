package org.LeetcodeSolution.DynamicPlanning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author cartoon
 * @date 2020/12/29
 */
public class Solution35Test {

    private static final Logger log = LoggerFactory.getLogger(Solution35Test.class);

    private Solution35 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private int[] source3Param1;

    private int source3Param2;

    private int[] source4Param1;

    private int source4Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    @Before
    public void before(){
        solution = new Solution35();
        source1Param1 = new int[]{1, 3, 5, 6};
        source1Param2 = 5;
        source2Param1 = new int[]{1, 3, 5, 6};
        source2Param2 = 2;
        source3Param1 = new int[]{1, 3, 5, 6};
        source3Param2 = 7;
        source4Param1 = new int[]{1, 3, 5, 6};
        source4Param2 = 0;
        expect1 = 2;
        expect2 = 1;
        expect3 = 4;
        expect4 = 0;
    }

    @Test
    public void testSearchInsert(){
       int res1 = solution.searchInsert(source1Param1, source1Param2);
       int res2 = solution.searchInsert(source2Param1, source2Param2);
       int res3 = solution.searchInsert(source3Param1, source3Param2);
       int res4 = solution.searchInsert(source4Param1, source4Param2);
        log.info("solution 35 test, test search insert, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }

    @Test
    public void searchInsertByTraverse(){
        int res1 = solution.searchInsertByTraverse(source1Param1, source1Param2);
        int res2 = solution.searchInsertByTraverse(source2Param1, source2Param2);
        int res3 = solution.searchInsertByTraverse(source3Param1, source3Param2);
        int res4 = solution.searchInsertByTraverse(source4Param1, source4Param2);
        log.info("solution 35 test, test search insert by traverse, calculate data1: {}, expect result1: {}, " +
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
