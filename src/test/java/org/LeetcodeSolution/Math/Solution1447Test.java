package org.LeetcodeSolution.Math; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

/** 
* Solution1447 Tester. 
* 
* @author cartoon
* @since 04/14/2021
* @version 1.0 
*/ 
public class Solution1447Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1447Test.class);

    private Solution1447 solution;

    private int source1;

    private int source2;

    private int source3;

    private int source4;

    private List<String> expect1;

    private List<String> expect2;

    private List<String> expect3;

    private List<String> expect4;

    @Before
    public void before(){
        solution = new Solution1447();
        source1 = 2;
        source2 = 3;
        source3 = 4;
        source4 = 1;
        expect1 = Arrays.asList("1/2");
        expect2 = Arrays.asList("1/2", "1/3", "2/3");
        expect3 = Arrays.asList("1/2", "1/3", "1/4", "2/3", "3/4");
        expect4 = Arrays.asList();
    } 
    
    /**
    * 
    * Method: simplifiedFractions(int n) 
    * 
    */ 
    @Test
    public void testSimplifiedFractions(){
        List<String> res1 = solution.simplifiedFractions(source1);
        List<String> res2 = solution.simplifiedFractions(source2);
        List<String> res3 = solution.simplifiedFractions(source3);
        List<String> res4 = solution.simplifiedFractions(source4);
        log.info("solution 1447 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
    }
} 
