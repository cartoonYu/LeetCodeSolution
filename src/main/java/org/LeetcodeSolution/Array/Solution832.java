package org.LeetcodeSolution.Array;

/**
 * Problem
 *     832.Flipping an Image
 *     https://leetcode.com/problems/flipping-an-image/
 *     https://leetcode-cn.com/problems/flipping-an-image/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution832 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n^2)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 循环遍历矩阵的每一行
     *        2.1.1 定义两个从左到右和从右到左的指针
     *        2.1.2 使用 2.1.1 的指针遍历列，交换并反转元素
     *        2.1.3 如果当前的左指针等于右指针，表示当前列具有奇数个元素，反转当前指针
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗40.2MB内存
     *   3.2 leetcode中耗时0ms,消耗36.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate matrix row
     *         2.1.1 define two pointer which will circulate from left to right and invert
     *         2.1.2 use 2.1.1 pointer to swap and invert element util left>=right
     *         2.1.3 if left=right,it mean current row has an odd number element,invert current element
     * 3.About submit record
     *     3.1 1ms and 40.2MB memory in LeetCode China
     *     3.2 0ms and 36.8MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int[][] flipAndInvertImage(int[][] A) {
        if(A==null||A.length==0){
            return A;
        }
        int left,right;
        for(int i=0,length=A.length;i<length;i++){
            left=0;
            right=A[i].length-1;
            while(left<right){
                swap(A,i,left,right);
                change(A,i,left++);
                change(A,i,right--);
            }
            if(left==right){
                change(A,i,left);
            }
        }
        return A;
    }

    private void change(int[][] A,int row,int column){
        if(A[row][column]==0){
            A[row][column]=1;
        }
        else{
            A[row][column]=0;
        }
    }

    private void swap(int[][] A,int row,int left,int right){
        int temp=A[row][left];
        A[row][left]=A[row][right];
        A[row][right]=temp;
    }
}
