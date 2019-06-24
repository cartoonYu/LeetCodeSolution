/**
 * Problem
 *      67.Add Binary
 *      https://leetcode.com/problems/add-binary/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution67 {

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to cache result
     *     2.2 use three points to static the digits of 1
     *     2.3 circulate to shift array's value
     *     2.4 change array to string to return
     * 3.About submit record
     *     3.1 5ms and 35MB memory in LeetCode China
     *     3.2 1ms and 35.1MB memory in LeetCode
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
        StringBuilder builder=new StringBuilder();
        if(res[0]!='0'){
            builder.append(res[0]);
        }
        for(int l=1;l<res.length;l++){
            builder.append(res[l]);
        }
        return builder.toString();
    }
}
