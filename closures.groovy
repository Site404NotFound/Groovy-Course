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

def foo = {
  println(it)
}
foo("James")

def noparams = {
  ->
    println ("No params...")
}
noparams()


def hello_again = {
  String first, String last ->
    println("Hello, $first $last")
}
hello_again("James", "Hippler")

// Default values
def default_values = {
  String greet = "Howdy", String name ->
    println("$greet, $name")
}
default_values("James")

// Var-arg
Closure concat = {
  String... args ->
    args.join('')
}

println(concat("abc","def"))
println(concat("abc","def","123","456"))

Void someMethod(Closure c) {
  println("...")
  println(c.maximumNumberOfParameters)
  println(c.parameterTypes)
}

Closure someClosure = {
  int x, int y ->
    x + y
}

someMethod(someClosure)
