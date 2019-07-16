import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *      1.Two Sum
 *      https://leetcode.com/problems/two-sum/
 *      https://leetcode-cn.com/problems/two-sum/solution/
 * Grade of difficulty
 *      Easy
 * Related topics
 *      None
 * @author cartoon
 * @version 1.0
 */
public class Solution1 {

    /**
     *
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个哈希表（相减结果作为key，索引作为value）对中间结果进行缓存
     *     2.2 循环遍历数组，用目标值减去当前元素
     *          2.2.1 若哈希表内有当前key，取出索引并与当前索引组成数组返回
     *          2.2.2 若哈希表内没有当前key，放入结果以及索引，target恢复原状
     * 3.提交记录
     *     3.1 力扣中耗时8ms,消耗39MB内存
     *     3.2 leetcode中耗时2ms,消耗38.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 use a hashMap to cache calculate result
     *     2.2 circulate once,divide target with current element,there have two condition
     *         2.2.1 hashMap hasn't key which equals target,put calculate result to map and restore target
     *         2.2.2 hashMap has key,return value from hashMap and current index
     * 3.About submit record
     *     3.1 8ms and 39MB memory in LeetCode China
     *     3.2 2ms and 38.3MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0,length=nums.length;i<length;i++){
            target-=nums[i];
            if(map.containsKey(target)){
                int[] res=new int[2];
                res[0]=map.get(target);
                res[1]=i;
                return res;
            }
            else{
                map.put(nums[i],i);
                target+=nums[i];
            }
        }
        return null;
    }


    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n^2)
     *   1.2 空间负责度为O(1)
     * 2.我的解题思路
     *   2.1 双重循环遍历数组
     *       2.1.1 若遍历中两个元素相加等于target，返回索引
     * 3.提交记录
     *   3.1 力扣中耗时45ms,消耗38.1MB内存
     *   3.2 leetcode中耗时27ms,消耗38.5MB内存
     * Q&A
     * 1.About Complexity
     *   1.1 Time Complexity is O(n^2)
     *   1.2 Space Complexity is O(1)
     * 2.how I solve
     *   2.1 circle twice to add two num in the array
     * 3.About submit record
     *   3.1 27ms and 38.5MB memory in LeetCode China
     *   3.2 27ms and 38.5MB memory in LeetCode
     * 4.Q&A
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] a=new int[2];
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if((nums[j]+temp)==target){
                    a[0]=i;
                    a[1]=j;
                    break;
                }
            }
            if(a[0]!=0||a[1]!=0){
                break;
            }
        }
        return a;
    }
}
