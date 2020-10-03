package org.LeetcodeSolution.Array;

import java.util.Arrays;

/**
 * Problem
 *     628.Maximum Product of Three Numbers
 *     https://leetcode.com/problems/maximum-product-of-three-numbers/submissions/
 *     https://leetcode-cn.com/problems/maximum-product-of-three-numbers/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution628 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 根据题意，结果必然是最大的三个数相乘或者最大的数跟最小的两个数相乘的最大值
     *   2.2 循环遍历数组，对比找到最大的三个数以及最小的两个数
     *   2.3 相乘并对比得到结果
     * 3.提交记录
     *   3.1 力扣中耗时4ms,消耗38.7MB内存
     *   3.2 leetcode中耗时ms,消耗MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according topic，result must contains maximum number,and other two number,it depends on multipart result with last two and first two number
     *     2.2 circulate array,find the three biggest and two smallest number
     *     2.3 multipart them and compare
     * 3.About submit record
     *     3.1 4ms and 38.7MB memory in LeetCode China
     *     3.2 3ms and 39.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        if(nums==null||nums.length<3){
            return 0;
        }
        int[] max=new int[3];
        int[] min=new int[2];
        for(int i=0;i<3;i++){
            max[i]=Integer.MIN_VALUE;
        }
        for(int i=0;i<2;i++){
            min[i]=Integer.MAX_VALUE;
        }
        for(int temp:nums){
            if(temp>=max[2]){
                max[0]=max[1];
                max[1]=max[2];
                max[2]=temp;
            }
            else if(temp>=max[1]){
                max[0]=max[1];
                max[1]=temp;
            }
            else if(temp>=max[0]){
                max[0]=temp;
            }
            if(temp<=min[1]){
                min[0]=min[1];
                min[1]=temp;
            }
            else if(temp<=min[0]){
                min[0]=temp;
            }
        }
        return Math.max(min[0]*min[1],max[0]*max[1])*max[2];
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n log n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 根据题意，结果必然是最大的三个数相乘或者最大的数跟最小的两个数相乘的最大值
     *   2.2 排序数组
     *   2.3 找到最大的三个数或者最小的两个数并依照2.1相乘对比返回结果
     * 3.提交记录
     *   3.1 力扣中耗时21ms,消耗39MB内存
     *   3.2 leetcode中耗时ms,消耗MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n log n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according topic，result must contains maximum number,and other two number,it depends on multipart result with last two and first two number
     *     2.2 sort array
     *     2.3 get last three number and last number and first two number,multipart it and compare and return
     * 3.About submit record
     *     3.1 21ms and 39MB memory in LeetCode China
     *     3.2 17ms and 39.3MB memory in LeetCode
     * 4.Q&A
     *
     * @param nums
     * @return
     */
    public int maximumProductBySort(int[] nums) {
        if(nums==null||nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        int length=nums.length;
        int res=Math.max(nums[length-2]*nums[length-3],nums[0]*nums[1])*nums[length-1];
        return res;
    }

}
