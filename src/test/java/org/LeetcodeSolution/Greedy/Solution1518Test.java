package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1518 Tester. 
* @author cartoon
* @date 03/02/2021
* @version 1.0 
*/ 
public class Solution1518Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1518Test.class);

    private Solution1518 solution;

    private int source1Param1;

    private int source1Param2;

    private int source2Param1;

    private int source2Param2;

    private int source3Param1;

    private int source3Param2;

    private int source4Param1;

    private int source4Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    @Before
    public void before(){ 
        solution = new Solution1518();
        source1Param1 = 9;
        source1Param2 = 3;
        source2Param1 = 15;
        source2Param2 = 4;
        source3Param1 = 5;
        source3Param2 = 5;
        source4Param1 = 2;
        source4Param2 = 3;
        expect1 = 13;
        expect2 = 19;
        expect3 = 6;
        expect4 = 2;
    }

    /**
     * 
     * Method: numWaterBottles(int numBottles, int numExchange) 
     * 
     */ 
    @Test
    public void testNumWaterBottles(){ 
        int res1 = solution.numWaterBottles(source1Param1, source1Param2);
        int res2 = solution.numWaterBottles(source2Param1, source2Param2);
        int res3 = solution.numWaterBottles(source3Param1, source2Param2);
        int res4 = solution.numWaterBottles(source4Param1, source2Param2);
        log.info("solution 1518 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    } 
    
        
}
