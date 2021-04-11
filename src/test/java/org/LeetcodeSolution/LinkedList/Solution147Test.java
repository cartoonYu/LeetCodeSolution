package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution147 Tester. 
* 
* @author cartoon
* @since 04/11/2021
* @version 1.0 
*/ 
public class Solution147Test {

    private static final Logger log = LoggerFactory.getLogger(Solution147Test.class);

    private Solution147 solution;

    private ListNode source1;

    private ListNode source2;

    private ListNode expect1;

    private ListNode expect2;

    @Before
    public void before(){
        solution = new Solution147();
        source1 = FormLinkedListUtil.getInstance().form(new int[]{4, 2, 1, 3});
        source2 = FormLinkedListUtil.getInstance().form(new int[]{-1, 5, 3, 4, 0});
        expect1 = FormLinkedListUtil.getInstance().form(new int[]{1, 2, 3, 4});
        expect2 = FormLinkedListUtil.getInstance().form(new int[]{-1, 0, 3, 4, 5});
    } 
    
    /**
    * 
    * Method: insertionSortList(ListNode head) 
    * 
    */ 
    @Test
    public void testInsertionSortList(){ 
        ListNode res1 = solution.insertionSortList(source1);
        ListNode res2 = solution.insertionSortList(source2);
        log.info("solution 147 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 

}
