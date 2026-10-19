package LeetCode;

import java.util.HashMap;

public class UniqueElementSum {

    public static int findUniqueSum(int[] arr) {
        HashMap<Integer, Integer > frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        // Add only elements that occur exactly once
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
//        int[] array1 = {1, 2, 3, 2, 3, 4, 5, 4};  // Output should be 1 + 5 = 6
        int[] array2 = {1, 2, 3, 4, 5};           // All unique → sum = 15

//        System.out.println("Output 1: " + findUniqueSum(array1));
        System.out.println("Output 2: " + findUniqueSum(array2));
    }
}

