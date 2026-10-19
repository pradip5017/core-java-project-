package stringBuffer_class;

public class StringBufferRevers {
	public static void main(String args[])
	{
		String s1 = "Hello";
		
		StringBuffer sb = new StringBuffer(s1);
		
		sb.reverse();
		System.out.println(sb);
		
		// 2 way
		
		StringBuffer str = new StringBuffer("Pradip Rathod");
		
		str.reverse();
		System.out.println(str);
	}

}
