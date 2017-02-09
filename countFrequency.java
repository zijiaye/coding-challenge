//I assume string that partition by white spaces
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class CountFrequency {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        int count = 0;
        try {
            Scanner in = new Scanner(new File("/Users/ZijiaYe/Desktop/readme.txt")); //put file name here
            while (in.hasNext()) {
                String word = in.next();
                if (map.containsKey(word)) {
                    count = map.get(word) + 1;
                    map.put(word, count);
                } else {
                    map.put(word, 1);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("There is no such file!");
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}