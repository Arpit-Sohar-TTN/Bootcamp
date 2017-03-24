import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by arpit on 23/3/17.
 */
class Ex4Spec extends Specification{
    @Unroll
    def "Calculating the percentages " (){
        new Ex4().findData(input).equals(expectedOutput)
            where:

            input                     |           expectedOutput
            "dfbjdbRDGFG%^&*&34545"   | ["LowerCase" : 6.0,"UpperCase" : 5.0,"SpecialChar" : 5.0,"Digits" : 5.0,
                                         "LowerCase %" : 28.571428571428573,
                                         "UpperCase %" : 23.80952380952381,
                                         "SpecialChar %" : 23.80952380952381,
                                         "Digits %" : 23.80952380952381]

    }

}
