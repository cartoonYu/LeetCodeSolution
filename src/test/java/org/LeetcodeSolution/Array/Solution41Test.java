package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution41 Tester. 
* @author cartoon
* @date 10/04/2020
* @version 1.0 
*/ 
public class Solution41Test {

    private static final Logger log = LoggerFactory.getLogger(Solution41Test.class);

    private Solution41 solution;

    private int[] source;

    private int expect;

    /**
     *
     */
    @Before
    public void before(){
        solution = new Solution41();
        source = new int[]{1,2,0};
        expect = 3;
    }


    /**
     *
     * Method: firstMissingPositive(int[] nums)
     *
    */ 
    @Test
    public void testFirstMissingPositive(){
        int res = solution.firstMissingPositive(source);
        log.info("solution 41 test, calculate: {}, expect: {}", res, expect);
        Assert.assertEquals(expect, res);
    } 
    
        
}
