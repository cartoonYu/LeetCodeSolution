package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution274 Tester. 
* @author cartoon
* @date 10/15/2020
* @version 1.0 
*/ 
public class Solution274Test {

    private static final Logger log = LoggerFactory.getLogger(Solution274Test.class);

    private Solution274 solution;

    private int[] source;

    private int expect;

    @Before
    public void before(){ 
        solution = new Solution274();
        source = new int[]{3, 0, 6, 1, 5};
        expect = 3;
    }

    /**
     * 
     * Method: hIndexBySort(int[] citations) 
     * 
     */ 
    @Test
    public void testHIndexBySort(){
        int res = solution.hIndexBySort(source);
        log.info("solution 274 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

}
