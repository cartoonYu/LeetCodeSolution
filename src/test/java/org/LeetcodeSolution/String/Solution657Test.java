package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution657 Tester. 
* 
* @author cartoon
* @since 05/08/2021
* @version 1.0 
*/ 
public class Solution657Test {

    private static final Logger log = LoggerFactory.getLogger(Solution657Test.class);

    private Solution657 solution;

    private String source1;

    private String source2;

    private boolean expect1;

    private boolean expect2;

    @Before
    public void before(){
        solution = new Solution657();
        source1 = "UD";
        source2 = "LL";
        expect1 = true;
        expect2 = false;
    } 
    
    /**
    * 
    * Method: judgeCircle(String moves) 
    * 
    */ 
    @Test
    public void testJudgeCircle(){ 
        boolean res1 = solution.judgeCircle(source1);
        boolean res2 = solution.judgeCircle(source2);
        log.info("solution 657 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    /** 
    * 
    * Method: judgeCircleWithIncrease(String moves) 
    * 
    */ 
    @Test
    public void testJudgeCircleWithIncrease(){
        boolean res1 = solution.judgeCircleWithIncrease(source1);
        boolean res2 = solution.judgeCircleWithIncrease(source2);
        log.info("solution 657 test, calculate by increase, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
