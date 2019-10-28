package Array;

/**
 * Problem
 *     42.Trapping Rain Water
 *     https://leetcode.com/problems/trapping-rain-water/
 *     https://leetcode-cn.com/problems/trapping-rain-water/
 * Grade of difficulty
 *     Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution42 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 寻找最高点所在的索引
     *   2.2 从两边分别遍历至2.1的索引
     *       2.2.1 改变当前最大值或者计算当前值与最大值的差值
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗37.4MB内存
     *   3.2 leetcode中耗时1ms,消耗37.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 find the highest index
     *     2.2 circulate 1 to 2.1 index and array.length-2 to 2.1 index apart
     *         2.2.1 change temp max or calculate difference between temp max and current value
     * 3.About submit record
     *     3.1 1ms and 37.4MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if(height==null||height.length<=1){
            return 0;
        }
        int max=0,flag=0,length=height.length;
        for(int i=0;i<length;i++){
            if(height[i]>max){
                max=height[i];
                flag=i;
            }
        }
        int temp=height[0],res=0;
        for(int i=1;i<flag;i++){
            if(height[i]>temp){
                temp=height[i];
            }
            else{
                res+=temp-height[i];
            }
        }
        temp=height[length-1];
        for(int i=length-2;i>flag;i--){
            if(height[i]>temp){
                temp=height[i];
            }
            else{
                res+=temp-height[i];
            }
        }
        return res;
    }
}
