/**
 * Problem
 *      62.Unique Paths
 * Grade of difficulty
 *      Medium
 * Related topics
 *      63.Unique Paths II
 * @author cartoon
 * @version 1.0
 */
public class Solution62 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 by analyzing,this topic has two condition
     *          2.1.1 when i=0 or j=0,temp=1,because it only haa one route to reach
     *          2.1.2 cause the topic limit robot's walk way,so temp=temp[i-1][j](from the top)+temp[i][j-1](from the left)
     *     2.3 use double circulate with i and j, calculate temp
     *     2.4 return temp[m-1][n-1](the last element in m and n)
     * 3.About submit record
     *     3.1 1ms and 32.4MB memory in LeetCode China
     *     3.2 0ms and 31.8MB memory in LeetCode
     * 4.Q&A
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths(int m, int n) {
        int[][] temp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    temp[i][j]=1;
                    continue;
                }
                temp[i][j]=temp[i-1][j]+temp[i][j-1];
            }
        }
        return temp[m-1][n-1];
    }
}
