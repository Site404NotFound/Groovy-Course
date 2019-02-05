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
long l = -9223372036854775808
println("long: $l")
println(l.getClass())
println("Max Long Size: $Long.MAX_VALUE")
println("Min Long Size: $Long.MIN_VALUE")

// float: 32-bit IEEE floating points (single precision)
// Min Value: 1.4E-45
// Max Value: 3.4028235E38
float f = 1.4E-45
println("float: $f")
println(f.getClass())
println("Max Float Size: $Float.MAX_VALUE")
println("Min Float Size: $Float.MIN_VALUE")

// double: 64-bit IEEE floating points (double precision)
// Min Value: 4.9E-324
// Max Value: 1.7976931348623157E308

double d = 1.7976931348623157E308
println("double: $d")
println(d.getClass())
println("Max Double Size: $Double.MAX_VALUE")
println("Min Double Size: $Double.MIN_VALUE")
