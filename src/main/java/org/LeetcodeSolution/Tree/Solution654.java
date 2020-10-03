package org.LeetcodeSolution.Tree;

import org.LeetcodeSolution.DataStructure.tree.BinaryTreeNode;

/**
 * Problem
 *     654.Maximum Binary Tree
 *     https://leetcode.com/problems/maximum-binary-tree/
 *     https://leetcode-cn.com/problems/maximum-binary-tree/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution654 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法一定程度上借鉴了分治思想
     *     2.2 找到当前区间的最大元素以及对应的索引，以最大值为值构建当前结点
     *     2.3 利用最大元素的左右区间分别递归构建左右子树
     * 3.提交记录
     *     3.1 力扣中耗时6ms,消耗49.1MB内存
     *     3.2 leetcode中耗时2ms,消耗38.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution borrows from the idea of divide mind
     *     2.2 find the max num of current section and record its index at the same time,build node with max num
     *     2.3 recurse to build left tree and right tree with current max num left side and right side
     * 3.About submit record
     *     3.1 6ms and 49.1MB memory in LeetCode China
     *     3.2 2ms and 38.1MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public BinaryTreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }

    private BinaryTreeNode construct(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        if(start==end){
            return new BinaryTreeNode(nums[start]);
        }
        int index=start,num=nums[start];
        for(int i=start+1;i<=end;i++){
            if(nums[i]>num){
                num=nums[i];
                index=i;
            }
        }
        BinaryTreeNode node=new BinaryTreeNode(num);
        node.left=construct(nums,start,index-1);
        node.right=construct(nums,index+1,end);
        return node;
    }
}
