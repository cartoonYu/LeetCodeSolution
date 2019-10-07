package String;

import java.util.Arrays;

/**
 * Problem
 *     14.Longest Common Prefix/最长公共前缀
 *     https://leetcode.com/problems/longest-common-prefix/
 *     https://leetcode-cn.com/problems/longest-common-prefix/submissions/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution14 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n) (因为元素的长度是不确定的，无法得知准确的时间复杂度，所以我只用了遍历数组的时间复杂度)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 因为string有一个成员方法用于判断子串在父串上的位置，所以我们可以利用这个方法
     *     2.2 定义暂存字符串，并用数组中最小长度的字符串对它进行赋值
     *     2.3 从1开始遍历数组
     *         2.3.1 如果暂存不在当前元素的开始，去掉暂存最后一个字符再对比
     *     2.4 返回暂存字符串
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗35.4MB内存
     *     3.2 leetcode中耗时0ms,消耗37.3MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n) (cause element length is uncertain,I cant't get time complexity exactly，so I only use traverse array to fill it)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 cause string have a function indexOf to judge the child string is in the position of the parent string,so we can use it
     *     2.2 define a prefix pointer with the smallest string in array
     *     2.3 go though strs from 1 to its length
     *          2.1 if pointer isn't suit with current element completely,cut last character of pointer and keep compare
     *     2.4 return prefix pointer
     * 3.About submit record
     *     3.1 2ms and 35.4MB memory in LeetCode China
     *     3.2 0ms and 37.3MB memory in LeetCode
     * 4.Q&A
     * @param strs
     * @return
     */
    public String longestCommonPrefixWithoutSort(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String temp=strs[0];
        for(int i=0,length=strs.length;i<length;i++){
            if(strs[i].length()<temp.length()){
                temp=strs[i];
            }
        }
        for(int i=0,length=strs.length;i<length;i++){
            while(strs[i].indexOf(temp)!=0){
                temp=temp.substring(0,temp.length()-1);
            }
        }
        return temp;
    }

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(nlog n) (因为元素的长度是不确定的，无法得知准确的时间复杂度，所以我只用了排序的时间复杂度)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 利用系统自带库将数组进行排序
     *     2.2 因为题目要求求出最大前缀，这个最大前缀的长度不可能大于最小长度的元素(排序后的strs[0])
     *     2.3 所以根据2.2得出的结论，我们只需要对比第一个元素以及最后一个元素就可以了
     *     2.4 定义两个指针遍历2.3指定的元素，用stringBuilder进行拼接返回结果
     * 3.提交记录
     *     3.1 力扣中耗时3ms,消耗37.7MB内存
     *     3.2 leetcode中耗时1ms,消耗37.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(nlogn) (cause element length is uncertain,I cant't get time complexity exactly，so I only use sort operation to fill it)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 sort source array by element length ascending order
     *     2.2 cause need to get longest common prefix,
     *         so result can't be longer than the minimum length of element(strs[0] after sort),
     *     2.3 so use first element and last element to compare
     *     2.4 define two pointer to go though 2.3 element,and use a stringBuilder to append result
     * 3.About submit record
     *     3.1 3ms and 37.7MB memory in LeetCode China
     *     3.2 1ms and 37.5MB memory in LeetCode
     * 4.Q&A
     * @param strs
     * @return
     */
    public String longestCommonPrefixWithSort(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        StringBuilder builder=new StringBuilder();
        Arrays.sort(strs);
        String first=strs[0],last=strs[strs.length-1];
        int i=0,j=0;
        while(i<first.length()&&j<last.length()){
            if(first.charAt(i)==last.charAt(j)){
                builder.append(first.charAt(i));
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return builder.toString();
    }
}
