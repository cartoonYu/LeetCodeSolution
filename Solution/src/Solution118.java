import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 *     118.Pascal's Triangle
 *     https://leetcode.com/problems/pascals-triangle/
 * Grade of difficulty
 *     Easy
 * Related topics
 *     119.Pascal's Triangle II
 * @author cartoon
 * @version 1.0
 */
public class Solution118 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n^2)
     * 2.how I solve
     *     2.1 define a double list to cache result
     *     2.2 use double circulation to calculate(i is present row,j is present column),there have three condition
     *          2.2.1 j=0,present current position is at left border,temp num=1
     *          2.2.2 j=i,present current position is at right border,temp num=1
     *          2.2.3 other condition,according to topic,temp num=source.get(j-1)+source.get(j);
     * 3.About submit record
     *     3.1 1ms and 32.6MB memory in LeetCode China
     *     3.2 0ms and 35.2MB memory in LeetCode
     * 4.Q&A
     * @param numRows
     * @return
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<i+1;j++){
                int num;
                if(j==0||j==i){
                    num=1;
                }
                else{
                    List<Integer> source=list.get(i-1);
                    num=source.get(j-1)+source.get(j);
                }
                temp.add(num);
            }
            list.add(temp);
        }
        return list;
    }
}
