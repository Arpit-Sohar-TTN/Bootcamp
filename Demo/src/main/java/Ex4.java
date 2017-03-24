import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arpit on 15/3/17.
 */
public class Ex4 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        HashMap<String,Double> hashMap = new HashMap<String, Double>();
        Ex4 ex4 = new Ex4();
        hashMap = ex4.findData(str);


    }
    public HashMap<String,Double> findData(String str) {
        double lowerCaseCount = 0;
        double upperCaseCount = 0;
        double digitsCount = 0;
        double specialCharacterCount = 0;
        HashMap<String,Double> hashMap = new HashMap<String, Double>();
        for (int i = 0 ; i < str.length() ; i++) {
            Character temp = str.charAt(i);
            if(Character.isAlphabetic(temp)) {
                if(Character.isLowerCase(temp))
                    lowerCaseCount++;
                else
                    upperCaseCount++;
            }
            else if(Character.isDigit(temp))
                digitsCount++;
            else
                specialCharacterCount++;
        }

        System.out.println("LowerCase : "+lowerCaseCount);
        System.out.println("UpperCase : "+upperCaseCount);
        System.out.println("SpecialChar : "+specialCharacterCount);
        System.out.println("Digits : "+digitsCount);
        hashMap.put("LowerCase : ",lowerCaseCount);
        hashMap.put("UpperCase : ",upperCaseCount);
        hashMap.put("Special Char : ",specialCharacterCount);
        hashMap.put("Digits : ",digitsCount);


        double total = upperCaseCount + lowerCaseCount + specialCharacterCount + digitsCount;
        System.out.println(total);
        double lowerCase = (lowerCaseCount*100/total);
        double upperCase = (upperCaseCount*100/total);
        double specialCase = (specialCharacterCount*100/total);
        double digits = (digitsCount*100/total);
        System.out.println("LowerCase % : "+lowerCase);
        System.out.println("UpperCase % : "+upperCase);
        System.out.println("SpecialChar % : "+specialCase);
        System.out.println("Digits % : "+digits);
        hashMap.put("LowerCase % : ",lowerCase);
        hashMap.put("UpperCase %",upperCase);
        hashMap.put("SpecialChar %",specialCase);
        hashMap.put("Digits %",digits);
        return hashMap;
    }



}
