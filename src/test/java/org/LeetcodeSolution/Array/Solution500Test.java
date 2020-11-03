package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/** 
* Solution500 Tester. 
* @author cartoon.
* @date 11/02/2020
* @version 1.0 
*/ 
public class Solution500Test {

    private static final Logger log = LoggerFactory.getLogger(Solution500Test.class);

    private Solution500 solution;

    private String[] source;

    private String[] expect;

    @Before
    public void before(){ 
        solution = new Solution500();
        source = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        expect = new String[]{"Alaska", "Dad"};
    }

    /**
     * 
     * Method: findWords(String[] words) 
     * 
     */ 
    @Test
    public void testFindWords(){ 
        String[] res = solution.findWords(source);
        log.info("solution 500 test, calculate data: {}, expect result: {}", res, expect);
        Assert.assertArrayEquals(expect, res);
    }

} 
