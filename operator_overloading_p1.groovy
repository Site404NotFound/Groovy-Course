#! /usr/bin/env groovy

def a = 1
def b = 2

println(a + b)
println(a.plus(b))      // Behind the scenes the "+" is calling the plus() function

def s1 = "Hello"
def s2 = ", World!"

println(s1 + s2)
println(s1.plus(s2))    // Same for strings
