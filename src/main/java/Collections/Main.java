package Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Collection arr = new Collection();

        /**
         * adding elements in array
         */

        ArrayList<Integer> array = new ArrayList<>();

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        arr.arrayList(array);


        /**
         * inserting element in first position
         */

        ArrayList<Integer> arrIns = new ArrayList<>();

        arrIns.add(1);
        arrIns.add(2);
        arrIns.add(3);
        arrIns.add(4);
        arrIns.add(5);
        arr.arrayInsert(arrIns);

        /**
         * updating specific index in ArrayList
         */

        ArrayList<Integer> arrUpd = new ArrayList<>();

        arrUpd.add(1);
        arrUpd.add(2);
        arrUpd.add(3);
        arrUpd.add(4);
        arrUpd.add(5);
        arrUpd.add(6);
        arrUpd.add(7);

        arr.arrayUpdate(arrUpd);


        /**
         * finding specific element in ArrayList
         */

        ArrayList<Integer> arrSea = new ArrayList<>();

        arrSea.add(1);
        arrSea.add(2);
        arrSea.add(3);
        arrSea.add(4);
        arrSea.add(5);
        arrSea.add(6);
        arrSea.add(7);

        arr.arraySearch(arrSea);

        /**
         * filling one ArrayList from another
         */

        ArrayList<Integer> arrInto = new ArrayList<>();
        ArrayList<Integer> arrAnother = new ArrayList<>();

        arrInto.add(1);
        arrInto.add(2);
        arrInto.add(3);
        arrInto.add(4);
        arrInto.add(5);
        arrInto.add(6);
        arrInto.add(7);

        arr.arrayIntoAnother(arrInto,arrAnother);

        /**
         * reversing an ArrayList
         */

        ArrayList<Integer> arrRev = new ArrayList<>();

        arrRev.add(1);
        arrRev.add(2);
        arrRev.add(3);
        arrRev.add(4);
        arrRev.add(5);
        arrRev.add(6);
        arrRev.add(7);

        arr.arrayReverse(arrRev);

        /**
         * swapping elements in ArrayList
         */

        ArrayList<Integer> arrSwap = new ArrayList<>();

        arrSwap.add(1);
        arrSwap.add(2);
        arrSwap.add(3);
        arrSwap.add(4);
        arrSwap.add(5);
        arrSwap.add(6);
        arrSwap.add(7);

        arr.arraySwap(arrSwap);

        /**
         * checking if ArrayList is empty
         */

        ArrayList<Integer> arrEmpty = new ArrayList<>();

        arrEmpty.add(1);
        arrEmpty.add(2);
        arrEmpty.add(3);
        arrEmpty.add(4);
        arrEmpty.add(5);
        arrEmpty.add(6);
        arrEmpty.add(7);

        arr.arrayEmpty(arrEmpty);


        /**
         * increasing ArrayList capacity
         */

        ArrayList<Integer> arrIncrease = new ArrayList<Integer>(5);

        arrIncrease.add(1);
        arrIncrease.add(2);
        arrIncrease.add(3);
        arrIncrease.add(4);
        arrIncrease.add(5);
        arrIncrease.add(6);
        arrIncrease.add(7);

        arr.arrayIncrease(arrIncrease);

        /**
         * iterating through Linked List
         */

        LinkedList<Integer> link = new LinkedList<>();

        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6);
        link.add(7);

        arr.linkedList(link);

        /**
         * reversing linked list
         */

        LinkedList<Integer> linkRev = new LinkedList<>();

        linkRev.add(1);
        linkRev.add(2);
        linkRev.add(3);
        linkRev.add(4);
        linkRev.add(5);
        linkRev.add(6);
        linkRev.add(7);

        arr.linkedReverse(linkRev);

        /**
         * inserting elements in first and last place of linked list
         */

        LinkedList<Integer> linkIns = new LinkedList<>();

        linkIns.add(1);
        linkIns.add(2);
        linkIns.add(3);
        linkIns.add(4);
        linkIns.add(5);
        linkIns.add(6);
        linkIns.add(7);

        arr.linkedInsert(linkIns);

        /**
         * inserting element in last place of the linked list
         */

        LinkedList<Integer> linkLast = new LinkedList<>();

        linkLast.add(1);
        linkLast.add(2);
        linkLast.add(3);
        linkLast.add(4);
        linkLast.add(5);
        linkLast.add(6);
        linkLast.add(7);

        arr.linkedLastInsert(linkLast);


        /**
         * removing first and last element from list
         */

        LinkedList<Integer> linkFirstLast = new LinkedList<>();

        linkFirstLast.add(1);
        linkFirstLast.add(2);
        linkFirstLast.add(3);
        linkFirstLast.add(4);
        linkFirstLast.add(5);
        linkFirstLast.add(6);
        linkFirstLast.add(7);

        arr.linkedRemoveLastFirst(linkFirstLast);

        /**
         * cloning linked list
         */

        LinkedList<Integer> linkClone = new LinkedList<>();

        linkClone.add(1);
        linkClone.add(2);
        linkClone.add(3);
        linkClone.add(4);
        linkClone.add(5);
        linkClone.add(6);
        linkClone.add(7);

        arr.linkedCloneAnother(linkClone);

        /**
         * checking if linked list is empty
         */

        LinkedList<Integer> linkEmpty = new LinkedList<>();

//        linkEmpty.add(1);
//        linkEmpty.add(2);
//        linkEmpty.add(3);
//        linkEmpty.add(4);
//        linkEmpty.add(5);
//        linkEmpty.add(6);
//        linkEmpty.add(7);

        arr.linkedEmpty(linkEmpty);

        /**
         * calculating sum and average of ArrayList
         */

        ArrayList<Integer> arrSum = new ArrayList<>();

        arrSum.add(1);
        arrSum.add(2);
        arrSum.add(3);
        arrSum.add(4);
        arrSum.add(5);
        arrSum.add(6);
        arrSum.add(7);

//        arr.arraySum(arrSum);

        /**
         * sorting ArrayList
         */

        ArrayList<Integer> arrSort = new ArrayList<>();

        arrSort.add(1);
        arrSort.add(2);
        arrSort.add(3);
        arrSort.add(4);
        arrSort.add(5);
        arrSort.add(6);
        arrSort.add(7);

//        arr.arraySort(arrSort);

        /**
         * removing negative elements from ArrayList
         */

        ArrayList<Integer> arrRemoveNeg = new ArrayList<>();

        arrRemoveNeg.add(-1);
        arrRemoveNeg.add(2);
        arrRemoveNeg.add(3);
        arrRemoveNeg.add(-4);
        arrRemoveNeg.add(5);
        arrRemoveNeg.add(-6);
        arrRemoveNeg.add(7);

        arr.arrayRemoveNegative(arrRemoveNeg);


        /**
         * removing odd occurred element from ArrayList
         */

        ArrayList<Integer> arrOddOccur = new ArrayList<>();

        arrOddOccur.add(1);
        arrOddOccur.add(2);
        arrOddOccur.add(1);
        arrOddOccur.add(4);
        arrOddOccur.add(1);
        arrOddOccur.add(6);
        arrOddOccur.add(7);

        arr.arrayOddOccur(arrOddOccur);

    }
}
