package com.adjectivecolournoun.ci

import spock.lang.Specification

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic

class TestGreetings extends Specification {

    void 'greets everyone by default'() {
        given:
        def greeter = new Greeter()

        when:
        def greeting = greeter.greet()

        then:
        greeting == 'Hello, World!'
    }

    void 'greets people by name'() {
        given:
        def name = randomAlphabetic(10)
        def greeter = new Greeter()

        when:
        def greeting = greeter.greet(name)

        then:
        greeting == 'Hello, ' + name + '!'
    }
}