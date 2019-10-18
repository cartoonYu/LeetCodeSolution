package String;

/**
 * Problem
 *     165.Compare Version Numbers
 *     https://leetcode.com/problems/compare-version-numbers/
 *     https://leetcode-cn.com/problems/compare-version-numbers/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution165 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 这个解法基于快慢指针
     *   2.2 定义四个指针分别形成两个版本的左右边界
     *   2.3 移动快指针知道快指针上的字符为.
     *   2.4 根据当前的快慢指针切割子串，转换成integer然后对比
     *   2.5 将慢指针移向快指针的下一位置
     * 3.提交记录
     *   3.1 力扣中耗时1ms,消耗34.1MB内存
     *   3.2 leetcode中耗时1ms,消耗34.2MB内存
     * 4.Q&A
     *   4.1 Q:两种解法的差异？
     *       A:我觉得差异在于切割子串的方式，split方法会循环对比regex并调用substring，
     *         而快慢指针的解法只需要移动快指针
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on fast-slow pointer
     *     2.2 define four pointer which are two version's left and right border
     *     2.3 move fast pointer util character in fast pointer is .
     *     2.4 cut string which is rely on fast and slow pointer,change it into integer and compare
     *     2.5 move slow pointer to fast+1
     * 3.About submit record
     *     3.1 1ms and 34.1MB memory in LeetCode China
     *     3.2 1ms and 34.2MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:the difference between two solution?
     *         A:I think the difference is the process of form substring,function split use loop and substring to form,
     *           fast-slow pointer only need to move pointer.
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion2(String version1, String version2) {
        if(version1.length()==0||version2.length()==0){
            return 0;
        }
        int len1=version1.length(),len2=version2.length();
        int i=0,j=0,k,l,temp1,temp2;
        while(i<len1||j<len2){
            k=i;
            l=j;
            while(k<len1&&version1.charAt(k)!='.'){
                k++;
            }
            while(l<len2&&version2.charAt(l)!='.'){
                l++;
            }
            temp1=k==i?0:Integer.valueOf(version1.substring(i,k));
            temp2=l==j?0:Integer.valueOf(version2.substring(j,l));
            if(temp1>temp2){
                return 1;
            }
            else if(temp1<temp2){
                return -1;
            }
            i=k+1;
            j=l+1;
        }
        return 0;
    }

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为O(n^2)
     *   1.2 空间负责度为O(n)
     * 2.我的解题思路
     *   2.1 根据.切割字符串
     *   2.2 将所有字串转换成数字对比
     * 3.提交记录
     *   3.1 力扣中耗时3ms,消耗34.1MB内存
     *   3.2 leetcode中耗时1ms,消耗34.2MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n^2)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 split version into array by .
     *     2.2 change every substring into integer and compare
     * 3.About submit record
     *     3.1 3ms and 34.1MB memory in LeetCode China
     *     3.2 1ms and 34.2MB memory in LeetCode
     * 4.Q&A
     *
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion1(String version1, String version2) {
        if(version1.length()==0||version2.length()==0){
            return 0;
        }
        String[] v1=version1.split("\\."),v2=version2.split("\\.");
        int len1=v1.length,len2=v2.length,len=Math.max(len1,len2);
        int temp1,temp2;
        for(int i=0;i<len;i++){
            temp1=i<len1?Integer.valueOf(v1[i]):0;
            temp2=i<len2?Integer.valueOf(v2[i]):0;
            if(temp1<temp2){
                return -1;
            }
            else if(temp1>temp2){
                return 1;
            }
        }
        return 0;
    }
}
