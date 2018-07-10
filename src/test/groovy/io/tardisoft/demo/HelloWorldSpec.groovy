package io.tardisoft.demo

import spock.lang.Specification


class HelloWorldSpec extends Specification {

    def "Create class and speak"() {
        expect:
        new HelloWorld().speak() == "Hello World"
    }
}
