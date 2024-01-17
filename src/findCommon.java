
/*
You have 3 arrays of random numbers.
Create a program, that should compare 3 arrays and create a new array,
which will contain common elements from these 3 arrays.
Example:
a[] = [1, 2, 3, 4, 5, 6];
b[] = [3, 4, 5, 6, 7, 8];
c[] = [1, 2, 6, 8, 9, 0];

Result:
res[] = [6]
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findCommon {

        public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 5, 6};
            int[] b = {3, 4, 5, 6, 7, 8};
            int[] c = {1, 2, 6, 8, 9, 0};

            int[] result = findCommonElements(a, b, c);

            System.out.println("Common Elements: " + Arrays.toString(result));
        }

        public static int[] findCommonElements(int[] a, int[] b, int[] c) {
            Set<Integer> setA = new HashSet<>();
            Set<Integer> setB = new HashSet<>();
            Set<Integer> commonSet = new HashSet<>();

            // Add elements from array 'a' to setA
            for (int num : a) {
                setA.add(num);
            }

            // Add elements from array 'b' to setB
            for (int num : b) {
                setB.add(num);
            }


            /*The loop iterates through each element num in the array c.
            The loop is finding elements that are common between setA and setB
            and then checking if they are also present in array c.
            If they are, these common elements are added to the commonSet.
            The resulting commonSet contains elements that are common across all three sets (setA, setB, and c). */

            for (int num : c) {
                if (setA.contains(num) && setB.contains(num)) {
                    commonSet.add(num);
                }
            }

            // Convert the set of common elements to an array
            int[] result = new int[commonSet.size()]; //an integer array named result with a size equal to the number of common elements found in the commonSet.
            int index = 0; // is used to keep track of the current position in the result array where the common elements will be stored.
            for (int num : commonSet) { // a for-each loop that iterates through each element (num) in the commonSet
                result[index++] = num; //assigns the current common element (num) to the result array at the current index (index).
            }

            return result;
        }
    }
