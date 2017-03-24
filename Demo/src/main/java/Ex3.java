import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Created by arpit on 16/3/17.
 */
//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Please Enter A String without space : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<Character , Integer> hashMap = new HashMap<Character , Integer>();
        /*char[] strArr = str.toCharArray();

        for (int i = 0 ; i < strArr.length ; i++) {
            if (hashMap.containsKey(strArr[i])) {
                hashMap.put(strArr[i],hashMap.get(strArr[i]) + 1);
            } else {
                hashMap.put(strArr[i], 1);
            }
        }*/
        hashMap = Ex3.get(str);
        System.out.println(hashMap);

    }
    public static HashMap<Character,Integer> get(String str) {
        char[] strArr = str.toCharArray();
        HashMap<Character , Integer> hashMap = new HashMap<Character , Integer>();
        for (int i = 0 ; i < strArr.length ; i++) {
            if (hashMap.containsKey(strArr[i])) {
                hashMap.put(strArr[i],hashMap.get(strArr[i]) + 1);
            } else {
                hashMap.put(strArr[i], 1);
            }
        }
        return hashMap;
    }
}
