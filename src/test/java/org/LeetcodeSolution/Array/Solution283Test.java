package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution283 Tester. 
* @author cartoon
* @date 10/16/2020
* @version 1.0 
*/ 
public class Solution283Test {

    private static final Logger log = LoggerFactory.getLogger(Solution283Test.class);

    private Solution283 solution;

    private int[] source;

    private int[] expect;

    @Before
    public void before(){ 
        solution = new Solution283();
        source = new int[]{0, 1, 0, 3, 12};
        expect = new int[]{1, 3, 12, 0, 0};
    }

    /**
     * 
     * Method: moveZeroes(int[] nums) 
     * 
     */ 
    @Test
    public void testMoveZeroes(){ 
        solution.moveZeroes(source);
        log.info("solution 283 test, calculate data: {}, expect result: {}",
                source, expect);
        Assert.assertArrayEquals(expect, source);
    } 
    
        
}
