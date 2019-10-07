package Array;

/**
 * Problem
 *     200.Number of Islands
 *     https://leetcode.com/problems/number-of-islands/
 *     https://leetcode-cn.com/problems/number-of-islands/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution200 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n!)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 循环遍历每一个元素，有两种情况
     *         2.1.1 当前元素为1，深度遍历并改变相邻元素为0，自增result
     *         2.1.2 当前元素为0，继续下一遍历
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗42.3MB内存
     *     3.2 leetcode中耗时1ms,消耗41MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n!)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 circulate go though every element,there have two condition
     *         2.1.1 current element is 1,DFS to change behind element to 0,increase res
     *         2.1.2 current element is 0,keep going
     * 3.About submit record
     *     3.1 3ms and 42.3MB memory in LeetCode China
     *     3.2 1ms and 41MB memory in LeetCode
     * 4.Q&A
     *
     * @param grid
     * @return
     */
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0){
            return 0;
        }
        int res=0;
        for(int i=0,length=grid.length;i<length;i++){
            for(int j=0,size=grid[i].length;j<size;j++){
                if(grid[i][j]=='1'){
                    mark(grid,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    private void mark(char[][] grid,int i,int j){
        if(i<0||i==grid.length||j<0||j==grid[0].length||grid[i][j]!='1'){
            return;
        }
        grid[i][j]='0';
        mark(grid,i,j+1);
        mark(grid,i,j-1);
        mark(grid,i+1,j);
        mark(grid,i-1,j);
    }
}
