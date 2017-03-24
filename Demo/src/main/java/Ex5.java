import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by arpit on 15/3/17.
 */
public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int firstArraySize = scanner.nextInt();
        ArrayList<Integer> firstArray = new ArrayList<Integer>(firstArraySize);
      //  int[] firstArray = new int[firstArraySize];
        System.out.println("Enter elements of first array");
        for (int i = 0 ; i < firstArraySize ; i++)
            firstArray.add(scanner.nextInt());
        System.out.println("Enter size of second array");
        int secondArraySize = scanner.nextInt();
        System.out.println("Enter elements of second array");
        ArrayList<Integer> secondArray = new ArrayList<Integer>(secondArraySize);
        for (int i = 0 ; i < secondArraySize ; i++)
            secondArray.add(scanner.nextInt());
        System.out.println("Common Elements are : "+new Ex5().getCommon(firstArray,secondArray));



    }
    public HashSet<Integer> getCommon(ArrayList<Integer> first, ArrayList<Integer> second) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0 ; i < first.size() ; i++) {
            for (int j = 0 ; j <second.size() ; j++) {
                if (first.get(i) == second.get(j)) {
                    System.out.println(first.get(i));
                    hashSet.add(first.get(i));
                    break;
                }
            }
        }
        return hashSet;
    }

}