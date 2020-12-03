package org.LeetcodeSolution.BackTracking; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/** 
* Solution17 Tester. 
* @author cartoon.yu
* @date 12/03/2020
* @version 1.0 
*/ 
public class Solution17Test {

    private static final Logger log = LoggerFactory.getLogger(Solution17Test.class);

    private Solution17 solution;

    private String source;

    private List<String> expect;

    @Before
    public void before(){ 
        solution = new Solution17();
        source = "23";
        expect = Arrays.asList("ad", "ae", "af", "bd",
                "be", "bf", "cd", "ce", "cf");
    }

    /**
     * 
     * Method: letterCombinations(String digits) 
     * 
     */ 
    @Test
    public void testLetterCombinations(){
        List<String> res = solution.letterCombinations(source);
        log.info("solution 17 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

} 
