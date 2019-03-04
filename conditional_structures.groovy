#! /usr/bin/env groovy

if(true)
  println("True")

if(true) {
  println("True")
}

int age = 35
if(age >= 35) {
  println("can run for president")
}


if(true) {
  println("true")
} else {
  println("false")
}

int your_age = 18
if(your_age >= 21) {
  println("Buy Beer")
} else {
  println("No beer for you")
}

your_age = 27
if(your_age >= 21 && your_age < 35) {
  println("Buy Beer")
} else if (your_age >= 35) {
  println("Run for president")
} else {
  println("No beer for you")
}

// ternary operator
String name = "Dan"
def isitdan = (name.toUpperCase() == 'DAN' ? 'YES' : 'NO')
println(isitdan)

def msg
def output = (msg != null) ? msg: 'Default message....'
def elvisOutput = msg ?: 'Default message....'

println(msg)
println(output)
println(elvisOutput)

int num = 5
switch(num) {
  case 1:
    println("1")
    break
  case 2:
    println("2")
    break
  case 3:
    println("3")
    break
  case Integer:
    println("Number is integer")
    break
  case 4..10:
    println("Number is in range 4..10")
    break
  default:
    println("Default...")
}

def validAges = 18..35
def someAge = 19
println someAge in validAges
