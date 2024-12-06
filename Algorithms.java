import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    public static File f;
    public static Scanner s;

public Algorithms(String fileName) throws FileNotFoundException{
 this.f = new File(fileName);
}
    public static int two_letters() throws FileNotFoundException{
        s = new Scanner(f);
        int count = 0;
        while (s.hasNext()) {
            if (s.next().length() == 2)
                count++;
        }
        s.close();
        return count;
    }
    public static int longest() throws FileNotFoundException{
        s = new Scanner(f);
        int max_len = 0;
        while (s.hasNext()) {
            int current = s.next().length();
            if (current > max_len)
                max_len = current;
        }
        s.close();
        s = new Scanner(f);
        int count_longest = 0;
        while (s.hasNext()) {
            int current = s.next().length();
            if (current == max_len)
                count_longest++;
        }
        s.close();
        return count_longest;
    }
    public static int palindromes() throws FileNotFoundException{
        s= new Scanner(f);
        int count = 0;
        while (s.hasNext()) {
            String current = s.next();
            String backward = "";
            for(int i = current.length(); i > 0; i--){
                backward += current.substring(i-1, i);
            }
            if(backward.equals(current)) count ++;
        }
        s.close();
        return count;

    }
}