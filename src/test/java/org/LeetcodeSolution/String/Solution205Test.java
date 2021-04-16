package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution205 Tester. 
* 
* @author cartoon
* @since 04/16/2021
* @version 1.0 
*/ 
public class Solution205Test {

    private static final Logger log = LoggerFactory.getLogger(Solution205Test.class);

    private Solution205 solution;

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
        solution = new Solution205();
        source1Param1 = "egg";
        source1Param2 = "add";
        source2Param1 = "foo";
        source2Param2 = "bar";
        source3Param1 = "paper";
        source3Param2 = "title";
        expect1 = true;
        expect2 = false;
        expect3 = true;
    } 
    
    /**
    * 
    * Method: isIsomorphicByMarkLastPosition(String s, String t) 
    * 
    */ 
    @Test
    public void testIsIsomorphicByMarkLastPosition(){ 
        boolean res1 = solution.isIsomorphicByMarkLastPosition(source1Param1, source1Param2);
        boolean res2 = solution.isIsomorphicByMarkLastPosition(source2Param1, source2Param2);
        boolean res3 = solution.isIsomorphicByMarkLastPosition(source3Param1, source3Param2);
        log.info("solution 205 test by mark last position, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    /** 
    * 
    * Method: isIsomorphicByHash(String s, String t) 
    * 
    */ 
    @Test
    public void testIsIsomorphicByHash(){
        boolean res1 = solution.isIsomorphicByMarkLastPosition(source1Param1, source1Param2);
        boolean res2 = solution.isIsomorphicByMarkLastPosition(source2Param1, source2Param2);
        boolean res3 = solution.isIsomorphicByMarkLastPosition(source3Param1, source3Param2);
        log.info("solution 205 test by hash, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    
}
