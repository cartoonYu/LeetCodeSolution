package String;

/**
 * Problem
 *     151.Reverse Words in a String
 *     https://leetcode.com/problems/reverse-words-in-a-string/
 *     https://leetcode-cn.com/problems/reverse-words-in-a-string/
 * Grade of difficulty
 *     Medium
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution151 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(n)
     *     1.2 空间负责度为O(n)
     * 2. 我的解题思路
     *     2.1 根据空格分割源字符串
     *     2.2 倒序遍历切割数组
     *         2.2.1 如果当前元素不是"",append
     *         2.2.2 当前元素不是最后一个，append一个空格
     * 3.提交记录
     *     3.1 力扣中耗时4ms,消耗40.6MB内存
     *     3.2 leetcode中耗时1ms,消耗37.8MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 split source string with space condition
     *     2.2 circulate to traverse split array from tail to head
     *         2.2.1 if current element isn't "",append it
     *         2.2.2 if current index isn't 0,append space
     * 3.About submit record
     *     3.1 4ms and 40.6MB memory in LeetCode China
     *     3.2 1ms and 37.8MB memory in LeetCode
     * 4.Q&A
     *
     * @param s
     * @return
     */
    public String reverseWordsBySplit(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        String[] strs=s.trim().split(" ");
        StringBuilder builder=new StringBuilder();
        for(int i=strs.length-1;i>-1;i--){
            if(!strs[i].equals("")){
                builder.append(strs[i].trim());
                if(i!=0){
                    builder.append(' ');
                }
            }
        }
        return builder.toString();
    }

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a StringBuilder to cache final result,a StringBuilder to cache calculate result
     *     2.2 change source string to char array for better operate
     *     2.3 circulate char array from tail to head
     *         2.3.1 current element and next element both are space,use a circulation to skip them
     *         2.3.2 current element is space,skip it(cause I append space in other condition)
     *         2.3.3 current element is letter and next element is space,append current letter and translate it and append space
     *         2.3.4 other condition(I think it may be a letter only),append it
     *     2.4 if temp stringBuilder's length isn't 0,it means we have residual letter in it,reverse it and append
     *     2.5 judge if last element is space,and return appropriate String
     * 3.About submit record
     *     3.1 14ms and 41.6MB memory in LeetCode China
     *     3.2 4ms and 38.5 MB memory in LeetCode
     * 4.Q&A
     * @param s
     * @return
     */
    public String reverseWordsByChars(String s) {
        if(s==null||s.length()==0){
            return s;
        }
        StringBuilder builder=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        s.trim();
        char[] chars=s.toCharArray();
        int index=s.length()-1;
        while(index>=0){
            while(index>0&&chars[index]==' '&&chars[index-1]==' '){
                index-=2;
            }
            if(index>=0){
                if(chars[index]==' '){
                    index--;
                }
                else if(index>0&&chars[index]!=' '&&chars[index-1]==' '){
                    temp.append(chars[index]);
                    builder.append(temp.reverse().toString()).append(' ');
                    temp=new StringBuilder();
                    index-=2;
                }
                else{
                    temp.append(chars[index--]);
                }
            }

        }
        if(temp.length()!=0){
            builder.append(temp.reverse().toString());
        }
        if(builder.length()>0&&builder.charAt(builder.length()-1)==' '){
            return builder.substring(0,builder.length()-1);
        }
        else{
            return builder.toString();
        }
    }
}
