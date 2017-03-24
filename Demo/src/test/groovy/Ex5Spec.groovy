import spock.lang.Specification

/**
 * Created by arpit on 23/3/17.
 */
class Ex5Spec extends Specification{
    def "Testing Common elements Question"(){
        new Ex5().getCommon(input1,input2).equals(expectedOutput)
        where:
        input1       |input2          |       expectedOutput
       [1,2,4,5,7] |    [2,3,4,5,7]       |       [2,4,5,7]
        [2,2,4,5,7] |    [2,3,14,6,7]       |       [2,7]
        [1,5,7]     |    [2,3,4,5,7]        |       [5,7]

    }
}
