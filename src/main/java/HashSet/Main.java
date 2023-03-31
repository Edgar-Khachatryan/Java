package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;



public class Main {

    public static void main(String[] args) {

        /**
         * finding common elements from 2 HashSets
         */

        HashSet<Integer> first1 = new HashSet<>();
        first1.add(1);
        first1.add(2);
        first1.add(3);
        first1.add(4);
        first1.add(5);

        HashSet<Integer> second2 = new HashSet<>();
        second2.add(1);
        second2.add(6);
        second2.add(5);
        second2.add(3);

        Sets c = new Sets();
        System.out.println(c.CommonElements(first1, second2));


        /**
         * finding unique elements from HashSet String
         */

        HashSet<String> str = new HashSet<>();
        str.add("Hello");
        str.add("hEllo");
        str.add("World");
        str.add("wOrld");


        Sets sentence = new Sets();

        System.out.println(sentence.findUniques(str));


        /**
         * removing even elements from LinkedHashSet
         */

        Sets evens = new Sets();
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);

        evens.removeEven(numbers);

        /**
         * removing duplicates names from LinkedHashSet
         */

        Sets human = new Sets();

        LinkedHashSet<Human> person = new LinkedHashSet<>();
        person.add(new Human("Aram",20));
        person.add(new Human("Anna",30));
        person.add(new Human("Tatev",40));
        person.add(new Human("Aram",45));
        person.add(new Human("Anna",50));
        person.add(new Human("Vazgen",55));

        human.removeDuplicates(person);


    }

}
