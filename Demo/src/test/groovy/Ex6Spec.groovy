import spock.lang.Specification

/**
 * Created by arpit on 23/3/17.
 */
class Ex6Spec extends Specification{
    def "Common Elements"() {
        new Ex6().getSingleElements(input).equals(expectedOutput)
        where:
        input               |            expectedOutput
        [1,2,3,4,1,5]       |               [2,3,4,5]
        [14,14,23,34,45,78] |             [23,34,45,78]

    }
}
