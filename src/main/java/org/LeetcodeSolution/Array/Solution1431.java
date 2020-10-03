package org.LeetcodeSolution.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem
 *     1431.Kids With the Greatest Number of Candies
 *     https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 *     https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1431 {

    /**
     * 1. 关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(1)
     * 2. 我的解题思路
     *   2.1 获取数组最大元素
     *   2.3 对比 extraCandies 与当前元素相加的结果以及最大值，记录对比结果
     * 3. 提交记录
     *   3.1 力扣中耗时1ms,消耗39.9MB内存
     *   3.2 leetcode中耗时0ms,消耗39MB内存
     * 4. Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 get maximum element of array
     *     2.2 compare current element plus extraCandies with maximum element and record compare result
     * 3.About submit record
     *     3.1 1ms and 39.9MB memory in LeetCode China
     *     3.2 0ms and 39MB memory in LeetCode
     * 4.Q&A
     *
     * @param candies
     * @param extraCandies
     * @return
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if(candies == null || candies.length == 0){
            return Collections.emptyList();
        }
        int max = candies[0];
        for(int i = 1, length = candies.length; i < length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        List<Boolean> res = new ArrayList<>(candies.length);
        for(int can : candies){
            res.add(can + extraCandies >= max);
        }
        return res;
    }
}
