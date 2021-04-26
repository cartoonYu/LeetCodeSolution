package org.LeetcodeSolution.String; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution451 Tester. 
* 
* @author cartoon
* @since 04/27/2021
* @version 1.0 
*/ 
public class Solution451Test {

    private static final Logger log = LoggerFactory.getLogger(Solution451Test.class);

    private Solution451 solution;

    private String source1;

    private String source2;

    private String source3;

    private String expect1;

    private String expect2;

    private String expect3;


    @Before
    public void before(){
        solution = new Solution451();
        source1 = "tree";
        expect1 = "eert";
        source2 = "cccaaa";
        expect2 = "aaaccc";
        source3 = "Aabb";
        expect3 = "bbAa";
    } 
    
    /**
    * 
    * Method: frequencySortByBucketSort(String s) 
    * 
    */ 
    @Test
    public void testFrequencySortByBucketSort(){ 
        String res1 = solution.frequencySortByBucketSort(source1);
        String res2 = solution.frequencySortByBucketSort(source2);
        String res3 = solution.frequencySortByBucketSort(source3);
        log.info("solution 451, solute by bucket, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    /** 
    * 
    * Method: frequencySortByTreeMap(String s) 
    * 
    */ 
    @Test
    public void testFrequencySortByTreeMap(){
        String res1 = solution.frequencySortByTreeMap(source1);
        String res2 = solution.frequencySortByTreeMap(source2);
        String res3 = solution.frequencySortByTreeMap(source3);
        log.info("solution 451, solute by tree map, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    
    } 
