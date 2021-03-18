package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution2 Tester. 
* @author cartoon
* @date 03/09/2021
* @version 1.0 
*/ 
public class Solution2Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution2Test.class);

    private Solution2 solution;

    private ListNode source1Param1;

    private ListNode source1Param2;

    private ListNode source2Param1;

    private ListNode source2Param2;

    private ListNode source3Param1;

    private ListNode source3Param2;

    private ListNode expect1;

    private ListNode expect2;

    private ListNode expect3;

    @Before
    public void before(){ 
        solution = new Solution2();
        int[] source1Param1Array = new int[]{2, 4, 3};
        int[] source1Param2Array = new int[]{5, 6, 4};
        int[] source2Param1Array = new int[]{0};
        int[] source2Param2Array = new int[]{0};
        int[] source3Param1Array = new int[]{9, 9, 9, 9, 9, 9, 9};
        int[] source3Param2Array = new int[]{9, 9, 9, 9};
        int[] expect1Array = new int[]{7, 0, 8};
        int[] expect2Array = new int[]{0};
        int[] expect3Array = new int[]{8, 9, 9, 9, 0, 0, 0, 1};
        source1Param1 = FormLinkedListUtil.getInstance().form(source1Param1Array);
        source1Param2 = FormLinkedListUtil.getInstance().form(source1Param2Array);
        source2Param1 = FormLinkedListUtil.getInstance().form(source2Param1Array);
        source2Param2 = FormLinkedListUtil.getInstance().form(source2Param2Array);
        source3Param1 = FormLinkedListUtil.getInstance().form(source3Param1Array);
        source3Param2 = FormLinkedListUtil.getInstance().form(source3Param2Array);
        expect1 = FormLinkedListUtil.getInstance().form(expect1Array);
        expect2 = FormLinkedListUtil.getInstance().form(expect2Array);
        expect3 = FormLinkedListUtil.getInstance().form(expect3Array);
    }

    /**
     * 
     * Method: addTwoNumbers(ListNode l1, ListNode l2) 
     * 
     */ 
    @Test
    public void testAddTwoNumbers(){ 
        ListNode res1 = solution.addTwoNumbers(source1Param1, source1Param2);
        ListNode res2 = solution.addTwoNumbers(source2Param1, source2Param2);
        ListNode res3 = solution.addTwoNumbers(source3Param1, source3Param2);
        log.info("solution 2 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
