package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution279 Tester. 
* 
* @author cartoon 
* @since  01/15/2021
* @version 1.0 
*/ 
public class Solution279Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution279Test.class);
    
    private Solution279 solution;

    private int source1;

    private int source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution279();
        source1 = 12;
        source2 = 13;
        expect1 = 3;
        expect2 = 2;
    } 
    
    /** 
    * 
    * Method: numSquares(int n) 
    * 
    */ 
    @Test
    public void testNumSquares(){ 
        int res1 = solution.numSquares(source1);
        int res2 = solution.numSquares(source2);
        log.info("solution 279 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
