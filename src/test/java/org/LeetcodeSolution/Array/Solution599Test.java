package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution599 Tester. 
* @author cartoon.yu
* @date 11/04/2020
* @version 1.0 
*/ 
public class Solution599Test {

    private static final Logger log = LoggerFactory.getLogger(Solution599Test.class);

    private Solution599 solution;

    private String[] source1Param1;

    private String[] source1Param2;

    private String[] source2Param1;

    private String[] source2Param2;

    private String[] expect1;

    private String[] expect2;

    @Before
    public void before(){ 
        solution = new Solution599();
        source1Param1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        source1Param2 = new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        source2Param1 = new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        source2Param2 = new String[]{"KFC", "Shogun", "Burger King"};
        expect1 = new String[]{"Shogun"};
        expect2 = new String[]{"Shogun"};
    }

    /**
     * 
     * Method: findRestaurant(String[] list1, String[] list2) 
     * 
     */ 
    @Test
    public void testFindRestaurant(){ 
        String[] res1 = solution.findRestaurant(source1Param1, source1Param2);
        String[] res2 = solution.findRestaurant(source2Param1, source2Param2);
        log.info("solution 561 test, calculate data1: {}, expect result1: {}, " +
                "calculate data2: {}, expect result2: {}", res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    } 
    
        
}
