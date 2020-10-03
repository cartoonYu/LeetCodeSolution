package org.LeetcodeSolution.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem
 *     1496.Path Crossing
 *     https://leetcode.com/problems/path-crossing/
 *     https://leetcode-cn.com/problems/path-crossing/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1496 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义哈希表判断是否含有相交路径，定义两个临时变量存储当前位置
     *   2.2 循环遍历给定路径中所有方向，按照题目要求移动两个临时变量，利用形成的临时字符串判断hash内是否有相交的路径
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 39.2MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.7MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a hash to judge whether has crossing path, define two temp variable to store current situation
     *     2.2 circulate path with every character, move temp variable by topic meaning, form a string and judge whether hash contains current string
     * 3.About submit record
     *     3.1 1ms and 39.2MB memory in LeetCode China
     *     3.2 1ms and 39.7MB memory in LeetCode
     * 4.Q&A
     * @param path
     * @return
     */
    public boolean isPathCrossing(String path) {
        char[] points = path.toCharArray();
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        set.add("00");
        for(char point : points){
            switch(point){
                case 'N':{
                    y++;
                    break;
                }
                case 'S':{
                    y--;
                    break;
                }
                case 'E':{
                    x++;
                    break;
                }
                case 'W':{
                    x--;
                    break;
                }
            }
            StringBuilder builder = new StringBuilder();
            builder.append(x).append(y);
            String temp = builder.toString();
            if(set.contains(temp)){
                return true;
            } else{
                set.add(temp);
            }
        }
        return false;
    }
}
