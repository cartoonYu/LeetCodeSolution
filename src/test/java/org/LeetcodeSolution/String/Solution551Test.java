package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution551 Tester. 
* 
* @author cartoon
* @since 05/08/2021
* @version 1.0 
*/ 
public class Solution551Test {

    private static final Logger log = LoggerFactory.getLogger(Solution551Test.class);

    private Solution551 solution;

    private String source1;

    private String source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){
        solution = new Solution551();
        source1 = "PPALLP";
        source2 = "PPALLL";
        expect1 = true;
        expect2 = false;
    } 
    
    /**
    * 
    * Method: checkRecord(String s) 
    * 
    */ 
    @Test
    public void testCheckRecord(){ 
        boolean res1 = solution.checkRecord(source1);
        boolean res2 = solution.checkRecord(source2);
        log.info("solution 551 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
