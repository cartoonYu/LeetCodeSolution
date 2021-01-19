package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution303 Tester. 
* 
* @author cartoon 
* @since  01/20/2021
* @version 1.0 
*/ 
public class Solution303Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution303Test.class);
    
    private Solution303 solution;

    private int source1Param1;

    private int source1Param2;

    private int source2Param1;

    private int source2Param2;

    private int source3Param1;

    private int source3Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
        source1Param1 = 0;
        source1Param2 = 2;
        source2Param1 = 2;
        source2Param2 = 5;
        source3Param1 = 0;
        source3Param2 = 5;
        expect1 = 1;
        expect2 = -1;
        expect3 = -3;
    } 
    
    /** 
    * 
    * Method: sumRange(int i, int j) 
    * 
    */ 
    @Test
    public void testSumRange(){
        int res1 = solution.sumRange(source1Param1, source1Param2);
        int res2 = solution.sumRange(source2Param1, source2Param2);
        int res3 = solution.sumRange(source3Param1, source3Param2);
        log.info("solution 303 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    }
} 
