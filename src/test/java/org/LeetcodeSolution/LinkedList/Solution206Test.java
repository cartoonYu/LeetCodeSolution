package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution206 Tester. 
* 
* @author cartoon
* @since 04/12/2021
* @version 1.0 
*/ 
public class Solution206Test {

    private static final Logger log = LoggerFactory.getLogger(Solution206Test.class);

    private Solution206 solution;

    private ListNode source;

    private ListNode expect;


    @Before
    public void before(){
        solution = new Solution206();
        source = FormLinkedListUtil.getInstance().form(new int[]{1, 2, 3, 4, 5});
        expect = FormLinkedListUtil.getInstance().form(new int[]{5, 4, 3, 2, 1});
    } 
    
    /**
    * 
    * Method: reverseList(ListNode head) 
    * 
    */ 
    @Test
    public void testReverseList(){ 
        ListNode res = solution.reverseList(source);
        log.info("solution 206 test, calculate data: {}, expect result: {}",
                res, expect);
        Assert.assertEquals(expect, res);
    } 
    
    
}
