package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution881 Tester. 
* @author cartoon
* @date 03/02/2021
* @version 1.0 
*/ 
public class Solution881Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution881Test.class);

    private Solution881 solution;

    private int[] source1Param1;

    private int[] source2Param1;

    private int[] source3Param1;

    private int source1Param2;

    private int source2Param2;

    private int source3Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    @Before
    public void before(){ 
        solution = new Solution881();
        source1Param1 = new int[]{1, 2};
        source2Param1 = new int[]{3, 2, 2, 1};
        source3Param1 = new int[]{3, 5, 3, 4};
        source1Param2 = 3;
        source2Param2 = 3;
        source3Param2 = 5;
        expect1 = 1;
        expect2 = 3;
        expect3 = 4;
    }

    /**
     * 
     * Method: numRescueBoats(int[] people, int limit) 
     * 
     */ 
    @Test
    public void testNumRescueBoats(){ 
        int res1 = solution.numRescueBoats(source1Param1, source1Param2);
        int res2 = solution.numRescueBoats(source2Param1, source2Param2);
        int res3 = solution.numRescueBoats(source3Param1, source3Param2);
        log.info("solution 881 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
