package org.LeetcodeSolution.String;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem
 *     1436.Destination City
 *     https://leetcode.com/problems/destination-city/
 *     https://leetcode-cn.com/problems/destination-city/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1436 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 获取所有起点并放在 hash set 中
     *   2.2 遍历所有路径，若终点城市不在起点的 set 上，返回该城市
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 38MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 38.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 get all start point and put them to hash set
     *     2.2 circulate paths, if destination city is not in start point set, return the city
     * 3.About submit record
     *     3.1 2ms and 38MB memory in LeetCode China
     *     3.2 1ms and 38.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param paths
     * @return
     */
    public String destCity(List<List<String>> paths) {
        Set<String> startPoints = new HashSet<>();
        for(List<String> path : paths){
            startPoints.add(path.get(0));
        }
        String res = null;
        for(List<String> path : paths){
            if(!startPoints.contains(path.get(1))){
                res = path.get(1);
                break;
            }
        }
        return res;
    }
}
