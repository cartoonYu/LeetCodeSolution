package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution485 Tester. 
* @author cartoon
* @date 10/30/2020
* @version 1.0 
*/ 
public class Solution485Test {

    private static final Logger log = LoggerFactory.getLogger(Solution485Test.class);

    private Solution485 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution485();
        source = new int[]{1, 1, 0, 1, 1, 1};
        expect = 3;
    }

    /**
     * 
     * Method: findMaxConsecutiveOnes(int[] nums) 
     * 
     */ 
    @Test
    public void testFindMaxConsecutiveOnes(){ 
        int res = solution.findMaxConsecutiveOnes(source);
        log.info("solution 485 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    } 
    
    /**
     * 
     * Method: anotherFindMaxConsecutiveOnes(int[] nums) 
     * 
     */ 
    @Test
    public void testAnotherFindMaxConsecutiveOnes(){
        int res = solution.anotherFindMaxConsecutiveOnes(source);
        log.info("solution 485 test, calculate data: {}, expect result: {}", res, expect);
    } 
    
        
}
