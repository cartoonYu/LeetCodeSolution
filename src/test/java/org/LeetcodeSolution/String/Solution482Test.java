package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution482 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution482Test {

    private static final Logger log = LoggerFactory.getLogger(Solution482Test.class);

    private Solution482 solution;

    private String source1Param1;

    private int source1Param2;

    private String source2Param1;

    private int source2Param2;

    private String expect1;

    private String expect2;

    @Before
    public void before(){
        solution = new Solution482();
        source1Param1 = "5F3Z-2e-9-w";
        source1Param2 = 4;
        source2Param1 = "2-5g-3-J";
        source2Param2 = 2;
        expect1 = "5F3Z-2E9W";
        expect2 = "2-5G-3J";
    } 
    
    /**
    * 
    * Method: licenseKeyFormatting(String S, int K) 
    * 
    */ 
    @Test
    public void testLicenseKeyFormatting(){ 
        String res1 = solution.licenseKeyFormatting(source1Param1, source1Param2);
        String res2 = solution.licenseKeyFormatting(source2Param1, source2Param2);
        log.info("solution 482 test, solute by hash map, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
    
}
