package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution165 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution165Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution165Test.class);

    private Solution165 solution;

    private String source1Param1;

    private String source1Param2;

    private String source2Param1;

    private String source2Param2;

    private String source3Param1;

    private String source3Param2;

    private String source4Param1;

    private String source4Param2;

    private String source5Param1;

    private String source5Param2;

    private int expect1;

    private int expect2;

    private int expect3;

    private int expect4;

    private int expect5;

    @Before
    public void before(){ 
        solution = new Solution165();
        source1Param1 = "1.01";
        source1Param2 = "1.001";
        expect1 = 0;
        source2Param1 = "1.0";
        source2Param2 = "1.0.0";
        expect2 = 0;
        source3Param1 = "0.1";
        source3Param2 = "1.1";
        expect3 = -1;
        source4Param1 = "1.0.1";
        source4Param2 = "1";
        expect4 = 1;
        source5Param1 = "7.5.2.4";
        source5Param2 = "7.5.3";
        expect5 = 1;
    }

        /** 
     * 
     * Method: compareVersion2(String version1, String version2) 
     * 
     */ 
    @Test
    public void testCompareVersion2(){ 
        int res1 = solution.compareVersion2(source1Param1, source1Param2);
        int res2 = solution.compareVersion2(source2Param1, source2Param2);
        int res3 = solution.compareVersion2(source3Param1, source3Param2);
        int res4 = solution.compareVersion2(source4Param1, source4Param2);
        int res5 = solution.compareVersion2(source5Param1, source5Param2);
        log.info("solution 165 test version2, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
    } 
    
        /** 
     * 
     * Method: compareVersion1(String version1, String version2) 
     * 
     */ 
    @Test
    public void testCompareVersion1(){
        int res1 = solution.compareVersion1(source1Param1, source1Param2);
        int res2 = solution.compareVersion1(source2Param1, source2Param2);
        int res3 = solution.compareVersion1(source3Param1, source3Param2);
        int res4 = solution.compareVersion1(source4Param1, source4Param2);
        int res5 = solution.compareVersion1(source5Param1, source5Param2);
        log.info("solution 165 test version1, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}, " +
                        "calculate data4: {}, expect result4: {}, " +
                        "calculate data5: {}, expect result5: {}",
                res1, expect1, res2, expect2, res3, expect3, res4, expect4, res5, expect5);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
        Assert.assertEquals(expect4, res4);
        Assert.assertEquals(expect5, res5);
    } 
    
        
}
