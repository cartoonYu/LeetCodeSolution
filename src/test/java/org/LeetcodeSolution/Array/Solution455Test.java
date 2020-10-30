package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution455 Tester. 
* @author cartoon
* @date 10/27/2020
* @version 1.0 
*/ 
public class Solution455Test {

    private static final Logger log = LoggerFactory.getLogger(Solution455Test.class);

    private Solution455 solution;

    private int[] source1Param1;

    private int[] source1Param2;

    private int[] source2Param1;

    private int[] source2Param2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution455();
        source1Param1 = new int[]{1, 2, 3};
        source1Param2 = new int[]{1, 1};
        source2Param1 = new int[]{1, 2};
        source2Param2 = new int[]{1, 2, 3};
        expect1 = 1;
        expect2 = 2;
    }

    /**
     * 
     * Method: findContentChildren(int[] g, int[] s) 
     * 
     */ 
    @Test
    public void testFindContentChildren(){ 
        int res1 = solution.findContentChildren(source1Param1, source1Param2);
        int res2 = solution.findContentChildren(source2Param1, source2Param2);
        log.info("solution 455 test, calculate data1: {}, expect result1: {}, calculate data2: {}, expect result2: {}"
                , res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
