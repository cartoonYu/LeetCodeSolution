package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution714 Tester. 
* @author cartoon
* @date 02/09/2021
* @version 1.0 
*/ 
public class Solution714Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution714Test.class);

    private Solution714 solution;

    private int[] source1Param1;

    private int source1Param2;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution714();
        source1Param1 = new int[]{1, 3, 2, 8, 4, 9};
        source1Param2 = 2;
        expect = 8;
    }

        /** 
     * 
     * Method: maxProfit(int[] prices, int fee) 
     * 
     */ 
    @Test
    public void testMaxProfit(){ 
        int res = solution.maxProfit(source1Param1, source1Param2);
        log.info("solution 714 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 
    
        
}
