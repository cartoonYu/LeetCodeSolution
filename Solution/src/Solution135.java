/**
 * Problem
 *     135.Candy
 *     https://leetcode.com/problems/candy/
 * Grade of difficulty
 *     Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution135 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to cache result,init temp[0]=1 cause it haven't left element
     *     2.2 circulate 1 to n,compare current element and its left element
     *              2.2.1 if current is bigger than its left element,temp[current]=temp[current-1]
     *              2.2.2 other condition,temp[current]=1
     *     2.3 circulate n-2 to 0,compare element and temp,if ratings[current]>ratings[right]&&temp[current]<=temp[right]
     *     2.4 sum all element from temp and return
     * 3.About submit record
     *     3.1 6ms and 49.9MB memory in LeetCode China
     *     3.2 2ms and 39.6MB memory in LeetCode
     * 4.Q&A
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        if(ratings==null||ratings.length==0){
            return 0;
        }
        int[] temp=new int[ratings.length];
        int length=ratings.length;
        temp[0]=1;
        for(int i=1;i<length;i++){
            if(ratings[i]>ratings[i-1]){
                temp[i]=temp[i-1]+1;
            }
            else{
                temp[i]=1;
            }
        }
        for(int i=length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&temp[i]<=temp[i+1]){
                temp[i]=temp[i+1]+1;
            }
        }
        int res=0;
        for(int num:temp){
            res+=num;
        }
        return res;
    }
}
