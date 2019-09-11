/**
 * Problem
 *     96.Unique Binary Search Trees
 *     https://leetcode.com/problems/unique-binary-search-trees/
 *     https://leetcode-cn.com/problems/unique-binary-search-trees/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution96 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n^2)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于一个公式：G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
     *     2.2 双重循环修改临时数组的值，外层循环为2到n，内层循环为1到外层循环的当前索引
     * 3.提交记录
     *     3.1 力扣中耗时0ms,消耗33.6MB内存
     *     3.2 leetcode中耗时0ms,消耗33MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on one rule:G(n) = G(0)*G(n-1)+G(1)*(n-2)+...+G(n-1)*G(0)
     *     2.2 use double circulation and a array to solve,outer circulation is 2 to n,inner circulation is 1 to outer circulation index
     * 3.About submit record
     *     3.1 0ms and 33.6MB memory in LeetCode China
     *     3.2 0ms and 33MB memory in LeetCode
     * 4.Q&A
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        if(n<2){
            return 1;
        }
        int[] temp=new int[n+1];
        temp[0]=1;
        temp[1]=1;
        for(int i=2,border=n+1;i<border;i++){
            for(int j=1;j<i+1;j++){
                temp[i]+=temp[j-1]*temp[i-j];
            }
        }
        return temp[n];
    }

}
