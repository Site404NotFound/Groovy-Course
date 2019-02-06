#! /usr/bin/env groovy

// Working with Strings in Groovy

// In Java
char c = 'c'
println(c.class)

String str = "This is a string"
println(str.class)

// In Groovy (Quotes don't matter, everything's a string)
def c2 = "c"
println(c2.class)

def str2 = 'This is a string'
println(str2.class)

// String Interpolation
String name = "Dan"
String msg = "Hello " + name + "..."
println(msg)

String msg2 = "Hello ${name}..."
println(msg2)

String msg3 = 'Hello ${name}...'
println(msg3)

String msg4 = "We can evaluate expressions here: ${1 + 1}"
println(msg4)

def aLargeMsg = """
A
Msg
goes
here and
keeps going ${2 + 2}
"""
println(aLargeMsg)


// Dollar Slashy
def folder = "C:\\groovy\\dan\\foo\\bar"
println(folder)
def folder2 = $/C:\groovy\dan\foo\bar/$     // Dollar Slashy makes it so you no longer need to break \'s
println(folder2)
