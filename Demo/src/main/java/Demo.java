/**
 * Created by arpit on 21/3/17.
 */
public class Demo {
    public String welcome(String firstName , String lastName) {
        return "Welcome " + firstName +" " + lastName + " to TTN " ;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.welcome("Arpit","Sohar"));
    }
}
