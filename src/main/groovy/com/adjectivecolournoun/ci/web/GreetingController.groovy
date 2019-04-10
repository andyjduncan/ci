package com.adjectivecolournoun.ci.web

import com.adjectivecolournoun.ci.Greeter
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    private final greeter = new Greeter()

    @RequestMapping(path = '/greet', produces = 'application/json')
    Map greet() {
        def who = System.getenv('NAME_TO_GREET')

        [
                greeting: greeter.greet(who)
        ]
    }
}
