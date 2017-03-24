/**
 * Created by arpit on 15/3/17.
 */
public class Ex1 {

    public static void main(String[] args) {
    String str = new String ("Hello I am string");
        System.out.println("Before Change : " + str);
        System.out.println("After Change : " + Ex1.change(str));
    }
    public static String change(String str) {
        return str.replaceAll("Hello","Hi");
    }
}

/*
class Player{

    String name;
    Integer score;
    Player(String name, Integer score){
        this.name = name;
        this.score = score;
    }

    void meth(){
        List<Player> list = Arrays.asList(new Player("arpit", 100), new Player("ajay",90));
        Collections.sort(list, (p1, p2)-> {
            if(p1.score.equals(p2.score)){
                return p1.name.compareTo(p2.name);
            } else return p1.score.compareTo(p2.score);
        });


    }



}
*/