#! /usr/bin/env groovy

def var1 = 1
var2 = 1
Float var3 = 1

println(var1.class)
println(var2.class)
println(var3.class)

try {
  println("Changing variable from Integer to String")
  var1 = "I am now a string"
  println(var1.class.name)
} catch (Exception err) {
  println("No Joy. Unable to change variable.")
  println(var1.class.name)
  println(err)
}
try {
  println("Changing variable from Float to String")
  var2 = "I am now a string"
  println(var2.class.name)
} catch (Exception err) {
  println("No Joy. Unable to change variable.")
  println(var2.class.name)
  println(err)
}
try {
  println("Changing variable from Float to String")
  var3 = "I am now a string"
  println(var3.class.name)
} catch (Exception err) {
  println("No Joy. Unable to change variable.")
  println(var3.class.name)
  println(err)
}

this_is_a_class()

def this_is_a_class(){
  try{
    println("Is the def variable global?")
    print("$var2\n")
    println("YES, it is!")
  } catch (Exception err) {
    println("....No it is not")
    println(err)
  }
}
