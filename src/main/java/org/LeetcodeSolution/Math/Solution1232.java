package org.LeetcodeSolution.Math;

/**
 * Problem
 *     1232.Check If It Is a Straight Line
 *     https://leetcode.com/problems/check-if-it-is-a-straight-line/
 *     https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1232 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 according to first and second point,calculate initial slope
     *     2.2 calculate remain point with first point slope,compare with 2.1 slope
     * 3.About submit record
     *     3.1 0ms and 38.3MB memory in LeetCode China
     *     3.2 0ms and 42MB memory in LeetCode
     * 4.Q&A
     * @param coordinates
     * @return
     */
    public boolean checkStraightLine(int[][] coordinates) {
        double flag,temp;
        if(coordinates[1][0]==coordinates[0][0]){
            flag=Integer.MIN_VALUE;
        }
        else{
            flag=(double)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        }
        for(int i=2,length=coordinates.length;i<length;i++){
            if(coordinates[i][0]==coordinates[0][0]){
                temp=Integer.MIN_VALUE;
            }
            else{
                temp=(double)(coordinates[i][1]-coordinates[0][1])/(coordinates[i][0]-coordinates[0][0]);
            }
            if(temp!=flag){
                return false;
            }
        }
        return true;
    }
}
