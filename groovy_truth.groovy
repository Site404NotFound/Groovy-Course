#! /usr/bin/env groovy

if(true) {
  println(true)
}

assert true
assert !false

assert ('a' =~ /a/)
assert !('a' =~ /b/)


assert [1]
assert ![]

assert [1 : "one"]
assert ![:]

assert 'a'
assert !''
assert 1
assert 3.5
assert !0

assert new Object()
assert !null
