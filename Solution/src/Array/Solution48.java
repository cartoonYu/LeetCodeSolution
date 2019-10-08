package Array;

/**
 * Problem
 *     48.Rotate Image
 *     https://leetcode.com/problems/rotate-image/
 *     https://leetcode-cn.com/problems/rotate-image/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution48 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 honestly,this solution is base on my discover patterns
     *     2.2 horizontal flip source matrix
     *     2.3 diagonal reversal matrix
     * 3.About submit record
     *     3.1 0ms and 35.9MB memory in LeetCode China
     *     3.2 0ms and 36.4MB memory in LeetCode
     * 4.Q&A
     * @param matrix
     * @return
     */
    public void rotate(int[][] matrix) {
        if(matrix==null||matrix.length<2){
            return;
        }
        int n=matrix.length;
        for(int i=0,j=n-1;i<j;i++,j--){
            for(int k=0;k<n;k++){
                swap(matrix,i,k,j,k);
            }
        }
        int temp1,temp2;
        for(int j=1;j<n;j++){
            temp1=0;
            temp2=j;
            while(temp2>temp1){
                swap(matrix,temp1,temp2,temp2,temp1);
                temp1++;
                temp2--;
            }
        }
        for(int j=1;j<n;j++){
            temp1=n-1;
            temp2=j;
            while(temp1>temp2){
                swap(matrix,temp1,temp2,temp2,temp1);
                temp1--;
                temp2++;
            }
        }
    }


    private void swap(int[][] matrix,int i1,int j1,int i2,int j2){
        int temp=matrix[i1][j1];
        matrix[i1][j1]=matrix[i2][j2];
        matrix[i2][j2]=temp;
    }
}
