package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution796 Tester. 
* 
* @author cartoon
* @since 05/08/2021
* @version 1.0 
*/ 
public class Solution796Test {

    private static final Logger log = LoggerFactory.getLogger(Solution796Test.class);

    private Solution796 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){
        solution = new Solution796();
        source1Param1 = "abcde";
        source1Param2 = "cdeab";
        source2Param1 = "abcde";
        source2Param2 = "abced";
        expect1 = true;
        expect2 = false;
    } 
    
    /**
    * 
    * Method: rotateString3(String A, String B) 
    * 
    */ 
    @Test
    public void testRotateString3(){ 
        boolean res1 = solution.rotateString3(source1Param1, source1Param2);
        boolean res2 = solution.rotateString3(source2Param1, source2Param2);
        log.info("solution 796 test, test solution 3, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    /** 
    * 
    * Method: rotateString2(String A, String B) 
    * 
    */ 
    @Test
    public void testRotateString2(){
        boolean res1 = solution.rotateString2(source1Param1, source1Param2);
        boolean res2 = solution.rotateString2(source2Param1, source2Param2);
        log.info("solution 796 test, test solution 2, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    /** 
    * 
    * Method: rotateString1(String A, String B) 
    * 
    */ 
    @Test
    public void testRotateString1(){
        boolean res1 = solution.rotateString1(source1Param1, source1Param2);
        boolean res2 = solution.rotateString1(source2Param1, source2Param2);
        log.info("solution 796 test, test solution 1, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
}
