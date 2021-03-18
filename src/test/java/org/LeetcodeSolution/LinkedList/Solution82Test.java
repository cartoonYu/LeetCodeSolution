package org.LeetcodeSolution.LinkedList; 

import org.LeetcodeSolution.DataStructure.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
* Solution82 Tester. 
* @author cartoon
* @date 03/18/2021
* @version 1.0 
*/ 
public class Solution82Test { 
    
    private static final Logger log = LoggerFactory.getLogger(Solution82Test.class);

    private Solution82 solution;

    private ListNode source1;

    private ListNode source2;

    private ListNode expect1;

    private ListNode expect2;

    @Before
    public void before(){ 
        solution = new Solution82();
        int[] source1Array = new int[]{1, 2, 3, 3, 4, 4, 5};
        int[] source2Array = new int[]{1, 1, 1, 2, 3};
        int[] expect1Array = new int[]{1, 2, 5};
        int[] expect2Array = new int[]{2, 3};
        source1 = FormLinkedListUtil.getInstance().form(source1Array);
        source2 = FormLinkedListUtil.getInstance().form(source2Array);
        expect1 = FormLinkedListUtil.getInstance().form(expect1Array);
        expect2 = FormLinkedListUtil.getInstance().form(expect2Array);
    }

        /** 
     * 
     * Method: deleteDuplicates(ListNode head) 
     * 
     */ 
    @Test
    public void testDeleteDuplicates(){
        ListNode res1 = solution.deleteDuplicates(source1);
        ListNode res2 = solution.deleteDuplicates(source2);
        log.info("solution 82 test, calculate data1: {}, expect result1: {}, " +
                        "calculate data2: {}, expect result2: {}",
                res1, expect1, res2, expect2);
        Assert.assertEquals(expect1, res1);
        Assert.assertEquals(expect2, res2);
    } 
    
        
}
