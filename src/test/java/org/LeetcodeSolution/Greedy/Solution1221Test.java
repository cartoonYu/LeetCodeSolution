package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1221 Tester. 
* @author cartoon
* @date 03/02/2021
* @version 1.0 
*/ 
public class Solution1221Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1221Test.class);

    private Solution1221 solution;

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
        solution = new Solution1221();
        source1 = "RLRRLLRLRL";
        source2 = "RLLLLRRRLR";
        source3 = "LLLLRRRR";
        source4 = "RLRRRLLRLL";
        expect1 = 4;
        expect2 = 3;
        expect3 = 1;
        expect4 = 2;
    }

    /**
     * 
     * Method: balancedStringSplit(String s) 
     * 
     */ 
    @Test
    public void testBalancedStringSplit(){ 
        int res1 = solution.balancedStringSplit(source1);
        int res2 = solution.balancedStringSplit(source2);
        int res3 = solution.balancedStringSplit(source3);
        int res4 = solution.balancedStringSplit(source4);
        log.info("solution 1221 test, calculate data1: {}, expect result1: {}, " +
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
