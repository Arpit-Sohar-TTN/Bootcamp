import spock.lang.Specification

/**
 * Created by arpit on 23/3/17.
 */
class Ex8Spec extends Specification{
    def "Conversion of String"(){
        new Ex8().convert(input).equals(expectedOutput)
        where:
        input                |               expectedOutput
    "dfjbfjbfjgjkfg"         |               "gfkj"
        "dffkftiyotoyiti"    |            "itiyd"

    }
}
