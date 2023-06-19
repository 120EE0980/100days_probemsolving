package StacksQueues;

import java.util.*;

public class Stacksqueues {
    //used in BFS ,DFS,store answer so far,particular group of elements for period of time;recursion programs in iteration
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(3);
        stack.push(34);
        stack.push(63);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        Queue<Integer> queue = new LinkedList<>();
        queue.add(7) ;
        queue.add(17) ;
        queue.add(27) ;
   //     System.out.println(queue.peek());//does not remove it but retrives head of queue
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        //Deque-insert and remove from both sides,null elements not allowed,faster than linkedlist and stack
        //not thread saved
        Deque<Integer> deque =new ArrayDeque<>(); // Arraydeque -resizable array implementation of deque interface

    }
}
