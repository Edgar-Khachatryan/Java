package Queue;

import java.util.*;

public class implementsQueue {

    /**
     * adding elements in Queue
     * @param queue
     */


    public void addQueue(Queue<Integer> queue){

        System.out.println(queue);
    }


    /**
     * adding elements in Dequeue
     * @param deque
     */


    public void addDequeue(Deque<Integer> deque){

        System.out.println(deque);
    }


    /**
     * adding elements in PriorityQueue
     * @param prique
     */


    public void addPriorQue(PriorityQueue<Integer> prique){

        System.out.println(prique);

    }

    /**
     * adding strings in PriorityQueue
     * @param stringPrior
     */


    public void addStrPriorQue(PriorityQueue<String> stringPrior){

        System.out.println(stringPrior);

    }


    /**
     * adding elements in ArrayDeque
     * @param intDeque
     */


    public void addInt(Deque<Integer> intDeque){

        System.out.println(intDeque);
    }



    /**
     * removing elements until Queue is empty
     * @param intQueue
     */

    public void removeQueue(Queue<Integer> intQueue){

        while (!intQueue.isEmpty()){
            intQueue.remove();
        }
        System.out.println(intQueue);

    }


    /**
     * removing elements until DeQueue is empty
     * @param intDeQueue
     */


    public void removeDEQueue(Deque<Integer> intDeQueue){

        while (!intDeQueue.isEmpty()){
            intDeQueue.remove();
        }
        System.out.println(intDeQueue);

    }

    /**
     * checking if element in queue
     * @param checkEmptyQueue
     */


    public void checkQue(Queue<Integer> checkEmptyQueue){

        System.out.println(checkEmptyQueue.contains(1));

    }


    /**
     * checking if element in dequeue
     * @param containDeQueue
     */

    public void checkDeQue(Queue<Integer> containDeQueue){


        System.out.println(containDeQueue.contains(4));

    }

    /**
     * printing colors from PriorityQueue
     * @param colors
     */

    public void addColorsPriorQueue(PriorityQueue<String> colors){

        for (String c : colors) {
            System.out.println(c);
        }
    }

    /**
     * fill one PriorityQueue from another PriorityQueue
     * @param nums
     */

    public void addAnotherPriorQueue(PriorityQueue<Integer> nums, PriorityQueue<Integer> nums2){

        nums2.addAll(nums2);

        System.out.println(nums2);

    }

    /**
     * removing first element from Queue
     * @param intsQueue
     */


    public void removeFirstQueue(Queue<Integer> intsQueue, int first){


        System.out.println(intsQueue);

    }


}
