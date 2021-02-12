package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution746 Tester. 
* @author cartoon.yu
* @date 02/12/2021
* @version 1.0 
*/ 
public class Solution746Test {
    
    private static final Logger log = LoggerFactory.getLogger(Solution746Test.class);

    private Solution746 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution746();
        source1 = new int[]{10, 15, 20};
        source2 = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        expect1 = 15;
        expect2 = 6;
    }

        /** 
     * 
     * Method: minCostClimbingStairs(int[] cost) 
     * 
     */ 
    @Test
    public void testMinCostClimbingStairs(){ 
        int res1 = solution.minCostClimbingStairs(source1);
        int res2 = solution.minCostClimbingStairs(source2);
        log.info("solution 746 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    }
        
}
