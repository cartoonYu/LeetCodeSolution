package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution338 Tester. 
* 
* @author cartoon 
* @since  01/26/2021
* @version 1.0 
*/ 
public class Solution338Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution338Test.class);
    
    private Solution338 solution;

    private int source1;

    private int source2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){ 
        solution = new Solution338();
        source1 = 2;
        source2 = 5;
        expect1 = new int[]{0, 1, 1};
        expect2 = new int[]{0, 1, 1, 2, 1, 2};
    } 
    
    /** 
    * 
    * Method: countBits(int num) 
    * 
    */ 
    @Test
    public void testCountBits(){
        int[] res1 = solution.countBits(source1);
        int[] res2 = solution.countBits(source2);
        log.info("solution 338 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, ",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    } 

}
