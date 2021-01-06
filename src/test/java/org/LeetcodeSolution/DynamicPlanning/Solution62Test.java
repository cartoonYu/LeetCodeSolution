package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution62 Tester. 
* 
* @author cartoon 
* @since  01/06/2021
* @version 1.0 
*/ 
public class Solution62Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution62.class);
    
    private Solution62 solution;

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
        solution = new Solution62();
        source1Param1 = 3;
        source1Param2 = 7;
        source2Param1 = 3;
        source2Param2 = 2;
        source3Param1 = 7;
        source3Param2 = 3;
        source4Param1 = 3;
        source4Param2 = 3;
        expect1 = 28;
        expect2 = 3;
        expect3 = 28;
        expect4 = 6;
    } 
    
    /** 
    * 
    * Method: uniquePaths(int m, int n) 
    * 
    */ 
    @Test
    public void testUniquePaths(){ 
        int res1 = solution.uniquePaths(source1Param1, source1Param2);
        int res2 = solution.uniquePaths(source2Param1, source2Param2);
        int res3 = solution.uniquePaths(source3Param1, source3Param2);
        int res4 = solution.uniquePaths(source4Param1, source4Param2);
        log.info("solution 62 test, calculate data1: {}, expect result1: {}, " +
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
