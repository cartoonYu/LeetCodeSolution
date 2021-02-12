package org.LeetcodeSolution.Multithreading;

/**
 * Problem
 *     problem's topic and description
 *     https://leetcode.com/problems/print-in-order/
 *     https://leetcode-cn.com/problems/print-in-order/
 * Grade of difficulty
 *     Easy
 * Related topics
 * @author cartoon
 * @version 1.0
 */
public class Solution1114 {

    /**
     * 1.关于复杂度
     *   1.1 时间复杂度为 N/A
     *   1.2 空间负责度为 N/A
     * 2.我的解题思路
     *   2.1 定义一个整型变量控制线程的开启
     * 3.提交记录
     *   3.1 力扣中耗时 13ms,消耗 37.5MB 内存
     *   3.2 leetcode 中耗时 10ms,消耗 38.5MB 内存
     * 4.Q&A
     *
     * 1.About Complexity
     *     1.1 Time Complexity is N/A
     *     1.2 Space Complexity is N/A
     * 2.how I solve
     *     2.1 use a integer to mark whether thread should start
     * 3.About submit record
     *     3.1 13ms and 37.5MB memory in LeetCode China
     *     3.2 10ms and 38.5MB memory in LeetCode
     * 4.Q&A
     */
    static class Foo {

        private int count = 1;

        public Foo() {

        }

        public synchronized void first(Runnable printFirst) throws InterruptedException {
            while (count != 1) {
                wait();
            }
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            count++;
            notifyAll();
        }

        public synchronized void second(Runnable printSecond) throws InterruptedException {
            while(count != 2){
                wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            count++;
            notifyAll();
        }

        public synchronized void third(Runnable printThird) throws InterruptedException {
            while(count != 3){
                wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();
            count++;
            notifyAll();
        }
    }
}

class FirstRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("first");
    }
}

class SecondRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("second");
    }
}

class ThirdRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("third");
    }
}
