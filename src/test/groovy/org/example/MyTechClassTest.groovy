package org.example
import spock.lang.Specification
class MyTechClassTest extends Specification{
    def "my first test"(){
        expect:
        MyTechClass.testMethod(input) == expectedOutput

        where: "provided input, results in expected output"
        input | expectedOutput
        "" | ""
        "hello" | "hello"
    }
}
