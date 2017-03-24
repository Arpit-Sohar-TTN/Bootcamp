import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by arpit on 16/3/17.
 */

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int firstArraySize = scanner.nextInt();
        ArrayList<Integer> firstArray = new ArrayList<Integer>(firstArraySize);

        System.out.println("Enter elements of array");
        for (int i = 0 ; i < firstArraySize ; i++)
            firstArray.add(scanner.nextInt());
      //  int[] array = {1,1,5,6,3,6,7,7,8};
        System.out.println(new Ex6().getSingleElements(firstArray));

    }

    public ArrayList<Integer> getSingleElements(ArrayList<Integer> firstArray) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        System.out.println("Single Elements are");
        for (int i = 0 ; i < firstArray.size() ; i++) {
            int count=1;
            for (int j = 0 ; j < firstArray.size() ; j++) {
                if ((firstArray.get(i) == firstArray.get(j)) && i != j) {
                    count++;
                }
            }
            if (count == 1) {
                array.add(firstArray.get(i));
            }
        }
        return array;
    }
}
