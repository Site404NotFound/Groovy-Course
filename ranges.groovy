#! /usr/bin/env groovy
for(int x = 1; x <= 10; ++x) {
  println(x)
}

for(int y = 10; y >= 1; --y) {
  println(y)
}


def letters = ['a', 'b', 'c']
for(int i = 0; i < letters.size(); ++i) {
  println(letters[i])
}

Range r = 1..10       // Double dots indicate that this is a range
println(r)
println(r.class.name)
println(r.from)
println(r.to)

assert (0..10).contains(0)
assert (0..10).contains(10)
assert !(0..<10).contains(10)

Date today = new Date()
Date oneWeekAway = today + 7

println(today)
println(oneWeekAway)

Range days = today..oneWeekAway
println(days)
println(days.class.name)

Range letter = 'a'..'z'
println(letter)
println(letter.class.name)
