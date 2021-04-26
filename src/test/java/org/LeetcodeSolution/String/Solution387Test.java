package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution387 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution387Test {

    private static final Logger log = LoggerFactory.getLogger(Solution387Test.class);

    private Solution387 solution;

    private String source1;

    private String source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){
        solution = new Solution387();
        source1 = "leetcode";
        source2 = "loveleetcode";
        expect1 = 0;
        expect2 = 2;
    } 
    
    /**
    * 
    * Method: firstUniqChar(String s) 
    * 
    */ 
    @Test
    public void testFirstUniqChar(){ 
        int res1 = solution.firstUniqChar(source1);
        int res2 = solution.firstUniqChar(source2);
        log.info("solution 387 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                source1, expect1, source2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    /** 
    * 
    * Method: firstUniqCharByHashMap(String s) 
    * 
    */ 
    @Test
    public void testFirstUniqCharByHashMap(){ 
        int res1 = solution.firstUniqCharByHashMap(source1);
        int res2 = solution.firstUniqCharByHashMap(source2);
        log.info("solution 387 test, solute by hash map, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                source1, expect1, source2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
}
