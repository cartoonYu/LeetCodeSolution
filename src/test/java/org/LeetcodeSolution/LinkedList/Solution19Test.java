package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution19 Tester. 
* @author cartoon
* @date 03/09/2021
* @version 1.0 
*/ 
public class Solution19Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution19Test.class);

    private Solution19 solution;

    private ListNode source1Param1;

    private int source1Param2;

    private ListNode source2Param1;

    private int source2Param2;

    private ListNode source3Param1;

    private int source3Param2;

    private ListNode expect1;

    private ListNode expect2;

    private ListNode expect3;

    private int[] source1Param1Array;

    private int[] source2Param1Array;

    private int[] source3Param1Array;

    private int[] expect1Array;

    private int[] expect2Array;

    private int[] expect3Array;

    @Before
    public void before(){ 
        solution = new Solution19();
        source1Param1Array = new int[]{1, 2, 3, 4, 5};
        source2Param1Array = new int[]{1};
        source3Param1Array = new int[]{1, 2};
        expect1Array = new int[]{1, 2, 3, 5};
        expect2Array = new int[]{};
        expect3Array = new int[]{1};
        source1Param1 = FormLinkedListUtil.getInstance().form(source1Param1Array);
        source1Param2 = 2;
        source2Param1 = FormLinkedListUtil.getInstance().form(source2Param1Array);
        source2Param2 = 1;
        source3Param1 = FormLinkedListUtil.getInstance().form(source3Param1Array);
        source3Param2 = 1;
        expect1Array = new int[]{1, 2, 3, 5};
        expect2Array = new int[]{};
        expect3Array = new int[]{1};
        expect1 = FormLinkedListUtil.getInstance().form(expect1Array);
        expect2 = FormLinkedListUtil.getInstance().form(expect2Array);
        expect3 = FormLinkedListUtil.getInstance().form(expect3Array);
    }

    /**
     * 
     * Method: removeNthFromEnd(ListNode head, int n) 
     * 
     */ 
    @Test
    public void testRemoveNthFromEnd(){ 
        ListNode res1 = solution.removeNthFromEnd(source1Param1, source1Param2);
        ListNode res2 = solution.removeNthFromEnd(source2Param1, source2Param2);
        ListNode res3 = solution.removeNthFromEnd(source3Param1, source3Param2);
        log.info("solution 19 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
        
}
