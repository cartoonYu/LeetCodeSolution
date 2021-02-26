package org.LeetcodeSolution.Greedy;

/**
 * Problem
 *     1710.Maximum Units on a Truck
 *     https://leetcode.com/problems/maximum-units-on-a-truck/
 *     https://leetcode-cn.com/problems/maximum-units-on-a-truck/
 * Grade of difficulty
 *     Easy/Medium/Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1710 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 定义一个数组统计每个单元箱子的个数
     *   2.2 遍历传入数组，统计箱子的个数并记录在 2.1 的数组
     *   2.3 倒序遍历 2.1 数组，减少卡车装载箱子的最大个数同时记录装载最大单元数并返回
     * 3.提交记录
     *   3.1 力扣中耗时 2ms,消耗 38.9MB 内存
     *   3.2 leetcode 中耗时 1ms,消耗 39.4MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a array to count number of box unit
     *     2.2 circulate box types array, put box number to 2.1 array
     *     2.3 reverse traverse 2.1 array, subtract truck size and plus result and return
     * 3.About submit record
     *     3.1 2ms and 38.9MB memory in LeetCode China
     *     3.2 1ms and 39.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param boxTypes
     * @param truckSize
     * @return
     */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] sortBoxs = new int[1001];
        for(int[] boxType : boxTypes){
            sortBoxs[boxType[1]] += boxType[0];
        }
        int res = 0;
        for(int index = 1000; index > 0; index--){
            if(truckSize == 0){
                break;
            } else{
                if(truckSize >= sortBoxs[index]){
                    res += index * (sortBoxs[index]);
                    truckSize -= sortBoxs[index];
                } else {
                    res += index * (truckSize);
                    break;
                }
            }
        }
        return res;
    }
}
