package org.LeetcodeSolution.DynamicPlanning; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/** 
* Solution119 Tester. 
* 
* @author cartoon 
* @since  01/08/2021
* @version 1.0 
*/ 
public class Solution119Test {
    
    private static Logger log = LoggerFactory.getLogger(Solution119.class);
    
    private Solution119 solution;

    private int source;

    private List<Integer> expect;

    @Before
    public void before(){ 
        solution = new Solution119();
        source = 3;
        expect = Arrays.asList(1, 3, 3, 1);
    } 
    
    /** 
    * 
    * Method: getRow(int rowIndex) 
    * 
    */ 
    @Test
    public void testGetRow(){ 
        List<Integer> res = solution.getRow(source);
        log.info("solution 119 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 

} 
