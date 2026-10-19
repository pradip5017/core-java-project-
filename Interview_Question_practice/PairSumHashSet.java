package Interview_Question_practice;
import java.util.HashSet;

public class PairSumHashSet {
    public static void main(String[] args) {
        int arr[] = {24, 2, 5, 6, 7, 5, 8, 7, 3, 9, 3, 1};
        int target = 10;
        int count = 0;

        HashSet<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum = " + target + ":");

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                System.out.println(num + " + " + complement + " = " + target);
                count++;
            }
            seen.add(num);
        }

        System.out.println("Total pairs count = " + count);
    }
}
