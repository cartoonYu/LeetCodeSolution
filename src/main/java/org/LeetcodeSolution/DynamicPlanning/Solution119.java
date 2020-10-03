package org.LeetcodeSolution.DynamicPlanning;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *     119.Pascal's Triangle II
 *     https://leetcode.com/problems/pascals-triangle-ii/
 *     https://leetcode-cn.com/problems/pascals-triangle-ii/
 * Grade of difficulty
 *     Easy
 * Related topics
 *     118.Pascal's Triangle
 * @author cartoon
 * @version 1.0
 */
public class Solution119 {

    private int[][] nums;

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(n^2)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划实现
     *     2.2 定义一个二维数组存储计算中的结果
     *     2.3 分别计算每个元素的值，计算过程参考我的解题仓库中的118题
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗33.2MB内存
     *     3.2 leetcode中耗时0ms,消耗35.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 use a two-dimensional array to cache calculate result
     *     2.3 calculate each element apart,calculate process is base on solution 118
     * 3.About submit record
     *     3.1 1ms and 33.2MB memory in LeetCode China
     *     3.2 0ms and 35.2MB memory in LeetCode
     * 4.Q&A
     * @param rowIndex
     * @return
     */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result=new ArrayList<>();
        nums=new int[rowIndex+1][rowIndex+1];
        int column=0;
        while(column<=rowIndex){
            result.add(getNum(rowIndex,column++,rowIndex));
        }
        return result;
    }

    private int getNum(int row,int column,int flag){
        if(row==0||column==0||column==flag){
            nums[row][column]=1;
        }
        if(nums[row][column]!=0){
            return nums[row][column];
        }
        nums[row][column]=getNum(row-1,column,flag-1)+getNum(row-1,column-1,flag-1);
        return nums[row][column];
    }
}
