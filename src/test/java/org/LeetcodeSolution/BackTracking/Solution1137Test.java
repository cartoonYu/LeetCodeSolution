package org.LeetcodeSolution.BackTracking; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1137 Tester. 
* 
* @author cartoon 
* @since  01/11/2021
* @version 1.0 
*/ 
public class Solution1137Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution1137Test.class);
    
    private Solution1137 solution;

    private int source1;

    private int source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution1137();
        source1 = 4;
        source2 = 25;
        expect1 = 4;
        expect2 = 1389537;
    } 
    
    /** 
    * 
    * Method: tribonacci(int n) 
    * 
    */ 
    @Test
    public void testTribonacci(){ 
        int res1 = solution.tribonacci(source1);
        int res2 = solution.tribonacci(source2);
        log.info("solution 216 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
