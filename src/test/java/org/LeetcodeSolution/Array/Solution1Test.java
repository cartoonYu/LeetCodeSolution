package org.LeetcodeSolution.Array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/** 
* Solution1 Tester. 
* 
* @author cartoon
* @since  Oct 3, 2020
* @version 1.0 
*/ 
public class Solution1Test {

  private Solution1 solution;

  private int target;

  private int[] source;

  private int[] expect;

  @Before
  public void before(){
      solution = new Solution1();
      target = 9;
      source = new int[]{2, 7, 11, 15};
      expect = new int[]{0, 1};
  }

    /** 
   * 
   * Method: twoSum2(int[] nums, int target) 
   * 
  */ 

  @Test
  public void testTwoSum2(){
      //TODO: Test goes here...
      int[] res = solution.twoSum2(source, target);
      Assert.assertArrayEquals(expect, res);
  } 

  /** 
   * 
   * Method: twoSum1(int[] nums, int target) 
   * 
  */
  @Test
  public void testTwoSum1(){
      int[] res = solution.twoSum1(source, target);
      Assert.assertArrayEquals(expect, res);
  } 


} 
