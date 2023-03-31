package TreeSet;

import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        /**
         * finding common elements from TreeSet
         */

        Trees sets = new Trees();

        TreeSet<Integer> first1 = new TreeSet<>();
        first1.add(1);
        first1.add(2);
        first1.add(3);
        first1.add(4);

        TreeSet<Integer> second1 = new TreeSet<>();
        second1.add(1);
        second1.add(6);
        second1.add(3);
        second1.add(7);

        System.out.println(sets.containFirst(first1, second1));

        /**
         * finding unique words from TreeSet
         */

        TreeSet<String> words = new TreeSet<>();
        words.add("Aram");
        words.add("Anna");
        words.add("Tatev");
        words.add("Aram");
        words.add("Anna");

        System.out.println(sets.uniqueWords(words));

    }

}
