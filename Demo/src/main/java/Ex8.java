import java.util.Scanner;

/**
 * Created by arpit on 16/3/17.
 */
public class Ex8 {
    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(new Ex8().convert(str));

    }
    public String convert(String str) {
        StringBuffer s = new StringBuffer(str);

        s.reverse();
        System.out.println("After reverse : " + str);
        System.out.println("After remove character : " + s.replace(4,9,""));
        return s.replace(4,9,"").toString();

    }

}
