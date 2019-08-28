/**
 * Problem
 *     463.Island Perimeter
 *     https://leetcode.com/problems/island-perimeter/
 *     https://leetcode-cn.com/problems/island-perimeter/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution463 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环遍历每个元素，若当前元素为1，检查左面以及上面的元素，并分开减2
     * 3.提交记录
     *     3.1 力扣中耗时16ms,消耗70.6MB内存
     *     3.2 leetcode中耗时6ms,消耗59MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate every element,if current element is 1,check the left and top element and subtract 2 apart
     * 3.About submit record
     *     3.1 16ms and 70.6MB memory in LeetCode China
     *     3.2 6ms and 59MB memory in LeetCode
     * 4.Q&A
     *
     * @param grid
     * @return
     */
    public int islandPerimeter(int[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        int res=0;
        int length=grid.length;
        int size=grid[0].length;
        for(int i=0;i<length;i++){
            for(int j=0;j<size;j++){
                if(grid[i][j]==1){
                    res+=4;
                    if(i>0&&grid[i-1][j]==1){
                        res-=2;
                    }
                    if(j>0&&grid[i][j-1]==1){
                        res-=2;
                    }
                }
            }
        }
        return res;
    }
}
