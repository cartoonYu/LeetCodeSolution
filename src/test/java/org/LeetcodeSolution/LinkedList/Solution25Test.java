package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution25 Tester. 
* @author cartoon
* @date 03/15/2021
* @version 1.0 
*/ 
public class Solution25Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution25Test.class);

    private Solution25 solution;

    private ListNode source1Param1;

    private int source1Param2;

    private ListNode source2Param1;

    private int source2Param2;

    private ListNode source3Param1;

    private int source3Param2;

    private ListNode expect1;

    private ListNode expect2;

    private ListNode expect3;

    @Before
    public void before(){ 
        solution = new Solution25();
        int[] source1Param1Array = new int[]{1, 2, 3, 4, 5};
        int[] source2Param1Array = new int[]{1, 2, 3, 4, 5};
        int[] source3Param1Array = new int[]{1};
        int[] expect1Array = new int[]{3, 2, 1, 4, 5};
        int[] expect2Array = new int[]{1, 2, 3, 4, 5};
        int[] expect3Array = new int[]{1};
        source1Param2 = 3;
        source2Param2 = 1;
        source3Param2 = 1;
        source1Param1 = FormLinkedListUtil.getInstance().form(source1Param1Array);
        source2Param1 = FormLinkedListUtil.getInstance().form(source2Param1Array);
        source3Param1 = FormLinkedListUtil.getInstance().form(source3Param1Array);
        expect1 = FormLinkedListUtil.getInstance().form(expect1Array);
        expect2 = FormLinkedListUtil.getInstance().form(expect2Array);
        expect3 = FormLinkedListUtil.getInstance().form(expect3Array);
    }

        /** 
     * 
     * Method: reverseKGroup2(ListNode head, int k) 
     * 
     */ 
    @Test
    public void testReverseKGroup2(){ 
        ListNode res1 = solution.reverseKGroup2(source1Param1, source1Param2);
        ListNode res2 = solution.reverseKGroup2(source2Param1, source2Param2);
        ListNode res3 = solution.reverseKGroup2(source3Param1, source3Param2);
        log.info("solution 25 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 

}
