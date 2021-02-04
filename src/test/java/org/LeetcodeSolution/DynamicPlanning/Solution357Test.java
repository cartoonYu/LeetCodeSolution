package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution357 Tester. 
* 
* @author cartoon 
* @since  02/04/2021
* @version 1.0 
*/ 
public class Solution357Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution357Test.class);
    
    private Solution357 solution;

    private int source;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution357();
        source = 2;
        expect = 91;
    } 
    
    /** 
    * 
    * Method: countNumbersWithUniqueDigits(int n) 
    * 
    */ 
    @Test
    public void testCountNumbersWithUniqueDigits(){
        int res = solution.countNumbersWithUniqueDigits(source);
        log.info("solution 357 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

}
