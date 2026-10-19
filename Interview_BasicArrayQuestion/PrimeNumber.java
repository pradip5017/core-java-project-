package Interview_BasicArrayQuestion;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 17;  // you can change the number
        boolean prime = true;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");
    }
}
