package org.LeetcodeSolution.Array; 

import org.junit.Test; 
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution1299 Tester. 
* @author cartoon.yu
* @date 11/18/2020
* @version 1.0 
*/ 
public class Solution1299Test {

    private static final Logger log = LoggerFactory.getLogger(Solution1299Test.class);

    private Solution1299 solution;

    private int[] source;

    private int[] expect;

    @Before
    public void before(){ 
        solution = new Solution1299();
        source = new int[]{17, 18, 5, 4, 6, 1};
        expect = new int[]{18, 6, 6, 6, 1, -1};
    }

    /**
     * 
     * Method: replaceElements(int[] arr) 
     * 
     */ 
    @Test
    public void testReplaceElements(){ 
        int[] res = solution.replaceElements(source);
        log.info("solution 1299 test, calculate data: {}, expect result: {}", res, expect);
    } 
    
        
}
