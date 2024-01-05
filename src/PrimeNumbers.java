import java.util.ArrayList;

public class PrimeNumbers {
    public static boolean isPrime(int n) {
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
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i))
                primes.add(i);
        }
        for (int i : primes)
            System.out.println(i);
    }
}
