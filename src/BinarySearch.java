import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        try {
            File file = new File("src\\words.txt");
            ArrayList<String> stringList = new ArrayList<>();
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String word = sc.nextLine();
                stringList.add(word);
            }
            sc.close();
            Collections.sort(stringList);

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the word to be searched");
            String target = sc1.nextLine();

            int start = 0;
            int end = stringList.size() - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (stringList.get(mid).equals(target)) {
                    System.out.println(target + " found ");
                    return;
                } else if (stringList.get(mid).compareTo(target) < 0)
                    start = mid + 1;
                else
                    end = mid - 1;
            }

            System.out.println(target + " not found");

        } catch (

        FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
