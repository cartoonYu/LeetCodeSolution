/**
 * Problem
 *      268.Missing Number
 *      https://leetcode.com/problems/missing-number/
 *      https://leetcode-cn.com/problems/missing-number/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution268 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个长度为原数组长度+1的数组
     *     2.2 循环遍历原数组，用原数组的值作为定义数组的索引并赋值为1
     *     2.3 循环遍历定义数组，如果元素为0，则该索引就是缺失的数字
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗41MB内存
     *     3.2 leetcode中耗时0ms,消耗38.1MB内存
     * 4.Q&A
     *
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

