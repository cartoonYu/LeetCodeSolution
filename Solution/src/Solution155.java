import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem
 *      155.Min Stack
 *      https://leetcode.com/problems/min-stack/
 *      https://leetcode-cn.com/problems/min-stack/
 * Grade of difficulty
 *      Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution155 {

    /**
     * 1.关于复杂度
     *     1.1 时间复杂度为O(1)
     *     1.2 空间负责度为O(1)
     * 2.我的解题思路
     *     2.1 定义两个栈存储入栈元素以及最小元素
     *     2.2 push函数，它涉及一个关于当前插入元素是否小于最小栈的栈顶元素的判断
     *     2.3 pop函数，对比最小栈的栈顶元素以及主栈栈顶元素决定出栈的元素
     *     2.4 top函数，直接返回主栈的栈顶元素
     *     2.5 getMin函数，返回最小栈的栈顶元素
     * 3.提交记录
     *     3.1 力扣中耗时104ms,消耗71.6MB内存
     *     3.2 leetcode中耗时46ms,消耗40.5MB内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is O(1)
     *     1.2 Space Complexity is O(1)
     * 2.how I solve
     *     2.1 define two stack to cache num record and min num record
     *     2.2 function push,it involved a judgement which is to judge whether the insert element is smaller than min stack's top element
     *     2.2 function pop,compare min stack's top element to main stack's top element to judge whether pop min stack
     *     2.3 function top,return main stack's top element directly
     *     2.4 function getMin,return min stack's top element directly
     * 3.About submit record
     *     3.1 104ms and 71.6MB memory in LeetCode China
     *     3.2 46ms and 40.5MB memory in LeetCode
     * 4.Q&A
     *     4.1 Q:Why did you compare min stack's top element's intValue to main stack's top element's intValue?
     *         A:it involves boxing and unboxing.In collection,it stores object not basic data type,
     *           if compare two object directly,it compare memory address in fact
     */
    private Deque<Integer> main;

    private Deque<Integer> min;

    /** initialize your data structure here. */
    public Solution155() {
        main=new LinkedList<>();
        min=new LinkedList<>();
    }

    public void push(int x) {
        main.addFirst(x);
        if(min.size() == 0 || min.peekFirst() >= x){
            min.addFirst(x);
        }
    }

    public void pop() {
        if(min.size()!=0&&min.peekFirst().intValue()==main.peekFirst().intValue()){
            min.removeFirst();
        }
        if(main.size()!=0){
            main.removeFirst();
        }
    }

    public int top() {
        return main.size()==0?0:main.peekFirst();
    }

    public int getMin() {
        return min.size()==0?0:min.peekFirst();
    }
}
