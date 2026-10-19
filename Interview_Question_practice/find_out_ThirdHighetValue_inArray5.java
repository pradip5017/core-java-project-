package Interview_Question_practice;
import java.util.*;
public class find_out_ThirdHighetValue_inArray5 {
 public static void main(String[] args) {
	/*
	 int arr[]= {1,44,55,77,45,75,87,12};// find out Secound highest Number in array
	 
	 Arrays.sort(arr);
	 
	 int third = arr[arr.length-3];
	 System.out.println(third);
	 */
	 
	 //.......................................
	 /*
	  // swapping of Array
	 int a[]= {1,2,3,4,5};
	 int b[]= {9,8,7,6,4};
	 
	 int temp[] = a;
	 a=b;
	 b=temp;
	 
	 System.out.print("A Array:");
	 for(Integer x :a)
	 {
		 System.out.print(x+" ");
	 }
	 System.out.print("\nB Array");
	 for(Integer x :b)
	 {
		 System.out.print(x+" ");
	 }
	 
	 */
	 
	 /*
	 // Sum of Array
	 int arr[]= {1,2,3,4,5};
	 int sum =0;
	 int mul =1;
	 for(int i=0; i<arr.length; i++)
	 {
		 sum = sum +arr[i];
		 mul = mul*arr.length;
	 }
	 System.out.println(sum);
	 System.out.println(mul);
	 double avarage = sum = sum/arr.length;
	 System.out.println(avarage);
	 */
	 
	 /*
	 // find out smallest and highers values in array
	 int arr[]= {22,33,14,66,78,98,54,23,8,54,75};
	 
//	 int small =arr[0];
	 int big =arr.length;
	 for(int i=0; i<arr.length; i++)
	 {
		 if(arr[i] > big)
		 {
			 big = arr[i];
		 }
	 }
	 System.out.println(big);
	 
	 */
	 
	 /*......................................
	 //Remove  dublicate charector in String
	 String s1 ="programming";
	 
	 String result ="";
	 
	 for(int i=0; i<s1.length(); i++)
	 {
		 char ch =s1.charAt(i);
		 if(result.indexOf(ch)==-1)
		 {
			 result +=ch;
		 }
	 }
	 System.out.println(result);
	 
	 */
	 
	 /*......................
	 // find out dublicate Charector
	 
	 String s1 ="programming";
	 
	 String result ="";
	 
	 for(int i=0; i<s1.length(); i++)
	 {
		 char ch = s1.charAt(i);
		 if(s1.indexOf(ch)!=s1.lastIndexOf(ch))
		 {
			 if(result.indexOf(ch)==-1)
			 {
				 result +=ch;
			 }
		 }
	 }
	 System.out.println(result);
	 */
	 
	 /*
	 //find oout first dublicate Charector in string
	 
	 String s1 ="piejfdshhfsdjhfd";
	 
	 int arr[]=new int[222];
	 
	 for(int i=0; i<s1.length(); i++)
	 {
		 arr[s1.charAt(i)] = arr[s1.charAt(i)]+1;
	 }
	 int max =-1;
	 char c =' ';
	 for(int i=0; i<s1.length(); i++)
	 {
		 if(max < arr[s1.charAt(i)])
		 {
			 max = arr[s1.charAt(i)];
			 c=s1.charAt(i);
		 }
	 }
	
	 System.out.println("First Dublicate Charector :"+c);
	 System.out.println("How many time dublicate charector :"+max);
	 */
	 
	 /*
	 // 121 palindrom 
	 
	 int num = 12321;
	 int temp = num;
	 int rev =0;
	 
	 while(num > 0)
	 {
		 rev = rev *10 + num %10;
		 num = num /10;
	 }
	 
	 if(temp == rev)
	 {
		 System.out.println("True:"+temp);
	 }
	 else
	 {
		 System.out.println("False :"+temp);
	 }
	 */
	 
	 
	 /*
	 //String Palindrom
	 
	 String s1 = "madam";
	 
	 String num ="";
	 for(int i=s1.length()-1; i>=0; i--)
	 {
		num +=s1.charAt(i); 
	 }
	 if(s1.equals(num))
	 {
		 System.out.print("True :"+num);
	 }
	 else
	 {
		 System.out.print("False :"+num);
	 }
*/
	 
	 /*
	 // revers String
	 
	 String s1 = "Vishal";
	 String revers ="";
	 
	 for(int i=s1.length()-1; i>=0; i--)
	 {
		 revers = revers +s1.charAt(i);
	 }
	 System.out.println("String Revers :"+revers);
	 
	 */
	 
	 // int Palindrom  output is true or false
	 
	int num= 121;
	
	int temp = num;
	int rev =0;
	
	while(num > 0)
	{
		rev = rev * 10 + num % 10;
		num = num /10;
				
	}
	 if(temp == rev)
	 {
		 System.out.println("True :"+temp);
	 }
	 else {
		 System.out.println("False :"+temp);
	 }
		 
}
}
