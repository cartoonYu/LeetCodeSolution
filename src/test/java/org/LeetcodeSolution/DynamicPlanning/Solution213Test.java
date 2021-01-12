package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution213 Tester. 
* 
* @author cartoon 
* @since  01/13/2021
* @version 1.0 
*/ 
public class Solution213Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution213Test.class);
    
    private Solution213 solution;

    private int[] source1;

    private int[] source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution213();
        source1 = new int[]{2, 3, 2};
        source2 = new int[]{1, 2, 3, 1};
        expect1 = 3;
        expect2 = 4;
    }
    
    /** 
    * 
    * Method: rob(int[] nums) 
    * 
    */ 
    @Test
    public void testRob(){
        int res1 = solution.rob(source1);
        int res2 = solution.rob(source2);
        log.info("solution 213 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
