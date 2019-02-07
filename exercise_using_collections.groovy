#! /usr/bin/env groovy

/*******************************************************************************
  RANGES:
 If you are new to Java or Groovy the idea of an Enum might be new. An Enum is
 a collection of constant values. We can use this collection of constants to
 create ranges. I want you to do some reading up on enum's and create an enum
 for days of the week. ex Sunday, Monday, etc...

 [x] Create a range from that enum
 [x] Print the size of the Range
 [x] Use the contains method to see if Wednesday is in that Range
 [x] Print the from element of this range
 [x] Print the to element of this range

 LISTS:
 [x] Create a list days (Sun - Sat)
 [x] Print out the list
 [x] Print the size of the list
 [x] Remove Saturday from the list
 [x] Add Saturday back by appending it to the list
 [x] Print out the Wednesday using its index

 MAPS:
 [x] Create a map of days of the week
    [x] 1: Sunday, 2:Monday, etc...
 [x] Print out the map
 [x] Print out the class name of the map
 [x] Print the size of the map
 [x] Is there a method that would easily print out all of the days (values)?
    [x] Without closures you may have to look at the Java API for LinkedHashMap
 ******************************************************************************/

// RANGES
// An Enum is a collection of constant values.  Using this collection of constants to create ranges
enum Days {
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// Create a range from the Days enum above
Range day_range = Days.SUNDAY..Days.SATURDAY

// Loop the range and print all the
for(day in day_range) {
  println(day)
}

// Print the size of the Range
println(day_range.size())

// Use the contains method to see if Wednesday is in that Range
println(day_range.contains(Days.WEDNESDAY))         // True

// Print the from element of this range
println(day_range.from)
// Print the to element of this range
println(day_range.to)

//  LISTS
// Create a list days (Sun - Sat)
List day_list = [ "Sunday",
                  "Monday",
                  "Tuesday",
                  "Wednesday",
                  "Thursday",
                  "Friday",
                  "Saturday" ]

// Print out the list
println(day_list)

for(day in day_list) {
  println(day)
}
// Print the size of the list
println(day_list.size())

// Remove Saturday from the list
println(day_list.removeLast())
println(day_list)

// Add Saturday back by appending it to the list
day_list << "Saturday"
println(day_list)

// Print out the Wednesday using its index
println(day_list[3])

// MAPS
// Create a map of days of the week
//  1: Sunday, 2:Monday, etc...
Map day_map = [ 1: "Sunday",
                2: "Monday",
                3: "Tuesday",
                4: "Wednesday",
                5: "Thursday",
                6: "Friday",
                7: "Saturday" ]

// Print out the map
println(day_map)
day_map.each() {
  key, val ->
    println("Day $key = $val")
}

// Print out the class name of the map
println(day_map.getClass().getName())

// Print the size of the map
println(day_map.size())

// Is there a method that would easily print out all of the days (values)?
println(day_map.values())

//  Without closures you may have to look at the Java API for LinkedHashMap
