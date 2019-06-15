/**
 * Problem
 *      63.Unique Paths II
 * Grade of difficulty
 *      Medium
 * Related topics
 *      62.Unique Paths
 * @author cartoon
 * @version 1.0
 */
public class Solution63 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 by analyzing,this topic has five condition
     *          2.1.1 when i=0 and j=0,temp=1,because it only haa one route to reach
     *          2.1.2 when obstacleGrid[i][j]==1,it represent there has a obstacle,so temp=0
     *          2.1.3 when i=0,temp=temp[i][j-1]
     *          2.1.4 when j=0,temp[i][j]=temp[i-1][j]
     *          2.1.5 other condition,temp[i][j]=temp[i-1][j]+temp[i][j-1]
     *     2.3 use double circulate with i and j, calculate temp
     *     2.4 cause we have no idea about obstacleGrid's information,but the solution should return last element in horizontal and vertical,
     *          so return temp[obstacleGrid.length-1][obstacleGrid[obstacleGrid.length-1].length-1]
     * 3.About submit record
     *     3.1 1ms and 32.4MB memory in LeetCode China
     *     3.2 0ms and 31.8MB memory in LeetCode
     * 4.Q&A
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null||obstacleGrid.length==0){
            return 0;
        }
        int length=obstacleGrid.length;
        int[][] temp=new int[length][];
        for(int i=0;i<length;i++){
            temp[i]=new int[obstacleGrid[i].length];
            for(int j=0,size=obstacleGrid[i].length;j<size;j++){
                if(obstacleGrid[i][j]==1){
                    temp[i][j]=0;
                    continue;
                }
                if(i==0&&j==0){
                    temp[i][j]=1;
                    continue;
                }
                if(i==0){
                    temp[i][j]=temp[i][j-1];
                    continue;
                }
                if(j==0){
                    temp[i][j]=temp[i-1][j];
                    continue;
                }
                temp[i][j]=temp[i-1][j]+temp[i][j-1];
            }
        }
        return temp[obstacleGrid.length-1][obstacleGrid[obstacleGrid.length-1].length-1];
    }
}
