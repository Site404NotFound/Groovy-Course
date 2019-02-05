#! /usr/bin/env groovy

decimal1 = 5.50D
def decimal2 = 5.50D
println(decimal1.class.name)
println(decimal2.class.name)

/*******************************************************************************
 * CONVERTING DATA TYPES:
 ******************************************************************************/

// Explicit (Type Casting)
def myFloat = (float) 1.0             // Forced to float instead of BigDecimal using casting
println(myFloat.class.name)

// Implicit (Coercion)


/*******************************************************************************
 * Rules for mathematics (+. -, *)
 ******************************************************************************/

 // If either operand is a float or a double the result is a double
 // In Java if only floats are involved the result is a float
 Float f = 5.25
 Double d = 10.50

 def result = d / f
 println(result)
 println(result.class.name)

 Float a = 10.75
 Float b = 53.75

 def result2 = b / a
 println(result)
 println(result2.class.name)

// It either operand is a big decimal
def x = 34.5        // I'm a BigDecimal
def y = 15
def bigResult = x / y
println(bigResult)
println(bigResult.class.name)

// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a long
// If either operand is an Integer the result is an Integer

// Double Devision
println(5.0d - 4.1d)
println(5 - 4.1)

// Integer Devision
def intDiv = 1 / 2
println(intDiv)       // This is much different than Java where we would get a 0
println(intDiv.getClass().getName())
println(1.intdiv(2))

/*******************************************************************************
 * GDK Methods
 ******************************************************************************/

assert 2 == 2.5.toInteger()     // Conversion
assert 2 == 2.5 as Integer      // Enforced Coercion
assert 2 == (int) 2.5           // Casting

assert "5.50".isNumber()
assert 5 == "5".toInteger()

/*******************************************************************************
 * times | upto | downto | step
 ******************************************************************************/

// Prints a dash 20 times
20.times {
  print("-")
}
println()

// Counts from 1 UP TO 10
1.upto(10) {
  num ->
    println(num)
}

// Counts from 10 DOWN TO 1
10.downto(1) {
  num ->
    println(num)
}

// Counts from 0 to 1 but in increments of 0.1
0.step(1, 0.1) {
  num ->
    println(num)
}
