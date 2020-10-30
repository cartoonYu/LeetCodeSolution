package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution453 Tester. 
* @author cartoon.yu
* @date 10/26/2020
* @version 1.0 
*/ 
public class Solution453Test {

    private static final Logger log = LoggerFactory.getLogger(Solution453Test.class);

    private Solution453 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){
        solution = new Solution453();
        source = new int[]{1, 2, 3};
        expect = 3;
    }

    /**
     * 
     * Method: minMoves(int[] nums) 
     * 
     */ 
    @Test
    public void testMinMoves(){ 
        int res = solution.minMoves(source);
        log.info("solution 453 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    } 
    
        
}
