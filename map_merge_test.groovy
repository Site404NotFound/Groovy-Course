#! /usr/bin/env groovy

Map map1 = [a: "String 1", b: "String 2", c: 1]
Map map2 = [a: "String 3", b: "String 4", c: 2, d:'a']
println(map1)
println(map2)
println(map1 << map2)
