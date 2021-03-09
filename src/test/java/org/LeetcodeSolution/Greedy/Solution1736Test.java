package org.LeetcodeSolution.Greedy; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1736 Tester. 
* @author cartoon
* @date 02/26/2021
* @version 1.0 
*/ 
public class Solution1736Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1736Test.class);

    private Solution1736 solution;

    private String source1;

    private String source2;

    private String source3;

    private String expect1;

    private String expect2;

    private String expect3;

    @Before
    public void before(){ 
        solution = new Solution1736();
        source1 = "2?:?0";
        source2 = "0?:3?";
        source3 = "1?:22";
        expect1 = "23:50";
        expect2 = "09:39";
        expect3 = "19:22";
    }

    /**
     * 
     * Method: maximumTime(String time) 
     * 
     */ 
    @Test
    public void testMaximumTime(){ 
        String res1 = solution.maximumTime(source1);
        String res2 = solution.maximumTime(source2);
        String res3 = solution.maximumTime(source3);
        log.info("solution 1736 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
