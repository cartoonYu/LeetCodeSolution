package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution203 Tester. 
* 
* @author cartoon
* @since 04/12/2021
* @version 1.0 
*/ 
public class Solution203Test {

    private static final Logger log = LoggerFactory.getLogger(Solution203Test.class);

    private Solution203 solution;

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
        solution = new Solution203();
        source1Param1 = FormLinkedListUtil.getInstance().form(new int[]{1, 2, 6, 3, 4, 5, 6});
        source1Param2 = 6;
        source2Param1 = FormLinkedListUtil.getInstance().form(new int[]{});
        source2Param2 = 1;
        source3Param1 = FormLinkedListUtil.getInstance().form(new int[]{7, 7, 7, 7});
        source3Param2 = 7;
        expect1 = FormLinkedListUtil.getInstance().form(new int[]{1, 2, 3, 4, 5});
        expect2 = FormLinkedListUtil.getInstance().form(new int[]{});
        expect3 = FormLinkedListUtil.getInstance().form(new int[]{});
    } 
    
    /**
    * 
    * Method: removeElements(ListNode head, int val) 
    * 
    */ 
    @Test
    public void testRemoveElements(){ 
        ListNode res1 = solution.removeElements(source1Param1, source1Param2);
        ListNode res2 = solution.removeElements(source2Param1, source2Param2);
        ListNode res3 = solution.removeElements(source3Param1, source3Param2);
        log.info("solution 203 test, remove element, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    /** 
    * 
    * Method: removeElementsByOnePointer(ListNode head, int val) 
    * 
    */ 
    @Test
    public void testRemoveElementsByOnePointer(){
        ListNode res1 = solution.removeElementsByOnePointer(source1Param1, source1Param2);
        ListNode res2 = solution.removeElementsByOnePointer(source2Param1, source2Param2);
        ListNode res3 = solution.removeElementsByOnePointer(source3Param1, source3Param2);
        log.info("solution 203 test, remove element by one pointer, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}" +
                        "calculate data3: {}, expect result3: {}",
                res1, expect1, res2, expect2, res3, expect3);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
        Assert.assertEquals(expect3, res3);
    } 
    
    
}
