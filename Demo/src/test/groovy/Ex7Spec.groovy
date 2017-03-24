import spock.lang.Specification

/**
 * Created by arpit on 21/3/17.
 */
class Ex7Spec extends Specification{
    SpecialStack ex7 ;
    void setup() {
        ex7 = new SpecialStack(2);
    }

    void push() {
        given:
        char item = 'a';

        when:
        boolean res = ex7.push(item);

        then:
        res == true;
    }
}
