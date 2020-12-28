package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solution283 Tester.
 * @author cartoon
 * @date 10/16/2020
 * @version 1.0
 */
public class Solution347Test {

    private static final Logger log = LoggerFactory.getLogger(Solution347Test.class);

    private Solution347 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int[] source2Param1;

    private int source2Param2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){
        solution = new Solution347();
        source1Param1 = new int[]{1, 1, 1, 2, 2, 3};
        source1Param2 = 2;
        source2Param1 = new int[]{1};
        source2Param2 = 1;
        expect1 = new int[]{1, 2};
        expect2 = new int[]{1};
    }


    /**
    *
    * Method: topKFrequent(int[] nums, int k)
    *
    */
    @Test
    public void testTopKFrequent(){
        int[] res1 = solution.topKFrequent(source1Param1, source1Param2);
        int[] res2 = solution.topKFrequent(source2Param1, source2Param2);
        log.info("solution 347 test, calculate data1: {}, expect result1: {}, calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    }


} 
