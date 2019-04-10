package com.adjectivecolournoun.ci

class Greeter {
    String greet(String name) {
        "Hello, ${name ?: 'World'}!"
    }
}
