package org.LeetcodeSolution.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *     189.Rotate Array
 *     https://leetcode.com/problems/rotate-array/
 *     https://leetcode-cn.com/problems/rotate-array/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution189 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 判断并将k减少到数组长度以下等价的值
     *     2.2 首先反转所有元素
     *     2.3 反转0到k-1的元素
     *     2.4 反转k到最后的元素
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗39.6MB内存
     *     3.2 leetcode中耗时0ms,消耗37.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 judge and reduce k under nums.length
     *     2.2 rotate all element first
     *     2.3 rotate index 0 to k-1 element
     *     2.4 rotate index k to nums.length-1
     * 3.About submit record
     *     3.1 1ms and 39.6MB memory in LeetCode China
     *     3.2 0ms and 37.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @param k
     */
    public void rotateByRecurse(int[] nums, int k) {
        int length=nums.length;
        if(k==0||k%length==0){
            return;
        }
        k=k%length;
        rotate(nums,0,length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,length-1);
    }

    private void rotate(int[] nums,int left,int right){
        int temp;
        while(left<right){
            temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 判断并将k减少到数组长度以下等价的值
     *     2.2 定义一个list存储最后的k个元素
     *     2.3 后移0到length-k-1个元素
     *     2.4 将list中元素顺序放入数组开头
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗40MB内存
     *     3.2 leetcode中耗时1ms,消耗37.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 judge and reduce k under nums.length
     *     2.2 define a list cache last k element
     *     2.3 rearward move index 0 to length-k-1 element
     *     2.4 set list's element to index 0 to k
     * 3.About submit record
     *     3.1 4ms and 40MB memory in LeetCode China
     *     3.2 1ms and 37.6MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param k
     */
    public void rotateByList(int[] nums, int k) {
        int length=nums.length;
        if(k==0||k%length==0){
            return;
        }
        k=k%length;
        List<Integer> list=new ArrayList<>();
        for(int i=length-k;i<length;i++){
            list.add(nums[i]);
        }
        int i=length-k-1,j=length-1;
        while(i>=0){
            nums[j]=nums[i];
            j--;
            i--;
        }
        for(int l=0,size=list.size();l<size;l++){
            nums[l]=list.get(l);
        }
    }
}
