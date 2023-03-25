package Collections;

import java.util.*;

public class Collection {

    /**
     * iterating through ArrayList
     * @param array
     */

    public void arrayList(ArrayList<Integer> array){


        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    /**
     * inserting element in first position
     * @param arrayIns
     */

    public void arrayInsert(ArrayList<Integer> arrayIns){

        arrayIns.add(0,6);
        System.out.println(arrayIns);

    }

    /**
     * update specific index in ArrayList
     * @param arrayUpd
     */

    public void arrayUpdate(ArrayList<Integer> arrayUpd){

        int index = 6;
        int newValue = -5;

        arrayUpd.set(index, newValue);

        System.out.println(arrayUpd);

    }

    /**
     * finding specific element in ArrayList
     * @param arraySea
     */

    public void arraySearch(ArrayList<Integer> arraySea){

        int search = 1;

        int indexOfSearch = arraySea.indexOf(search);

        if (indexOfSearch < 0){
            System.out.println(search + " Element is not found");
        }else System.out.println(search + " is found in " + indexOfSearch + " index");

    }

    /**
     * filling second ArrayList from first
     * @param arrayInto
     * @param arrayAnother
     */

    public void arrayIntoAnother(ArrayList<Integer> arrayInto, ArrayList<Integer> arrayAnother){

        for (int num:arrayInto){
            arrayAnother.add(num);
        }

        System.out.println(arrayAnother);

    }

    /**
     * reversing an ArrayList
     * @param arrayRev
     */

    public void arrayReverse(ArrayList<Integer> arrayRev){

        Collections.reverse(arrayRev);

        System.out.println(arrayRev);

    }

    /**
     * swapping elements in ArrayList
     * @param arraySwap
     */

    public void arraySwap(ArrayList<Integer> arraySwap){

        Collections.swap(arraySwap, 1,4);

        System.out.println(arraySwap);
    }

    /**
     * checking if ArrayList is empty
     * @param arrayEmpty
     */

    public void arrayEmpty(ArrayList<Integer> arrayEmpty){

        if (arrayEmpty.isEmpty()){
            System.out.println("Array is empty");
        }else {
            System.out.println("Array is not empty");
        }
    }

    /**
     * increasing size of ArrayList
     * @param arrayIncrease
     */

    public void arrayIncrease(ArrayList<Integer> arrayIncrease){

        arrayIncrease.ensureCapacity(10);

        System.out.println(arrayIncrease.size());
    }

    /**
     * iterating through linked list
     * @param linked
     */

    public void linkedList(LinkedList<Integer> linked){

        for (int i = 0; i < linked.size(); i++) {
            System.out.println(i);
        }
    }

    /**
     * printing linked list in reverse
     * @param linkedRev
     */

    public void linkedReverse(LinkedList<Integer> linkedRev){

        ListIterator<Integer> iterator = linkedRev.listIterator(linkedRev.size());

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }

    /**
     * inserting new element in last and first place of linked list
     * @param linkInsert
     */

    public void linkedInsert(LinkedList<Integer> linkInsert){

        linkInsert.addFirst(-13);
        linkInsert.addLast(-67);

        System.out.println(linkInsert);

    }

    /**
     * inserting another element in the last place of linked list
     * @param linkedLast
     */

    public void linkedLastInsert(LinkedList<Integer> linkedLast){

        linkedLast.addLast(-10874);

        System.out.println(linkedLast);
    }

    /**
     * removing first and last element from linked list
     * @param linkedFirstLast
     */

    public void linkedRemoveLastFirst(LinkedList<Integer> linkedFirstLast){

        linkedFirstLast.removeFirst();
        linkedFirstLast.removeLast();
        System.out.println(linkedFirstLast);
    }

    /**
     * clonning linked list
     * @param linkedClone
     */

    public void linkedCloneAnother(LinkedList<Integer> linkedClone){

        LinkedList<Integer> cloned = new LinkedList<Integer>(linkedClone);

        System.out.println(cloned);
    }

    /**
     * checking if linked list is empty
     * @param linkedEmpty
     */

    public void linkedEmpty(LinkedList<Integer> linkedEmpty){

        if (linkedEmpty.isEmpty()){
            System.out.println("Linked list is empty");
        }else {
            System.out.println("Linked list is not empty");
        }
    }

    /**
     * calculating of sum and average in ArrayList
     * @param arrSum
     */

    public void arraySum(ArrayList<Integer> arrSum){

        System.out.println("Enter a sequence of positive integers, stop the loop enter <end>");


        Scanner sc = new Scanner(System.in);

        String end = "end";

        while (end!="end") {
            String nums = sc.nextLine();
            if (nums.isEmpty()) {
                break;
            }
            int numbers = Integer.parseInt(nums);
            if (numbers > 0 ) {
                arrSum.add(numbers);
            if (nums == end){
                break;
            }
            } else {
                System.out.println("Invalid input: number must be positive");
            }
        }

        int sum = 0;
        for (int n:arrSum){
            sum +=n;
        }

        double average = sum / arrSum.size();

        System.out.println(sum);

        System.out.println(average);

    }

    /**
     * sorting an ArrayList
     * @param arraySort
     */

    public void arraySort(ArrayList<Integer> arraySort){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> sequence = new ArrayList<Integer>();

        System.out.println("Enter integers");

        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            int num = Integer.parseInt(input);
            arraySort.add(num);
        }

        Collections.sort(arraySort);

        System.out.println(arraySort);
    }

    /**
     * removing negative numbers from ArrayList
     * @param arrayRemove
     */

    public void arrayRemoveNegative(ArrayList<Integer> arrayRemove){

        for (int i = 0; i < arrayRemove.size(); i++) {
            if (arrayRemove.get(i) < 0){
                arrayRemove.remove(arrayRemove.get(i));
            }
        }

        System.out.println(arrayRemove);
    }

    /**
     * removing odd time occurred element from ArrayList
     * @param arrayOdd
     */

    public void arrayOddOccur(ArrayList<Integer> arrayOdd){

        for (int i = 0; i < arrayOdd.size(); i++) {
            int num = arrayOdd.get(i);
            int occur = 0;
            for (int j = 0; j < arrayOdd.size(); j++) {
                if (arrayOdd.get(j) == num) {
                    occur++;
                }
            }
            if (occur % 2 == 0) {
                arrayOdd.remove(num);
            }

        }
    }

}
