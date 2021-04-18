package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution344 Tester. 
* 
* @author cartoon
* @since 04/18/2021
* @version 1.0 
*/ 
public class Solution344Test {

    private static final Logger log = LoggerFactory.getLogger(Solution344Test.class);

    private Solution344 solution;

    private char[] source1;

    private char[] source2;

    private char[] expect1;

    private char[] expect2;

    @Before
    public void before(){
        solution = new Solution344();
        source1 = new char[]{'h','e','l','l','o'};
        source2 = new char[]{'H','a','n','n','a','h'};
        expect1 = new char[]{'o','l','l','e','h'};
        expect2 = new char[]{'h','a','n','n','a','H'};
    } 
    
    /**
    * 
    * Method: reverseString(char[] s) 
    * 
    */ 
    @Test
    public void testReverseString(){
        solution.reverseString(source1);
        solution.reverseString(source2);
        log.info("solution 344 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                source1, expect1, source2, expect2);
        Assert.assertArrayEquals(expect1, source1);
        Assert.assertArrayEquals(expect2, source2);
    } 
    
    
}
