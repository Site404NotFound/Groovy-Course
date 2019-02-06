#! /usr/bin/env groovy

def numbs = []
println(numbs)
println(numbs.class.name)

List numbs2 = [1,2,3,4,5,6,7,8,9,0]
println(numbs2)
println(numbs2.class.name)

List numbs3 = [1,2,3,4,5,6,7,8,9,0] as LinkedList
println(numbs3)
println(numbs3.class.name)


// add | remove | get | clear
List test_numbs = [0,1,2,3,4,5,6,7,8,9]
test_numbs.push(99) // Add to end
test_numbs.putAt(0, 77) // Insert at index
test_numbs[0] = 100 // Reassign/Replace at index
println(test_numbs + [3,4,6]) // Extend the array at the end.  NOT A PERMANENT ADDITION
println(test_numbs)
test_numbs << 66 // Permanently adds items to the end of the list
println(test_numbs)
// Output:
// 100, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 66

test_numbs.pop() // Remove the first element from the list
println(test_numbs)
test_numbs.removeAt(5) // Remove at a specific element in the list
println(test_numbs)

println(test_numbs - 7)   // Removes ALL occurrences of a specific number.  TEMPORARY CHANGE
println(test_numbs)


println(test_numbs[4])        // Print an item at a specific location
println(test_numbs.getAt(4))  // Print an item at a specific location

println(test_numbs.getAt(0..3)) //Print items in a specific range of a list


for(x in test_numbs) {        // Loop through each item in the list
  println(x)
}


test_numbs.clear()            // Clears a list and sets to empty
println(test_numbs)
test_numbs.push(100)
println(test_numbs)
test_numbs = []               // Clears a list and sets to empty
println(test_numbs)


nested_lists = [3,4,5]
nested_lists << [1,2]
nested_lists << [3,4,5]
nested_lists << [1,2]
println(nested_lists)
println(nested_lists.flatten())     // combines nested lists as elements into the parent list
println(nested_lists.unique())      // Prints only unique items in the list

def set_list = [1,3,3,4,4,5,6,7,8,9,9,5,1,3,4,5] as Set     // Use Set to display only unique numbers (Sets DO NOT contain duplicates)
println(set_list)
println(set_list.class.name)


def sorted_set_list = [1,3,3,4,4,5,6,7,8,9,9,5,1,3,4,5] as SortedSet     // Use Set to display only unique numbers in Sorted order (Sets DO NOT contain duplicates)
println(set_list)
println(set_list.class.name)
