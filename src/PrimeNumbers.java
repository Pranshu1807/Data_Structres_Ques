import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int left = sc.nextInt();
        int right = sc.nextInt();
        for (int i = left; i <= right; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        for (int i : primes)
            System.out.println(i);
    }
}
