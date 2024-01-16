
/* java.util.HashSet is a class that implements the Set interface.

java.util.Set Interface:
The Set interface in Java is a part of the Java Collections Framework and extends the Collection interface.
It represents an unordered collection of elements that do not allow duplicate elements.
The key characteristic of a Set is that it does not maintain the order
in which elements are inserted.
Commonly used implementing classes of the Set interface are: HashSet, LinkedHashSet, and TreeSet.

a lists maintains the order, a hashset has no particular order of objects
sets by design DO NOT ALLOW DUPLICATES
you cannot remove items from HashSet using index as there is no particular order anyway.

use HasSet whenever you want to create a collection of items,
and you don't want to have duplicates in this collection,
and you do not care which order they are in
*/

import java.util.*;

public class learnAboutsets {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Water");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");
        names.add("Saul");
        names.add("Saul");
        names.remove("Saul");



        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.contains("Mike")); //true
        System.out.println(names.contains("Anna")); //false
        System.out.println(names.isEmpty()); //false

        //names.clear(); to delete al elements from Set
        //System.out.println(names);

        // for each String name inside names Set:

        for (String name : names) {
            System.out.println(name);  // print each element on a next line
        }

        //or the same can be done using Iterator:

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()) {
            System.out.println(namesIterator.next());
        }

        //REMOVING DUPLICATES FROM A LIST

        List<Integer> numberList = new ArrayList<>(); // create a list of integers
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2); // add duplicates
        numberList.add(1);
        System.out.println(numberList);
        Set<Integer> numberSet = new HashSet<>(numberList); // convert a list numberList into a numberSet

        System.out.println(numberSet);

        //implementation of a TreeSet.
        // elements that you put in a TreeSet will be ordered in their original (natural) ordering
        // in case of Strings - in alphabetical ordering:
        // a hashset is way faster than a treeset

        Set<String> names2 = new TreeSet<>();
        names2.add("Water");
        names2.add("Jesse");
        names2.add("Skyler");
        names2.add("Mike");
        names2.add("Saul");
        System.out.println(names2);

        //LinkedHashSet does not maintain the natural order of elements but keep the insertion order
        // keeps elements in exact same order as they were added to LinkedHashSet

        Set<String> names3 = new LinkedHashSet<>();
        names3.add("Water");
        names3.add("Jesse");
        names3.add("Skyler");
        names3.add("Mike");
        names3.add("Saul");
        System.out.println(names3);


        // Convert the set of common elements to an array
        String[] uniqueNames = new String[names.size()];
        int index = 0; //
        for (String name : names) {
            uniqueNames[index++] = name;
        }

        System.out.println(Arrays.toString(uniqueNames)); //use Arrays.toString(uniqueNames) to print the contents of the uniqueNames array.
    }

}
