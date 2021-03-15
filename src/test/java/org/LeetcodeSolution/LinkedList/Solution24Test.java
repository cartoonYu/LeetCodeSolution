package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution24 Tester. 
* @author cartoon
* @date 03/09/2021
* @version 1.0 
*/ 
public class Solution24Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution24Test.class);

    private Solution24 solution;

    private ListNode source1;

    private ListNode source2;

    private ListNode source3;

    private ListNode expect1;

    private ListNode expect2;

    private ListNode expect3;

    private int[] source1Array;

    private int[] source2Array;

    private int[] source3Array;

    private int[] expect1Array;

    private int[] expect2Array;

    private int[] expect3Array;

    @Before
    public void before(){ 
        solution = new Solution24();
        source1Array = new int[]{1, 2, 3, 4};
        source2Array = new int[]{};
        source3Array = new int[]{1};
        expect1Array = new int[]{2, 1, 4, 3};
        expect2Array = new int[]{};
        expect3Array = new int[]{1};
        source1 = FormLinkedListUtil.getInstance().form(source1Array);
        source2 = FormLinkedListUtil.getInstance().form(source2Array);
        source3 = FormLinkedListUtil.getInstance().form(source3Array);
        expect1 = FormLinkedListUtil.getInstance().form(expect1Array);
        expect2 = FormLinkedListUtil.getInstance().form(expect2Array);
        expect3 = FormLinkedListUtil.getInstance().form(expect3Array);
    }

    /**
     * 
     * Method: swapPairs(ListNode head) 
     * 
     */ 
    @Test
    public void testSwapPairs(){ 
        ListNode res1 = solution.swapPairs(source1);
        ListNode res2 = solution.swapPairs(source2);
        ListNode res3 = solution.swapPairs(source3);
        log.info("solution 24 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
