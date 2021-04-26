package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution541 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution541Test {

    private static final Logger log = LoggerFactory.getLogger(Solution541Test.class);

    private Solution541 solution;

    private String sourceParam1;

    private int sourceParam2;

    private String expect;

    @Before
    public void before(){
        solution = new Solution541();
        sourceParam1 = "abcdefg";
        sourceParam2 = 2;
        expect = "bacdfeg";
    } 
    
    /**
    * 
    * Method: reverseStr(String s, int k) 
    * 
    */ 
    @Test
    public void testReverseStr(){
        String res = solution.reverseStr(sourceParam1, sourceParam2);
        log.info("solution 541 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 
}
