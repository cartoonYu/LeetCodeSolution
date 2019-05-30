/**
 * Problem
 *      509.Fibonacci Number
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution509 {

    private int[] nums;

    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 this solution is base on memo dynamic planning
     *     2.2 cause 0 ≤ N ≤ 30,so I define a array whose length is 31
     *     2.3 define a end condition nums[N]!=0 or N==0||N==1 to stop recursion
     *     2.4 cal nums[i] with a recursion nums[N]=fib(N-1)+fib(N-2);
     *         (cause every value of array are recorded,so it can greatly shorten cal's time)
     *     2.5 return nums[N]
     * 3.About submit record
     *     3.1 0ms and 32.5MB memory in LeetCode China
     *     3.2 0ms and 31.7MB memory in LeetCode
     * 4.Q&A
     * @param N
     * @return
     */
    public int fib(int N) {
        if(nums[N]!=0){
            return nums[N];
        }
        if(N==0||N==1){
            return N;
        }
        nums[N]=fib(N-1)+fib(N-2);
        return nums[N];
    }

    public Solution509(){
        nums=new int[31];
    }

}
