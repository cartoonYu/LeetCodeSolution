package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1342 Tester. 
* @author cartoon.yu
* @date 11/19/2020
* @version 1.0 
*/ 
public class Solution1342Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1342Test.class);

    private Solution1342 solution;

    private int source1;

    private int source2;

    private int expect1;

    private int expect2;


    @Before
    public void before(){ 
        solution = new Solution1342();
        source1 = 14;
        source2 = 8;
        expect1 = 6;
        expect2 = 4;
    }

    /**
     * 
     * Method: numberOfSteps(int num) 
     * 
     */ 
    @Test
    public void testNumberOfSteps(){ 
        int res1 = solution.numberOfSteps(source1);
        int res2 = solution.numberOfSteps(source2);
        log.info("solution 1304 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, ",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
