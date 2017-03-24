import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by arpit on 21/3/17.
 */
class Ex3Spec extends Specification{

    /*Ex3 ex3;

    void get() {
        given :
        String str = "aabvv"

        when:
        HashMap<Character,Integer> hs= Ex3.get(str);

        then:
        hs == [a:2, b:1, v:2];
    }
}*/
@Unroll
def "Test the percentage of every type of input in the string"(){
    expect:
    Ex3.get(input).equals(expectedOutput)
    where:
    input                                        | expectedOutput
    "aabbv"                                      | [('a'as char):2 , ('b'as char):2 , ('v'as char):1] as HashMap<Character, Integer>
    "asddhdsss"                                  | [('a' as char):1, ('s' as char):4, ('d' as char):3, ('h' as char):1] as HashMap<Character, Integer>
}
}
