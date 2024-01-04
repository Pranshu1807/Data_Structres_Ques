import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> FreqOfString1 = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            FreqOfString1.put(str1.charAt(i), FreqOfString1.getOrDefault(str1, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (FreqOfString1.get(str2.charAt(i)) == 0)
                return false;
            FreqOfString1.put(str2.charAt(i), FreqOfString1.get(str2.charAt(i)) - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string");
        String str2 = sc.nextLine();
        if (checkAnagram(str1, str2))
            System.out.println(str1 + " and " + str2 + " are anagram");
        else
            System.out.println(str1 + " and " + str2 + " are not anagram");
        sc.close();

    }
}
