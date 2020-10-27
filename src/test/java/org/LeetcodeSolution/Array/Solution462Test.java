package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution462 Tester. 
* @author cartoon
* @date 10/28/2020
* @version 1.0 
*/ 
public class Solution462Test {

    private static final Logger log = LoggerFactory.getLogger(Solution462Test.class);

    private Solution462 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){
        solution = new Solution462();
        source = new int[]{1, 2, 3};
        expect = 2;
    }

    /**
     * 
     * Method: minMoves2(int[] nums) 
     * 
     */ 
    @Test
    public void testMinMoves2(){ 
        int res = solution.minMoves2(source);
        log.info("solution 462 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertEquals(expect, res);
    } 


}
