package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution48 Tester. 
* @author cartoon
* @date 10/06/2020
* @version 1.0 
*/ 
public class Solution48Test {

    private static final Logger log = LoggerFactory.getLogger(Solution48Test.class);

    private Solution48 solution;

    private int[][] source;

    private int[][] expect;

    @Before
    public void before(){
        solution = new Solution48();
        source = new int[3][3];
        source[0] = new int[]{1,2,3};
        source[1] = new int[]{4,5,6};
        source[2] = new int[]{7,8,9};
        expect = new int[3][3];
        expect[0] = new int[]{7,4,1};
        expect[1] = new int[]{8,5,2};
        expect[2] = new int[]{9,6,3};
    }

    /**
     * 
     * Method: rotate(int[][] matrix) 
     * 
     */ 
    @Test
    public void testRotate(){
        solution.rotate(source);
        log.info("solution 48 test, calculate: {}, expect: {}", source, expect);
        Assert.assertArrayEquals(expect, source);
    }

} 
