package Interview_BasicArrayQuestion;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class SimpleDuplicateUsingLambdaExpression {
	public static void main(String args[])
	{
		/*
		int arr[]= {1,3,6,7,9,4,6,8,3,6};
		
		Set<Integer> s1 = new HashSet<>();
		
		IntStream.range(0, arr.length)
		.filter(i -> !s1.add(arr[i]))
		.forEach(i -> System.out.println("Dublicate :"+i));
		*/
		
		
		/*
		int[] numbers = {4, 2, 7, 9, 2, 8, 7};
        Set<Integer> seen = new HashSet<>();

        // Stream the array indices and filter for duplicates
        IntStream.range(0, numbers.length)
                .filter(i -> !seen.add(numbers[i]))
                .forEach(i -> System.out.println("Duplicate found at index: " + i));

			*/
		
		
	        int[] numbers = {4, 2, 7, 9, 2, 8, 7};

	        // Group indices by their array values
	        IntStream.range(0, numbers.length)
	                .boxed()
	                .collect(Collectors.groupingBy(i -> numbers[i]))
	                
	                // Filter and print only the items that have duplicates
	                .forEach((value, indices) -> {
	                    if (indices.size() > 1) {
	                        System.out.println(value + " is a duplicate at indices: " + indices);
	                    }
	                });

		
			
	}

}
