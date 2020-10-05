package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution42 Tester. 
* @author cartoon
* @date 10/05/2020
* @version 1.0 
*/ 
public class Solution42Test {

    private static final Logger log = LoggerFactory.getLogger(Solution42Test.class);

    private Solution42 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution42();
        source = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        expect = 6;
    }

    /**
     *
     * Method: trap(int[] height)
     *
     */
    @Test
    public void testTrap(){
        int res = solution.trap(source);
        log.info("solution 42 test, calculate: {}, expect: {}", res, expect);
        Assert.assertEquals(expect, res);
    } 

}
