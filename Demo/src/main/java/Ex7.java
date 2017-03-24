import java.util.Arrays;

/**
 * Created by arpit on 16/3/17.
 */
public class Ex7 {
    public static void main(String[] args) {
    SpecialStack specialStack = new SpecialStack(5);
    specialStack.push('q');
        specialStack.push('w');
        specialStack.push('e');
        specialStack.push('a');
        System.out.println(specialStack);
        System.out.println(specialStack.pop());
        System.out.println(specialStack.isFull());
        System.out.println(specialStack.isEmpty());
        System.out.println(specialStack);

        System.out.println( specialStack.min());

        System.out.println(specialStack.isFull());
        System.out.println(specialStack.isEmpty());
    }
}

class SpecialStack {
    private static int size;
    char[] element;
    int counter = 0;

    @Override
    public String toString() {
        return "SpecialStack{" +
                "size=" + size +
                ", element=" + Arrays.toString(element) +
                '}';
    }

    SpecialStack(int size) {
        this.size = size;

         element = new char[size];
    }
    public boolean push(char item) {
       if(!this.isFull()) {
            this.element[counter] = item;
            counter++;
            return true;
        } else
            return false;
        }

    public boolean isEmpty() {
        if(this.counter == 0)
            return true;
        else
            return false;
    }
    public boolean isFull() {
        if(this.counter == this.size-1) {
            return true;
        }
        else return false;
    }
    public char pop() {
        if (!this.isEmpty()) {
            char temp = this.element[counter-1];
            this.element[counter-1] = '\0';
            counter--;
            return temp;
        }else
        return '\0';
    }
    public char min() {
        char temp = 'z';
        for (int i = 0 ; i < counter ; i++) {
            if (element[i] < temp)
                temp = element [i];
        }
        return temp;
    }
}