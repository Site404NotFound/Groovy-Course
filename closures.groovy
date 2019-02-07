#! /usr/bin/env groovy

import java.util.Random

// What are closures used for
// - Iterators
// - Callbacks
// - Higher-order functions
// - Specialized Control Structure
// - Builders
// - Resource Allocation
// - Threads
// - DSLs
// - Fluent Interfaces

Closure c = {}

println(c.class.name)
println(c instanceof Closure)

Closure sayHello = {
  name ->
    println("Hello, $name")
}

sayHello("James")

List nums = [1,4,7,4,30,2]
nums.each() {
  num ->
    println(num)
}
nums.each {
  num ->
    println(num)
}

// Closures are object & Last Param
def timesTen(num, closure) {
  closure(num * 10)
}

timesTen(10, {println it})
timesTen(2) {
  println it
}

10.times {
  println(it + 1)
}

Random rand = new Random( )

3.times {
  println(rand.nextInt())
}
