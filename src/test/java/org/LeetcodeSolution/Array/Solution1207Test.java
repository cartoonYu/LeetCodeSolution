package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1207 Tester. 
* @author cartoon.yu
* @date 11/18/2020
* @version 1.0 
*/ 
public class Solution1207Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1207Test.class);

    private Solution1207 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private boolean expect1;

    private boolean expect2;

    private boolean expect3;

    @Before
    public void before(){ 
        solution = new Solution1207();
        source1 = new int[]{1, 2, 2, 1, 1, 3};
        source2 = new int[]{1, 2};
        source3 = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        expect1 = true;
        expect2 = false;
        expect3 = true;
    }

    /**
     * 
     * Method: uniqueOccurrencesByHash(int[] arr) 
     * 
     */ 
    @Test
    public void testUniqueOccurrencesByHash(){ 
        boolean res1 = solution.uniqueOccurrencesByHash(source1);
        boolean res2 = solution.uniqueOccurrencesByHash(source2);
        boolean res3 = solution.uniqueOccurrencesByHash(source3);
        log.info("solution 1207 test, unique occurrences by hash, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    /**
     * 
     * Method: uniqueOccurrencesByCountinSort(int[] arr) 
     * 
     */ 
    @Test
    public void testUniqueOccurrencesByCountInSort(){
        boolean res1 = solution.uniqueOccurrencesByCountInSort(source1);
        boolean res2 = solution.uniqueOccurrencesByCountInSort(source2);
        boolean res3 = solution.uniqueOccurrencesByCountInSort(source3);
        log.info("solution 1207 test, unique occurrences by sort, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
