package Array;

/**
 * Problem
 *     414.Third Maximum Number
 *     https://leetcode.com/problems/third-maximum-number/
 *     https://leetcode-cn.com/problems/third-maximum-number/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution414 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义三个整数缓存三个最大的数
     *   2.2 循环遍历数组，有4种情况
     *        2.2.1 max1==nums[i]||max2==nums[i]||max3==nums[i] ，表示当前元素为重复元素，跳过
     *        2.2.2 nums[i]>max3&&nums[i]>max1 ，轮流对比交换 max1 ，max2 ，max3
     *        2.2.3 nums[i]>max3&&nums[i]>max2 ，轮流对比交换 max2 ，max3
     *        2.2.4 nums[i]>max3 ，将当前元素放入 max3 中
     *   2.3 判断max3的值并返回适当的值
     * 3.提交记录
     *   3.1 力扣中耗时2ms,消耗36.9MB内存
     *   3.2 leetcode中耗时1ms,消耗36.1MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define three integer to cache three biggest number
     *     2.2 circulate from head to tail,there have 4 condition
     *             2.2.1 max1==nums[i]||max2==nums[i]||max3==nums[i],it means that there have repeating element in array,so I ignore it directly
     *             2.2.2 nums[i]>max3&&nums[i]>max1,transfer value from max1 to max3 in turn
     *             2.2.3 nums[i]>max3&&nums[i]>max2,tranfer value from max2 to max3
     *             2.2.4 nums[i]>max3,put current element to max3
     *     2.3 judge max3 value and returns the corresponding value
     * 3.About submit record
     *     3.1 2ms and 36.9MB memory in LeetCode China
     *     3.2 1ms and 36.1MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {
        if(nums==null){
            return 0;
        }
        if(nums.length<2){
            return nums[0];
        }
        long max1=Long.MIN_VALUE,max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;
        for(int i=0,length=nums.length;i<length;i++){
            if(max1==nums[i]||max2==nums[i]||max3==nums[i]){
                continue;
            }
            if(nums[i]>max3){
                if(nums[i]>max1){
                    max3=max2;
                    max2=max1;
                    max1=nums[i];
                }
                else{
                    if(nums[i]>max2){
                        max3=max2;
                        max2=nums[i];
                    }
                    else{
                        max3=nums[i];
                    }
                }
            }
        }
        if(max3==Long.MIN_VALUE){
            return (int)max1;
        }
        else{
            return (int)max3;
        }
    }
}
