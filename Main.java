import java.io.FileNotFoundException;
import java.io.File;
public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        Algorithms words = new Algorithms("words.txt");
        System.out.println(words.palindromes());
    }
}
