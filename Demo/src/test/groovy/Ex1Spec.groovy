import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by arpit on 23/3/17.
 */
class Ex1Spec extends Specification{
    @Unroll
    def "Testing the spring replacement" (){
        Ex1.change(input).equals(expectedOutput)
        where:
        input                    |       expectedOutput
        "Hello I am string"      |      "Hi I am string"
        "Hello I am Arpit"       |      "Hi I am Arpit"

    }
}
