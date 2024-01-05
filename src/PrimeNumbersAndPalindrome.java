import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrimeNumbersAndPalindrome {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> FreqOfString1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            FreqOfString1.put(str1.charAt(i), FreqOfString1.getOrDefault(str1.charAt(i), 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!FreqOfString1.containsKey(str2.charAt(i)) || FreqOfString1.get(str2.charAt(i)) == 0)
                return false;
            FreqOfString1.put(str2.charAt(i), FreqOfString1.get(str2.charAt(i)) - 1);
        }
        return true;
    }

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

    public static boolean isPalindrome(int n) {
        int temp = n;
        int temp1 = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            temp1 *= 10;
            temp1 += d;
        }
        return temp == temp1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primesAndPalindrome = new ArrayList<>();
        System.out.println("Enter the Range");
        int left = sc.nextInt();
        int right = sc.nextInt();
        sc.nextLine();
        for (int i = left; i <= right; i++) {
            if (isPrime(i) && isPalindrome(i))
                primesAndPalindrome.add(i);
        }
        System.out.println("All Palindrome Primes:");
        for (int i : primesAndPalindrome) {
            System.out.println(i);
        }

        System.out.println("\nEnter the no to check anagram with");
        String num = sc.nextLine();
        boolean flag = false;
        for (int i : primesAndPalindrome) {
            String a = Integer.toString(i);
            if (checkAnagram(a, num)) {
                flag = true;
                System.out.println(i);
            }
        }
        if (!flag) {
            System.out.println("No anagram found");
        }
        sc.close();

    }

}