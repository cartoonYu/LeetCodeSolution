/**
 * Problem
 *      268.Missing Number
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution268 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 set a array temp whose length is nums.length
     *     2.2 circulate nums to use its value as array index and the value of index is 1
     *     2.3 circulate the set array,if temp[index]=0,this is result
     * 3.About submit record
     *     3.1 2ms and 41MB memory in LeetCode China
     *     3.2 0ms and 38.1MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] temp=new int[nums.length+1];
        for(int i=0,length=nums.length;i<length;i++){
            temp[nums[i]]+=1;
        }
        int result=0;
        for(int i=0,length=temp.length;i<length;i++){
            if(temp[i]==0){
                result=i;
                break;
            }
        }
        return result;
    }
}

