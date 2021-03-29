package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution14 Tester. 
* @author cartoon
* @date 03/29/2021
* @version 1.0 
*/ 
public class Solution14Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution14Test.class);

    private Solution14 solution;

    private String[] source1;

    private String[] source2;

    private String expect1;

    private String expect2;

    @Before
    public void before(){ 
        solution = new Solution14();
        source1 = new String[]{"flower","flow","flight"};
        source2 = new String[]{"dog","racecar","car"};
        expect1 = "fl";
        expect2 = "";
    }

        /** 
     * 
     * Method: longestCommonPrefixWithoutSort(String[] strs) 
     * 
     */ 
    @Test
    public void testLongestCommonPrefixWithoutSort(){ 
        String res1 = solution.longestCommonPrefixWithoutSort(source1);
        String res2 = solution.longestCommonPrefixWithoutSort(source2);
        log.info("solution 14 test without sort, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        /** 
     * 
     * Method: longestCommonPrefixWithSort(String[] strs) 
     * 
     */ 
    @Test
    public void testLongestCommonPrefixWithSort(){
        String res1 = solution.longestCommonPrefixWithSort(source1);
        String res2 = solution.longestCommonPrefixWithSort(source2);
        log.info("solution 14 test with sort, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
