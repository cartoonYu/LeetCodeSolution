package Math;

import java.util.Random;

/**
 * Problem
 *      398.Random Pick Index
 *      https://leetcode.com/problems/random-pick-index/
 *      https://leetcode-cn.com/problems/random-pick-index/
 * Grade of difficulty
 *      Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution398 {

    private int[] nums;

    public Solution398(int[] nums) {
        this.nums=nums;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 这个解法基于tank arithmetic
     *     2.2 循环遍历数组获取传入target的index
     *         2.2.1 这个随机变量当target的index多于1的时候生成随机的index
     * 3.提交记录
     *     3.1 力扣中耗时224ms,消耗69MB内存
     *     3.2 leetcode中耗时93ms,消耗50.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 The solution is base on tank arithmetic
     *     2.2 use a 1 to nums.length to get target's index
     *         2.2.1 the random variable is to generate a num to locate index when the target's index is more than one
     * 3.About submit record
     *     3.1 224ms and 69MB memory in LeetCode China
     *     3.2 93ms and 50.5MB memory in LeetCode
     * 4.Q&A
     * @param target
     * @return
     */
    public int pick(int target) {
        Random r=new Random();
        int res=0;
        int flag=0;
        for(int i=0,size=nums.length;i<size;i++){
            if(nums[i]==target){
                flag++;
                if(r.nextInt(flag)==0){
                    res=i;
                }
            }
        }
        return res;
    }
}
