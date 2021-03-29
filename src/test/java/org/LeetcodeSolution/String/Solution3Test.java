package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution3 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution3Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution3Test.class);

    private Solution3 solution;

    private String source1;

    private String source2;

    private String source3;

    private String source4;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    @Before
    public void before(){ 
        solution = new Solution3();
        source1 = "abcabcbb";
        source2 = "bbbbb";
        source3 = "pwwkew";
        source4 = "";
        expect1 = 3;
        expect2 = 1;
        expect3 = 3;
        expect4 = 0;
    }

        /** 
     * 
     * Method: lengthOfLongestSubstring(String s) 
     * 
     */ 
    @Test
    public void testLengthOfLongestSubstring(){ 
        int res1 = solution.lengthOfLongestSubstring(source1);
        int res2 = solution.lengthOfLongestSubstring(source2);
        int res3 = solution.lengthOfLongestSubstring(source3);
        int res4 = solution.lengthOfLongestSubstring(source4);
        log.info("solution 3 test, calculate data1: {}, expect result1: {}, " +
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
