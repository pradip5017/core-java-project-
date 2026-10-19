package Interview_BasicArrayQuestion;

public class RotateArray {

    public static void main(String args[])
    {
        int arr[]= {1,2,3,5,7};
        int k = 2;   // rotate right by 2

        for(int i = 0; i < k; i++)
        {
            int last = arr[arr.length - 1]; // store last element
            
            // Shift all elements to the right
            for(int j = arr.length - 1; j > 0; j--)
            {
                arr[j] = arr[j - 1];
            }

            arr[0] = last; // put last element at the first position
        }
        
        // print rotated array
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
