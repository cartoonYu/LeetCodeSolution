package org.LeetcodeSolution.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem
 *      350. Intersection of Two Arrays II
 *      https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *      https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      349. Intersection of Two Arrays
 * @author cartoon
 * @version 1.0
 */
public class Solution350 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n log n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 排序两个数组
     *     2.2 使用两个指针遍历两个数组，因为数组已经排序，所以我可以直接对比当前元素的大小关系判断当前元素是否是交集
     * 3.提交记录
     *     3.1 力扣中耗时7ms,消耗36.3MB内存
     *     3.2 leetcode中耗时2ms,消耗35.9MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *      1.1 Time Complexity is O(n)
     *      1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 Sort two array
     *      2.2 Get two array'length as cycle termination condition
     *      2.3 Use two pointer to traversal two array respectively
     *          cause the two array are sorted,so I can compare the two element in current position to judge whether the two arrays have intersection
     *      2.4 cause the intersection of two arrays's length is uncertain,so use list to store momentarily element
     * 3.About submit record
     *      3.1 7ms and 36.3MB memory in LeetCode China
     *      3.2 2ms and 35.9MB memory in LeetCode
     * 4.Q&A
     *      None
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int len1=nums1.length;
        int len2=nums2.length;
        List<Integer> list=new ArrayList<>();
        while(i<len1&&j<len2){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else{
                if(nums1[i]<nums2[j]){
                    i++;
                }
                else{
                    j++;
                }
            }
        }
        int[] result=new int[list.size()];
        for(int k=0,size=list.size();k<size;k++){
            result[k]=list.get(k);
        }
        return result;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 基本解法与349题类似，但是将哈希换成了list
     * 3.提交记录
     *     3.1 力扣中耗时42ms,消耗37.1MB内存
     * 4.Q&A
     *
     * Notice
     *      This version is previous solution
     * 1.About Complexity
     *      1.1 Time Complexity is O(n)
     *      1.2 Space Complexity is O(n)
     * 2.how I solve
     *      2.1 Compare two array,use the longer array as a compared list
     *      2.2 Use the shorter array as a compare array
     *      2.3 Traverse the compare array,use every element to contrast with the compared list,if it didn't,put the element to a new list
     *      2.4 Use iteration traversal to put every element to array
     * 3.About submit record
     *      3.1 42ms and 37.1MB memory in LeetCode China
     *      3.2 No record in LeetCode because I can't bear it
     * 4.Q&A
     *      None
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] preIntersect(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        int[] tempNum=nums1.length>nums2.length?nums1:nums2;
        int[] tempNum2;
        if(tempNum==nums1){
            tempNum2=nums2;
        }
        else{
            tempNum2=nums1;
        }
        for(int temp:tempNum){
            list.add(temp);
        }
        List<Integer> tempList=new ArrayList<>();
        for(int temp:tempNum2){
            if(list.contains(temp)){
                tempList.add(temp);
                list.remove(Integer.valueOf(temp));
            }
        }
        int[] result=new int[tempList.size()];
        for(int i=0,size=tempList.size();i<size;i++){
            result[i]=tempList.get(i);
        }
        return result;
    }
}
