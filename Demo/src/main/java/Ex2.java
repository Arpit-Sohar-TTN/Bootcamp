import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by arpit on 16/3/17.
 */
//Write a method that takes a string and returns the number of unique characters in the string.
public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Ex2 ex2 = new Ex2();
        System.out.println("Number Of unique characters : ");
        System.out.println(ex2.uniqueCharacters(str));

    }
    public  ArrayList<Character> uniqueCharacters(String input) {
        char[] al =input.toCharArray();
        ArrayList<Character> res =  new ArrayList();
        for (int i = 0 ; i < input.length() ; i++) {
            int count=1;
            for (int j = 0 ; j < input.length() ; j++) {
                if ((al[i] == al[j]) && i != j) {
                    count++;
                }
            }
            if (count == 1) {
                res.add(al[i]);
                System.out.println(al[i]);
            }
        }
        return res;
    }
}
