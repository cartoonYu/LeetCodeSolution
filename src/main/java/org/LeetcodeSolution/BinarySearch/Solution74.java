package org.LeetcodeSolution.BinarySearch;

/**
 * Problem
 *     74.Search a 2D Matrix
 *     https://leetcode.com/problems/search-a-2d-matrix/
 *     https://leetcode-cn.com/problems/search-a-2d-matrix/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution74 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(log(n*m))(n为矩阵的行数，m为矩阵的列数)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个算法基于二分查找
     *     2.2 定义两个指针遍历矩阵，像往常那样获取中间元素
     *     2.3 根据2.2中中间元素的获取，通过mid/column以及mid%column获取中间元素的x，y坐标
     *     2.4 像往常那样对比中间元素
     * 3.提交记录
     *     3.1 力扣中耗时1ms,消耗40.4MB内存
     *     3.2 leetcode中耗时0ms,消耗43.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(log(n*m))(n is matrix's row,m is matrix's column)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 this solution is base on binary search
     *     2.2 use two pointer to circulate matrix,get mid element as usual
     *     2.3 use 2.2 mid element,we take x y coordinate with mid/column and mid%column
     *     2.4 compare mid element as usual
     * 3.About submit record
     *     3.1 1ms and 40.4MB memory in LeetCode China
     *     3.2 0ms and 43.1MB memory in LeetCode
     * 4.Q&A
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0){
            return false;
        }
        int row=matrix.length,column=matrix[0].length;
        int left=0,right=row*column-1;
        int midx,midy;
        while(left<=right){
            int mid=left+((right-left)>>1);
            midx=mid/column;
            midy=mid%column;
            if(matrix[midx][midy]==target){
                return true;
            }
            else if(matrix[midx][midy]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
}
