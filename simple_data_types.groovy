#! /usr/bin/env groovy

// Simple Data Types:
// byte = 8-bit signed integer
// short = 16-bit signed integer
// int = 32-bit signed integer
// long = 64-bit signed integer
// float = Single-precision (32-bit) floating-point value
// double = Double-precision (64-bit) floating-point value
// char = 16-bit Unicode character
// boolean = Boolean Value (True or False)

// Simple Data Types

// byte:
// Min Value: -128
// Max Value: 127
byte b = 10
println("byte: $b")
println(b.getClass())
println("Max Byte Size: $Byte.MAX_VALUE")
println("Min Byte Size: $Byte.MIN_VALUE")

// short:
// Min Value: -32, 768
// Max Value: 32, 767
short s = 10000
println("short: $s")
println(s.getClass())
println("Max Short Size: $Short.MAX_VALUE")
println("Min Short Size: $Short.MIN_VALUE")

// int:
// Min Value: -2,147,483,648 (-2^31)
// Max Value: 2,147,483,647 (2^31 -1)
int i = 2_147_483_647  // underscores are allowd and signify commas to make large numbers more readable
println("int: $i")
println(i.getClass())
println("Max Integer Size: $Integer.MAX_VALUE")
println("Min Integer Size: $Integer.MIN_VALUE")

// long:
// Min Value: -9,223,372,036,854,775,808 (2^63)
// Max Value: 9,223,372,036,845,775,807 (2^63 -1)
long l1 = -9223372036854775808
long l2 = 100L
println("long 1: $l1")
println("long 2: $l2")
println(l1.getClass())
println(l2.getClass())
println("Max Long Size: $Long.MAX_VALUE")
println("Min Long Size: $Long.MIN_VALUE")

// float: 32-bit IEEE floating points (single precision)
// Min Value: 1.4E-45
// Max Value: 3.4028235E38
float f1 = 1.4E-45
float f2 = 1.25F
println("float 1: $f1")
println("float 2: $f2")
println(f1.getClass())
println(f2.getClass())
println("Max Float Size: $Float.MAX_VALUE")
println("Min Float Size: $Float.MIN_VALUE")

// double: 64-bit IEEE floating points (double precision)
// Min Value: 4.9E-324
// Max Value: 1.7976931348623157E308

double d1 = 1.7976931348623157E308
double d2 = 1.25
println("double 1: $d1")
println("double 2: $d2")
println(d1.getClass())
println(d2.getClass())
println("Max Double Size: $Double.MAX_VALUE")
println("Min Double Size: $Double.MIN_VALUE")

// char: single character or unicode
char c = 'c'
println("char: $c")
println(c.getClass())
println("Max Char Size: Any character or Unicode")

// boolean: holds True or False
boolean bool1 = true
boolean bool2 = false
println("bool 1: $bool1")
println("bool 2: $bool2")
println(bool1.getClass())
println(bool2.getClass())
println("Max Boolean Size: True or False Values only")
