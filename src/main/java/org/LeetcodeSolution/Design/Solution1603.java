package org.LeetcodeSolution.Design;

/**
 * Problem
 *     1603.Design Parking System
 *     https://leetcode.com/problems/design-parking-system/
 *     https://leetcode-cn.com/problems/design-parking-system/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1603 {

    private int[] sites;

    public Solution1603(int big, int medium, int small) {
        sites = new int[]{0, big, medium, small};
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(1)
     *   1.2 空间负责度为 O(1)
     * 2.我的解题思路
     *   2.1 定义数组存储每种车位的数量
     *   2.2 当添加车辆时，判断当前车位数量是否为 0 并相减
     * 3.提交记录
     *   3.1 力扣中耗时 10ms,消耗 39.4MB 内存
     *   3.2 leetcode 中耗时 6ms,消耗 39.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define a array to store each car lot
     *     2.2 when add a car, judge current type lot is zero and subtract
     * 3.About submit record
     *     3.1 10ms and 39.4MB memory in LeetCode China
     *     3.2 6ms and 39.5MB memory in LeetCode
     * 4.Q&A
     * @param carType
     * @return
     */
    public boolean addCar(int carType) {
        if(sites[carType] <= 0){
            return false;
        }
        sites[carType]--;
        return true;
    }
}
