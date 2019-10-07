package Greedy;

/**
 * Problem
 *     135.Candy
 *     https://leetcode.com/problems/candy/
 *     https://leetcode-cn.com/problems/candy/
 * Grade of difficulty
 *     Hard
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution135 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个数组暂存计算结果，因为第一个人没有左边的人，初始化temp[0]=1
     *     2.2 循环1到n，对比当前元素以及左边的元素
     *         2.2.1 如果当前元素大于左元素，temp[current]=temp[current-1]
     *         2.2.2 其余情况，temp[current]=1
     *     2.3 循环n-2到0，对比元素以及temp，如果ratings[current]>ratings[right]&&temp[current]<=temp[right]，temp[current]=temp[current+1]+1
     *     2.4 循环相加temp中的所有元素
     * 3.提交记录
     *     3.1 力扣中耗时6ms,消耗49.9MB内存
     *     3.2 leetcode中耗时2ms,消耗39.6MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to cache result,init temp[0]=1 cause it haven't left element
     *     2.2 circulate 1 to n,compare current element and its left element
     *              2.2.1 if current is bigger than its left element,temp[current]=temp[current-1]
     *              2.2.2 other condition,temp[current]=1
     *     2.3 circulate n-2 to 0,compare element and temp,if ratings[current]>ratings[right]&&temp[current]<=temp[right]
     *     2.4 sum all element from temp and return
     * 3.About submit record
     *     3.1 6ms and 49.9MB memory in LeetCode China
     *     3.2 2ms and 39.6MB memory in LeetCode
     * 4.Q&A
     * @param ratings
     * @return
     */
    public int candy(int[] ratings) {
        if(ratings==null||ratings.length==0){
            return 0;
        }
        int[] temp=new int[ratings.length];
        int length=ratings.length;
        temp[0]=1;
        for(int i=1;i<length;i++){
            if(ratings[i]>ratings[i-1]){
                temp[i]=temp[i-1]+1;
            }
            else{
                temp[i]=1;
            }
        }
        for(int i=length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]&&temp[i]<=temp[i+1]){
                temp[i]=temp[i+1]+1;
            }
        }
        int res=0;
        for(int num:temp){
            res+=num;
        }
        return res;
    }
}
