package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution383 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution383Test {

    private static final Logger log = LoggerFactory.getLogger(Solution383Test.class);

    private Solution383 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private String source3Param1;

    private String source3Param2;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    @Before
    public void before(){
        solution = new Solution383();
        source1Param1 = "a";
        source1Param2 = "b";
        source2Param1 = "aa";
        source2Param2 = "ab";
        source3Param1 = "aa";
        source3Param2 = "aab";
        expect1 = false;
        expect2 = false;
        expect3 = true;
    } 
    
    /**
    * 
    * Method: canConstructByArray3(String ransomNote, String magazine) 
    * 
    */ 
    @Test
    public void testCanConstructByArray3(){ 
        boolean res1 = solution.canConstructByArray3(source1Param1, source1Param2);
        boolean res2 = solution.canConstructByArray3(source2Param1, source2Param2);
        boolean res3 = solution.canConstructByArray3(source3Param1, source3Param2);
        log.info("solution 383, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 

}
