package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1313 Tester. 
* @author cartoon
* @date 02/22/2021
* @version 1.0 
*/ 
public class Solution1313Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution1313Test.class);

    private Solution1313 solution;

    private int[] source1;

    private int[] source2;

    private int[] expect1;

    private int[] expect2;

    @Before
    public void before(){ 
        solution = new Solution1313();
        source1 = new int[]{1, 2, 3, 4};
        source2 = new int[]{1, 1, 2, 3};
        expect1 = new int[]{2, 4, 4, 4};
        expect2 = new int[]{1, 3, 3};
    }

    /**
     * 
     * Method: decompressRLElist(int[] nums) 
     * 
     */ 
    @Test
    public void testDecompressRLElist(){ 
        int[] res1 = solution.decompressRLElist(source1);
        int[] res2 = solution.decompressRLElist(source2);
        log.info("solution 1313 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertArrayEquals(expect1, res1);
        Assert.assertArrayEquals(expect2, res2);
    } 
    
        
}
