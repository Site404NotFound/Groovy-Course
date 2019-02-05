#! /usr/bin/env groovy

// Each primitive data type in Java has a corresponding wrapper class
// In Java there are 17 data types (8 primitive, 8 corresponding wrapper classes, and string)
byte b = 10
println(b.getClass().getName())

short s = 10000
println(s.class.name)

float f = 1.25
println(f.class.name)

println(3.class.name)
println('a'.class.name)                                                 // java.lang.String
println(1.25.class.name)                                                // java.math.BigDecimal
println(1341234123412341234123412341234123412431243124.class.name)      // java.math.BigInteger

// Optional Typing with def
// Def in groovy means that we are declaring a variable with no declared data type (let groovy figure it out)
def x = 10
println(x.class.name)
println("Variable x is an integer with the value $x")

// When declared without type, the variable can change type on the fly
x = "Dan"                     // Automatically change datatype of x from int to string
println(x.class.name)
println("Variable x is now a string with the value $x")

// If we know the type of our data, and that it will not change.  We should declare a type and avoid optional typing
int y = 10
Integer z = 10
println("Type of y = ${y.class.name}")
println("Type of z = ${z.class.name}")

// If we declare a data type, it cannot be changed/updated later like with optional typing
try {
  y = "I am a string"
}
catch (Exception err){
  println("ERROR: Cannot convert int to string in declared data types")
}

try {
  z = "I am now a STRING"
}
catch (Exception err) {
  println("ERROR: Cannot convert Integer to string in declared data types")
}
