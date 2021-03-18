package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution92 Tester. 
* @author cartoon
* @date 03/18/2021
* @version 1.0 
*/ 
public class Solution92Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution92Test.class);

    private Solution92 solution;

    private ListNode source1Param1;

    private int source1Param2;

    private int source1Param3;

    private ListNode source2Param1;

    private int source2Param2;

    private int source2Param3;

    private ListNode expect1;

    private ListNode expect2;

    @Before
    public void before(){ 
        solution = new Solution92();
        source1Param1 = FormLinkedListUtil.getInstance().form(new int[]{1, 2, 3, 4, 5});
        source1Param2 = 2;
        source1Param3 = 4;
        source2Param1 = FormLinkedListUtil.getInstance().form(new int[]{5});
        source2Param2 = 1;
        source2Param3 = 1;
        expect1 = FormLinkedListUtil.getInstance().form(new int[]{1, 4, 3, 2, 5});
        expect2 = FormLinkedListUtil.getInstance().form(new int[]{5});
    }

        /** 
     * 
     * Method: reverseBetween(ListNode head, int m, int n) 
     * 
     */ 
    @Test
    public void testReverseBetween(){ 
        ListNode res1 = solution.reverseBetween(source1Param1, source1Param2, source1Param3);
        ListNode res2 = solution.reverseBetween(source2Param1, source2Param2, source2Param3);
        log.info("solution 92 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
