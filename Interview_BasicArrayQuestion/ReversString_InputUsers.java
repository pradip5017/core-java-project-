package Interview_BasicArrayQuestion;
import java.util.*;
public class ReversString_InputUsers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String Revers :");
		
		String str = sc.next();
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		sc.close();
	}

}
