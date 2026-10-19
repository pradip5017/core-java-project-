package collection_Framwork;

import java.util.ArrayList;

public class For_each_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String>  l1= new ArrayList();
				   l1.add("ram");  //0
				   l1.add("jivan"); //1
				   l1.add("riya"); //2
				   l1.add("rani");  //3
				   l1.add("kalyani");
				   System.out.println(l1);
				   
				   for(String   s : l1 )
					  {
					   if(s.startsWith("r"))//true
					   {
						  System.out.println(s);
					  }
	}

}
}

