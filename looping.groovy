#! /usr/bin/env groovy
// Looping
// while
// for
// return/break/continue

numbers = [1,2,3]
while(numbers) {
  println("Removed ${numbers.remove(0)}")
}

assert numbers == []

for (variable in 1..10) {
  println(variable)
}

Integer a = 1
while(true) {
  ++a
  break
}
assert a == 2

for(String s in 'a'..'z') {
  if(s == 'a') {
    continue
  }
  println(s)
  if(s > 'b') {
    break
  }
}
