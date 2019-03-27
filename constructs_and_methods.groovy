#! /usr/bin/env groovy

@groovy.transform.ToString
class Person {
    String first, last

    // Constructor
    Person(String fullname) {
        List parts = fullName.split(' ')
        first = parts[0]
        last = parts[1]
}

// Person p = new Person(first: 'James', last: 'Hippler')
Person p = new Person("James Hippler")
println(p)
