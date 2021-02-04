package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution509 Tester. 
* 
* @author cartoon 
* @since  02/04/2021
* @version 1.0 
*/ 
public class Solution509Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution509Test.class);
    
    private Solution509 solution;

    private int source1;

    private int source2;

    private int source3;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution509();
        source1 = 2;
        source2 = 3;
        source3 = 4;
        expect1 = 1;
        expect2 = 2;
        expect3 = 3;
    } 
    
    /** 
    * 
    * Method: fib(int N) 
    * 
    */ 
    @Test
    public void testFib(){ 
        int res1 = solution.fib(source1);
        int res2 = solution.fib(source2);
        int res3 = solution.fib(source3);
        log.info("solution 509 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 

}
