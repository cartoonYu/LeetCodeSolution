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
public class Solution33Test{

    private static final Logger log = LoggerFactory.getLogger(Solution33Test.class);

    private Solution33 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private int[] source3Param1;

    private int source3Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){
        solution = new Solution33();
        source1Param1 = new int[]{4, 5, 6, 7, 0, 1, 2};
        source1Param2 = 0;
        source2Param1 = new int[]{4, 5, 6, 7, 0, 1, 2};
        source2Param2 = 3;
        source3Param1 = new int[]{1};
        source3Param2 = 0;
        expect1 = 4;
        expect2 = -1;
        expect3= -1;
    }

    @Test
    public void testSearch() {
        int res1 = solution.search(source1Param1, source1Param2);
        int res2 = solution.search(source2Param1, source2Param2);
        int res3 = solution.search(source3Param1, source3Param2);
        log.info("solution 33 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
}