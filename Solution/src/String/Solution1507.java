package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem
 *     1507.Reformat Date
 *     https://leetcode.com/problems/reformat-date/
 *     https://leetcode-cn.com/problems/reformat-date/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1507 {

    private Map<String, String> months;

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 O(n)
     *   1.2 空间负责度为 O(n)
     * 2.我的解题思路
     *   2.1 以空格字符为依据切割字符串
     *   2.2 拼接 2.1 中数组最后一个元素，通过 hash 获取具体月份
     *   2.3 根据 day 的长度，判断是否拼接前导 0
     * 3.提交记录
     *   3.1 力扣中耗时 1ms,消耗 37.9MB 内存
     *   3.2 leetcode 中耗时 2ms,消耗 39.2MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 split date with space character, then get a date array
     *     2.2 append with last element from 2.1 array, get month from month hash
     *     2.3 depend on day's length, append with leading 0
     * 3.About submit record
     *     3.1 1ms and 37.9MB memory in LeetCode China
     *     3.2 2ms and 39.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param date
     * @return
     */
    public String reformatDate(String date) {
        String[] dates = date.split(" ");
        StringBuilder res = new StringBuilder();
        res.append(dates[2]).append("-").append(months.get(dates[1])).append("-");
        if(dates[0].length() == 4){
            res.append(dates[0], 0, 2);
        } else{
            res.append(0).append(dates[0], 0, 1);
        }
        return res.toString();
    }

    public Solution1507(){
        months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
    }
}
