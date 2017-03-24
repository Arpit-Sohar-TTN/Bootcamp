import spock.lang.Specification

/**
 * Created by arpit on 21/3/17.
 */
class DemoSpec extends Specification {
    Demo sample;


    void setup() {
        sample = new Demo();
    }
    void welcome() {
        given:
        String firstName = "Arpit";
        String lastName = "Sohar" ;

        when:
        String greet = sample.welcome(firstName,lastName);

        then:
        greet == "Welcome Arpit Sohar to TTN ";
    }
}

