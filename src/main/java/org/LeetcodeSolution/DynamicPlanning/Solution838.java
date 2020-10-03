package org.LeetcodeSolution.DynamicPlanning;

/**
 * Problem
 *     838.Push Dominoes
 *     https://leetcode.com/problems/push-dominoes/
 *     https://leetcode-cn.com/problems/push-dominoes/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution838 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 这个解法基于动态规划
     *     2.2 从头到尾遍历数组得出倒向右边的所有力量分布
     *     2.3 从尾到头遍历数组利用倒向左边的力量中和右倒的力量
     *     2.4 利用力量分布重塑字符串
     * 3.提交记录
     *     3.1 力扣中耗时31ms,消耗49.6MB内存
     *     3.2 leetcode中耗时11ms,消耗38.4MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on dynamic planning
     *     2.2 go though from head to tail to calculate down to right power
     *     2.3 go though from tail to head to neutralize right power by down to left power
     *     2.4 form result string with power distribution
     * 3.About submit record
     *     3.1 31ms and 49.6MB memory in LeetCode China
     *     3.2 11ms and 38.4MB memory in LeetCode
     * 4.Q&A
     * @param dominoes
     * @return
     */
    public String pushDominoes(String dominoes) {
        if(dominoes==null||dominoes.length()<2){
            return dominoes;
        }
        char[] chars=dominoes.toCharArray();
        int[] temp=new int[chars.length];
        int length=chars.length;
        for(int i=0;i<length;i++){
            if(chars[i]=='.'&&i>0&&temp[i-1]>0){
                temp[i]=temp[i-1]+1;
            } else if(chars[i]=='L'){
                temp[i]=-1;
            } else if(chars[i]=='R'){
                temp[i]=1;
            }
        }
        for(int i=length-1;i>=0;i--){
            if(chars[i]=='.'){
                if(i<length-1&&temp[i+1]<0){
                    int num=temp[i]+temp[i+1]-1;
                    if(num>0||temp[i]<=0){
                        temp[i]=temp[i+1]-1;
                    } else if(num==0){
                        temp[i]=0;
                    }
                }
            }
        }
        for(int i=0;i<length;i++){
            if(temp[i]==0){
                chars[i]='.';
            } else if(temp[i]<0){
                chars[i]='L';
            } else{
                chars[i]='R';
            }
        }
        return new String(chars);
    }
}
