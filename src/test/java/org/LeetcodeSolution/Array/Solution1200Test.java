package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 
* Solution1200 Tester. 
* @author cartoon
* @date 11/16/2020
* @version 1.0 
*/ 
public class Solution1200Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1200Test.class);

    private Solution1200 solution;

    private int[] source1;

    private int[] source2;

    private int[] source3;

    private List<List<Integer>> expect1;

    private List<List<Integer>> expect2;

    private List<List<Integer>> expect3;

    @Before
    public void before(){
        solution = new Solution1200();
        source1 = new int[]{4, 2, 1, 3};
        source2 = new int[]{1, 3, 6, 10, 15};
        source3 = new int[]{3, 8, -10, 23, 19, -4, -14, 27};
        expect1 = new LinkedList<>();
        expect1.add(Arrays.asList(1, 2));
        expect1.add(Arrays.asList(2, 3));
        expect1.add(Arrays.asList(3, 4));
        expect2 = new LinkedList<>();
        expect2.add(Arrays.asList(1, 3));
        expect3 = new LinkedList<>();
        expect3.add(Arrays.asList(-14, -10));
        expect3.add(Arrays.asList(19, 23));
        expect3.add(Arrays.asList(23, 27));
    }

    /**
     * 
     * Method: minimumAbsDifference(int[] arr) 
     * 
     */ 
    @Test
    public void testMinimumAbsDifference(){ 
        List<List<Integer>> res1 = solution.minimumAbsDifference(source1);
        List<List<Integer>> res2 = solution.minimumAbsDifference(source2);
        List<List<Integer>> res3 = solution.minimumAbsDifference(source3);
        log.info("solution 1200 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}, " +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
