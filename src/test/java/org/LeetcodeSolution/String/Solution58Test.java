package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution58 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution58Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution58Test.class);

    private Solution58 solution;

    private String source1;

    private String source2;

    private int expect1;

    private int expect2;

    @Before
    public void before(){ 
        solution = new Solution58();
        source1 = "Hello World";
        source2 = " ";
        expect1 = 5;
        expect2 = 0;
    }

        /** 
     * 
     * Method: lengthOfLastWord(String s) 
     * 
     */ 
    @Test
    public void testLengthOfLastWord(){ 
        int res1 = solution.lengthOfLastWord(source1);
        int res2 = solution.lengthOfLastWord(source2);
        log.info("solution 58 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
