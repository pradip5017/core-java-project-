package LabdaExpression;
 import java.util.*;  
import java.util.function.BiConsumer;
public class LabdaDemo {
	public static void main(String args[])
	{
	BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a+b);
	biConsumer.accept(10,20);
}
}