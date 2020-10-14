package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/** 
* Solution228 Tester. 
* @author cartoon
* @date 10/14/2020
* @version 1.0 
*/ 
public class Solution228Test {

    private static final Logger log = LoggerFactory.getLogger(Solution228Test.class);

    private Solution228 solution;

    private int[] source;

    private List<String> expect;

    @Before
    public void before(){ 
        solution = new Solution228();
        source = new int[]{0, 1, 2, 4, 5, 7};
        expect = Arrays.asList("0->2", "4->5", "7");
    }

        /** 
     * 
     * Method: summaryRanges(int[] nums) 
     * 
     */ 
    @Test
    public void testSummaryRanges(){ 
        List<String> res = solution.summaryRanges(source);
        log.info("solution 228 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

}
