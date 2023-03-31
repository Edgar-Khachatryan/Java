package Generics.SpecificOperations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Specific odds = new Specific();

        /**
         * counting odd number from list
         */

        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(odds.countOdd(list));


        /**
         * counting prime strings from list
         */

        Specific prime = new Specific();

        List<String> strs = new ArrayList<>();
        strs.add("anna");
        strs.add("alla");
        strs.add("abc");

        System.out.println(prime.countPrime(strs));



    }
}
