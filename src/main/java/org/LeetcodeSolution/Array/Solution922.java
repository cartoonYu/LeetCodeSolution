package org.LeetcodeSolution.Array;

/**
 * Problem
 *     922.Sort Array By Parity II/按奇偶排序数组 II
 *     https://leetcode.com/problems/sort-array-by-parity-ii/
 *     https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution922 {

    /**
     * 1.关于复杂度
     *  1.1 时间复杂度为O(n)
     *  1.2 空间负责度为O(1)
     * 2.我的解题思路
     *  2.1 定义奇偶指针分别指向奇数索引以及偶数索引
     *  2.2 循环遍历数组直到任意一个指针指向索引大于数组长度，有两个情况
     *    2.2.1 奇数指针指向元素为奇数，指针自增2
     *    2.2.2 偶数指针指向元素为偶数，指针自增2
     *    2.2.3 如果两个指针都没有大于数组长度，交换他们指向的元素
     * 3.提交记录
     *  3.1 力扣中耗时5ms,消耗39.4MB内存
     *  3.2 leetcode中耗时2ms,消耗40.6MB内存
     * 4.Q&A
     *
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define two pointer which point to odd number and even number apart
     *     2.2 circulate until any pointer beyond A.length,there have two condition
     *          2.2.1 odd pointer is point to odd number,odd pointer increases 2
     *          2.2.2 even pointer is point to even number,even pointer increases 2
     *          2.2.3 if two pointer are both in A.length,swap their element
     * 3.About submit record
     *     3.1 5ms and 39.4MB memory in LeetCode China
     *     3.2 2ms and 40.6MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int[] sortArrayByParityIIWithTwoPointer(int[] A) {
        if(A==null||A.length<2){
            return A;
        }
        int i=0,j=1,length=A.length;
        while(i<length&&j<length){
            while(i<length&&A[i]%2==0){
                i+=2;
            }
            while(j<length&&A[j]%2!=0){
                j+=2;
            }
            if(i<length&&j<length){
                int temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        return A;
    }


    /**
     * 1.关于复杂度
     *  1.1 时间复杂度为O(n)
     *  1.2 空间负责度为O(1)
     * 2.我的解题思路
     *  2.1 定义奇偶指针分别指向奇数索引以及偶数索引，定义辅助数组
     *  2.2 循环遍历数组，有两个情况
     *    2.2.1 当前元素为奇数，辅助数组的奇数指针所指元素等于当前元素，指针自增2
     *    2.2.2 当前元素为偶数，辅助数组的偶数指针所指元素等于当前元素，指针自增2
     * 3.提交记录
     *  3.1 力扣中耗时5ms,消耗51MB内存
     *  3.2 leetcode中耗时2ms,消耗41.7MB内存
     * 4.Q&A
     *
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define two pointer which point to odd number and even number apart and a array to store compare result
     *     2.2 circulate to go though array,there have two condition
     *          2.2.1 current element is odd number,set data[j]=current element and odd pointer increases 2
     *          2.2.2 current element is even number,set data[i]=current element and even pointer increases 2
     *
     * 3.About submit record
     *     3.1 5ms and 51MB memory in LeetCode China
     *     3.2 2ms and 41.7MB memory in LeetCode
     * 4.Q&A
     * @param A
     * @return
     */
    public int[] sortArrayByParityIIWithAuxiliaryArray(int[] A) {
        if(A==null||A.length<2){
            return A;
        }
        int i=0,j=1,length=A.length;
        int[] data=new int[length];
        for(int k=0;k<length;k++){
            if(A[k]%2==0){
                data[i]=A[k];
                i+=2;
            }
            else{
                data[j]=A[k];
                j+=2;
            }
        }
        return data;
    }
}
