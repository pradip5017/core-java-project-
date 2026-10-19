package Interface_Programs;
 import java.util.*;
class Date
{
	private int day;
	private int month;
	private int year;
	Date(int dd,int mm,int yy)
	{
		this.day = dd;
		this.month = mm;
		this.year = yy;
	}
	public void show()
	{
		System.out.println("Date : "+this.day+" / "+this.month+" / "+this.year);
	}
	public boolean equals(Object obj) {
        if (this == obj) return true;               // same object
        if (obj == null || getClass() != obj.getClass()) return false;
        Date d = (Date) obj;
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }
}
public class LinearSearch {
	
    static void put(Object arr, Object target) {
        boolean flag = true;

        if (arr instanceof int[]) {
            int[] a = (int[]) arr;
            int t = (int) target;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == t) {
                    System.out.println("Your Index Is : " + i);
                    flag = false;
                }
            }
        } 
        else if (arr instanceof char[]) {
            char[] a = (char[]) arr;
            char t = (char) target;
            for (int i = 0; i < a.length; i++) {
                if (a[i] == t) {
                    System.out.println("Your Index Is : " + i);
                    flag = false;
                }
            }
        }
        else if(arr instanceof Date[])
        {
        	Date[] a = (Date[]) arr;
            Date t = (Date) target;
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(t)) {
                    System.out.println("Your Index Is : " + i);
                    flag = false;
                }
            }
        }

        if (flag) {
            System.out.println("Value not Found");
        }
    }

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> A = new ArrayList<>();
		System.out.print("Enter The Values: ");
		int arr[]= {1,2,3,4,5,8,7,8,9}; 
		char arr1[] = {'a','b','c','d','e','f'};
		int target  = sc.nextInt(); 
		LinearSearch.put(arr,target);
		System.out.println("Enter the target for character array : ");
		char target1 = sc.next().charAt(0);
		LinearSearch.put(arr1 ,  target1);
		Date myDate[] = {new Date(20,5,2003),new Date(21,5,2003),new Date(22,5,2003)};
		//myDate.show();
		LinearSearch.put(myDate, new Date(21,5,2003));
	}
}


