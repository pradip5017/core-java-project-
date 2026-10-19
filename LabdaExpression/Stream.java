package LabdaExpression;

import java.util.ArrayList; 
import java.util.Arrays;
import java.util.List;

public class Stream {
	public static void main(String args[])
	{
		
		List<Integer> list1 = List.of(2,3,4,5,6);
		
//		list1.add(45);
//		System.out.println(list1);
		
		List<Integer> list2 = Arrays.asList(2,3,4,66,77,88,5,4,34);
		
		
		List<Integer> addEven = new ArrayList<>();
		
		
		for(Integer i : list1)
		{
			if(i%2 ==0) {
				
				addEven.add(i);
//			System.out.println(i);
			}
		}
		
		System.out.println(list1);
		System.out.println(addEven);
	}

}
