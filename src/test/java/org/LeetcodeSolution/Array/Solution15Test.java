package org.LeetcodeSolution.Array; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** 
* Solution15 Tester. 
* @author cartoon
* @date 10/03/2020
* @version 1.0 
*/
public class Solution15Test {

    private Solution15 solution;

    private int[] source;

    private List<List<Integer>> expect;

    @Before
    public void before() throws Exception {
        solution = new Solution15();
        source = new int[]{-1, 0, 1, 2, -1, -4};
        expect = new LinkedList<>();
        expect.add(Arrays.asList(-1, -1, 2));
        expect.add(Arrays.asList(-1, 0, 1));
    }

    /**
    * 
    * Method: threeSum(int[] nums) 
    * 
    */ 
    @Test
    public void testThreeSum(){
        List<List<Integer>> res = solution.threeSum(source);
        Assert.assertEquals(expect, res);
    } 
    
        
}
