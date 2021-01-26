package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution309 Tester. 
* 
* @author cartoon 
* @since  01/26/2021
* @version 1.0 
*/ 
public class Solution309Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution309Test.class);
    
    private Solution309 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution309();
        source = new int[]{1, 2, 3, 0, 2};
        expect = 3;
    } 
    
    /** 
    * 
    * Method: maxProfit(int[] prices) 
    * 
    */ 
    @Test
    public void testMaxProfit(){ 
        int res = solution.maxProfit(source);
        log.info("solution 309 test, calculate data: {}, expect result: {}, ",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

}
