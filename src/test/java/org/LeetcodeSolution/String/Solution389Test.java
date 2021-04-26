package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution389 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution389Test {

    private static final Logger log = LoggerFactory.getLogger(Solution389Test.class);

    private Solution389 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private String source3Param1;

    private String source3Param2;

    private String source4Param1;

    private String source4Param2;

    private char expect1;

    private char expect2;

    private char expect3;

    private char expect4;

    @Before
    public void before(){
        solution = new Solution389();
        source1Param1 = "abcd";
        source1Param2 = "abcde";
        source2Param1 = "";
        source2Param2 = "y";
        source3Param1 = "a";
        source3Param2 = "aa";
        source4Param1 = "ae";
        source4Param2 = "aea";
        expect1 = 'e';
        expect2 = 'y';
        expect3 = 'a';
        expect4 = 'a';
    } 
    
    /**
    * 
    * Method: findTheDifference(String s, String t) 
    * 
    */ 
    @Test
    public void testFindTheDifference(){ 
        char res1 = solution.findTheDifference(source1Param1, source1Param2);
        char res2 = solution.findTheDifference(source2Param1, source2Param2);
        char res3 = solution.findTheDifference(source3Param1, source3Param2);
        char res4 = solution.findTheDifference(source4Param1, source4Param2);
        log.info("solution 389, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }


}
