package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution838 Tester. 
* @author cartoon.yu
* @date 02/12/2021
* @version 1.0 
*/ 
public class Solution838Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution838Test.class);

    private Solution838 solution;

    private String source1;

    private String source2;

    private String expect1;

    private String expect2;

    @Before
    public void before(){ 
        solution = new Solution838();
        source1 = ".L.R...LR..L..";
        source2 = "RR.L";
        expect1 = "LL.RR.LLRRLL..";
        expect2 = "RR.L";
    }

        /** 
     * 
     * Method: pushDominoes(String dominoes) 
     * 
     */ 
    @Test
    public void testPushDominoes(){
        String res1 = solution.pushDominoes(source1);
        String res2 = solution.pushDominoes(source2);
        log.info("solution  test, calculate data1: {}, expect result1: {}, " +
                        "calculate838 data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
