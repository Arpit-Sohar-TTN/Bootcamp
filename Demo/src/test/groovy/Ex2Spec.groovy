import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by arpit on 23/3/17.
 */
class Ex2Spec extends Specification {
    @Unroll
    def "Test the unique characters"(){
        new Ex2().uniqueCharacters(input).equals(expectedOutput)
        where:
        input                           |       expectedOutput
        "Hello"                         |       [('H' as char),('e' as char),('o' as char)]
        "abcbcddefgfh"                  |       [('a' as char),('e' as char),('g' as char),('h' as char)]
    }
}
