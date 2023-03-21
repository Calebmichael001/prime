import java.util.Scanner;
public class primeNumbers {

    public static  boolean primeNumbers(int n) {
        if (n <= 1) {
            return false;
        }
        for (int I = 2;
             I <= Math.sqrt(n); I++) {
            if (n % I == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Input a Value");
        int number = Scanner.nextInt();

        if (primeNumbers(number)) {
            System.out.println(number + " This is a prime Number ");
        } else {
            System.out.println(number + "This is not a prime Number");
        }
        int limit = 500;
        System.out.println("Prime numbers 1-" + limit);
        for (int i = 2; i <= limit; i++) {
            if (primeNumbers(i)) {
                System.out.print(i + " ");
            }
        else if (primeNumbers(i)) {
                System.out.println(i + " ");
        }
    }
}
}