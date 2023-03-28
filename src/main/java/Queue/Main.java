package Queue;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        implementsQueue queue = new implementsQueue();

        /**
         * adding elements in Queue
         */

        Queue<Integer> queues = new LinkedList<>();
        queues.add(1);
        queues.add(2);
        queues.add(3);
        queues.add(4);
        queues.add(5);

        queue.addQueue(queues);

        /**
         * adding elements in Queue
         */

        Deque<Integer> deque = new LinkedList<>();

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);

        queue.addDequeue(deque);

        /**
         * adding elements in PriorityQueue
         */

        PriorityQueue<Integer> prique = new PriorityQueue<>();
        prique.add(1);
        prique.add(2);
        prique.add(3);
        prique.add(4);
        prique.add(5);

        queue.addPriorQue(prique);


        /**
         * adding strings in PriorityQueue
         */

        PriorityQueue<String> stringPrior = new PriorityQueue<>();
        stringPrior.add("John");
        stringPrior.add("Anna");
        stringPrior.add("Max");
        stringPrior.add("James");
        stringPrior.add("Ryan");

        queue.addStrPriorQue(stringPrior);


        /**
         * adding elements in ArrayDeque
         */

        Deque<Integer> intDeque = new ArrayDeque<>();

        intDeque.add(1);
        intDeque.add(2);
        intDeque.add(3);
        intDeque.add(4);
        intDeque.add(5);

        queue.addInt(intDeque);


        /**
         * removing elements until Queue is empty
         */


        Queue<Integer> intQueue = new LinkedList<>();

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);
        intQueue.add(4);
        intQueue.add(5);

        queue.removeQueue(intQueue);


        /**
         * removing elements until DeQueue is empty
         */

        Deque<Integer> intDeQueue = new LinkedList<>();

        intDeQueue.add(1);
        intDeQueue.add(2);
        intDeQueue.add(3);
        intDeQueue.add(4);
        intDeQueue.add(5);

        queue.removeDEQueue(intDeQueue);


        /**
         * checking if element in queue
         */

        Queue<Integer> checkEmptyQueue = new PriorityQueue<>();

        checkEmptyQueue.add(1);
        checkEmptyQueue.add(2);
        checkEmptyQueue.add(3);
        checkEmptyQueue.add(4);
        checkEmptyQueue.add(5);

        queue.checkQue(checkEmptyQueue);


        /**
         * checking if element in dequeue
         */

        Queue<Integer> containDeQueue = new PriorityQueue<>();

        containDeQueue.add(1);
        containDeQueue.add(2);
        containDeQueue.add(3);
        containDeQueue.add(4);
        containDeQueue.add(5);

        queue.checkDeQue(containDeQueue);

        /**
         * printing colors from PriorityQueue
         */

        PriorityQueue<String> colors = new PriorityQueue<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Orange ");

        queue.addColorsPriorQueue(colors);


        /**
         * fill one PriorityQueue from another PriorityQueue
         */

        PriorityQueue<Integer> nums = new PriorityQueue<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        PriorityQueue<Integer> nums2 = new PriorityQueue<>();

        queue.addAnotherPriorQueue(nums,nums2);


        /**
         * removing first element from Queue
         */


        Queue<Integer> intsQueue = new LinkedList<>();

        int first = intsQueue.poll();

        intsQueue.add(1);
        intsQueue.add(2);
        intsQueue.add(3);
        intsQueue.add(4);
        intsQueue.add(5);

        queue.removeFirstQueue(intsQueue, first);


    }
}
