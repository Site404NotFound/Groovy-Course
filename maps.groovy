#! /usr/bin/env groovy

LinkedHashMap map = [:]  // Empty map
println(map)
println(map.getClass().getName())

Map person = [first: "James", last: "Hippler", email: "hipplerj@gmail.com"]
println(person)
println(person.first)
println(person.last)
println(person.email)

person.twitter = "@hipplerj"

println(person)

String emailKey = "EmailAddress"
Map twitter = [username: "@hipplerj", (emailKey): "hipplerj@gmail.com"]
println(twitter)
println(person.sort())

for(entry in person) {
  println(entry)
}

for(key in person.keySet()) {
  println("$key: ${person[key]}")
}
