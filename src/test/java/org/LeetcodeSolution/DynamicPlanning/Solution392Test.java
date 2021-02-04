package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution392 Tester. 
* 
* @author cartoon 
* @since  02/04/2021
* @version 1.0 
*/ 
public class Solution392Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution392Test.class);
    
    private Solution392 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){ 
        solution = new Solution392();
        source1Param1 = "abc";
        source1Param2 = "ahbgdc";
        source2Param1 = "axc";
        source2Param2 = "ahbgdc";
        expect1 = true;
        expect2 = false;
    } 
    
    /** 
    * 
    * Method: isSubsequence(String s, String t) 
    * 
    */ 
    @Test
    public void testIsSubsequence(){ 
        boolean res1 = solution.isSubsequence(source1Param1, source1Param2);
        boolean res2 = solution.isSubsequence(source2Param1, source2Param2);
        log.info("solution 392 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
