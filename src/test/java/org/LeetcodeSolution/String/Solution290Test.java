package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution290 Tester. 
* 
* @author cartoon
* @since 04/18/2021
* @version 1.0 
*/ 
public class Solution290Test {

    private static final Logger log = LoggerFactory.getLogger(Solution290Test.class);

    private Solution290 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private String source3Param1;

    private String source3Param2;

    private String source4Param1;

    private String source4Param2;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    private boolean expect4;

    @Before
    public void before(){
        solution = new Solution290();
        source1Param1 = "abba";
        source1Param2 = "dog cat cat dog";
        source2Param1 = "abba";
        source2Param2 = "dog cat cat fish";
        source3Param1 = "aaaa";
        source3Param2 = "dog cat cat dog";
        source4Param1 = "abba";
        source4Param2 = "dog dog dog dog";
        expect1 = true;
        expect2 = false;
        expect3 = false;
        expect4 = false;
    } 
    
        /** 
    * 
    * Method: wordPattern(String pattern, String str) 
    * 
    */ 
    @Test
    public void testWordPattern(){ 
        boolean res1 = solution.wordPattern(source1Param1, source1Param2);
        boolean res2 = solution.wordPattern(source2Param1, source2Param2);
        boolean res3 = solution.wordPattern(source3Param1, source3Param2);
        boolean res4 = solution.wordPattern(source4Param1, source4Param2);
        log.info("solution 290 test, calculate data1: {}, expect result1: {}, " +
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
