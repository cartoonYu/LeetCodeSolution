package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution6 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution6Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution6Test.class);

    private Solution6 solution;

    private String source1Param1;

    private int source1Param2;

    private String source2Param1;

    private int source2Param2;

    private String source3Param1;

    private int source3Param2;

    private String expect1;

    private String expect2;

    private String expect3;

    @Before
    public void before(){ 
        solution = new Solution6();
        source1Param1 = "PAYPALISHIRING";
        source1Param2 = 3;
        source2Param1 = "PAYPALISHIRING";
        source2Param2 = 4;
        source3Param1 = "A";
        source3Param2 = 1;
        expect1 = "PAHNAPLSIIGYIR";
        expect2 = "PINALSIGYAHRPI";
        expect3 = "A";
    }

        /** 
     * 
     * Method: convert(String s, int numRows) 
     * 
     */ 
    @Test
    public void testConvert(){ 
        String res1 = solution.convert(source1Param1, source1Param2);
        String res2 = solution.convert(source2Param1, source2Param2);
        String res3 = solution.convert(source3Param1, source3Param2);
        log.info("solution 6 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
