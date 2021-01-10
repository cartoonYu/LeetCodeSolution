package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution121 Tester. 
* 
* @author cartoon 
* @since  01/10/2021
* @version 1.0 
*/ 
public class Solution121Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution121Test.class);
    
    private Solution121 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution121();
        source1 = new int[]{7, 1, 5, 3, 6, 4};
        source2 = new int[]{7, 6, 4, 3, 1};
        expect1 = 5;
        expect2 = 0;
    } 
    
    /** 
    * 
    * Method: maxProfit(int[] prices) 
    * 
    */ 
    @Test
    public void testMaxProfit(){
        int res1 = solution.maxProfit(source1);
        int res2 = solution.maxProfit(source2);
        log.info("solution 121 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
