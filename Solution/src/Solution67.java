/**
 * Problem
 *      67.Add Binary
 *      https://leetcode.com/problems/add-binary/
 *      https://leetcode-cn.com/problems/add-binary/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution67 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2.我的解题思路
     *     2.1 定义一个数组存储结果
     *     2.2 三指针统计每一个索引上1的位数
     *     2.3 循环按照规律改变1的位数以及进位
     *     2.4 返回目标字符串
     * 3.提交记录
     *     3.1 力扣中耗时2ms,消耗36.1MB内存
     *     3.2 leetcode中耗时1ms,消耗36MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to cache result
     *     2.2 use three points to static the digits of 1
     *     2.3 circulate to shift array's value
     *     2.4 change array to string to return
     * 3.About submit record
     *     3.1 2ms and 36.1MB memory in LeetCode China
     *     3.2 1ms and 36MB memory in LeetCode
     * 4.Q&A
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        char[] res=new char[(a.length()>b.length()?a.length():b.length())+1];
        int i=a.length()-1,j=b.length()-1,k=res.length-1;
        res[0]='0';
        while(i>=0||j>=0){
            if(i<0){
                res[k--]=b.charAt(j--);
            }
            else{
                if(j<0){
                    res[k--]=a.charAt(i--);
                }
                else{
                    char c1=a.charAt(i--);
                    char c2=b.charAt(j--);
                    if((c1=='1'&&c2=='0')||(c1=='0'&&c2=='1')){
                        res[k--]='1';
                    }
                    else{
                        if(c1=='1'&&c2=='1'){
                            res[k--]='2';
                        }
                        else{
                            res[k--]='0';
                        }
                    }
                }
            }
        }

        for(int x=res.length-1;x>=1;x--){
            if(res[x]=='2'){
                res[x]='0';
                res[x-1]+=1;
            }
            if(res[x]=='3'){
                res[x]='1';
                res[x-1]+=1;
            }
        }
        String str=new String(res);
        if(res[0]=='0'){
            return str.substring(1);
        }
        else {
            return str;
        }
    }
}
