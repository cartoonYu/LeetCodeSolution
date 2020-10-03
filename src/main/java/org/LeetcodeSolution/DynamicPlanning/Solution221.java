package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     221.Maximal Square
 *     https://leetcode.com/problems/maximal-square/
 *     https://leetcode-cn.com/problems/maximal-square/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution221 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个算法基于动态规划
     *     2.2 循环遍历矩阵，当前元素为1时，对应的array[i+1][j+1] is Math.min(temp[i][j-1],Math.min(temp[i-1][j-1],temp[i-1][j]))+1
     * 3.提交记录
     *     3.1 力扣中耗时10ms,消耗47.3MB内存
     *     3.2 leetcode中耗时4ms,消耗43.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic programming
     *     2.2 circulate whole matrix,if current element is 1,corresponding array[i+1][j+1] is Math.min(temp[i][j-1],Math.min(temp[i-1][j-1],temp[i-1][j]))+1
     * 3.About submit record
     *     3.1 10ms and 47.3MB memory in LeetCode China
     *     3.2 4ms and 43.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param matrix
     * @return
     */
    public int maximalSquare(char[][] matrix) {
        if(matrix==null||matrix.length==0){
            return 0;
        }
        int length=matrix.length,size=matrix[0].length;
        int res=0;
        int[][] temp=new int[length+1][size+1];
        int min;
        for(int i=1;i<=length;i++){
            for(int j=1;j<=size;j++){
                if(matrix[i-1][j-1]=='1'){
                    min=Math.min(temp[i][j-1],Math.min(temp[i-1][j-1],temp[i-1][j]));
                    temp[i][j]=min+1;
                    res=res>temp[i][j]?res:temp[i][j];
                }
            }
        }
        return res*res;
    }

}
