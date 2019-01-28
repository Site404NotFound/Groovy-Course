if (true)       // Always true
  println("Value is True")

if (false)      // Never run
  println("Value is False")

if (!false)     // Always run
  println("Value is False")

String name = null       // null evaluates to false
if(name)
  println("Name has value")

name = "James"    // null evaluates to false
if(name)
  println("Name has value")

// loop through list and print elements
def list = [1,2,3,4]    // Create list and initailize
for(numb in list) {
  println(numb)
}

//closure
def list2 = [1,2,3,4]
list2.each {
  println(it)
}

//Learning about the switch operator
def myNumber = 10
if(myNumber == 1) {
  println("My number is 1")
}
if(myNumber == 2) {
  println("My Number is 2")
}

switch(myNumber) {
  case 1:
    println("Number is 1")
    break
  default:
    println("We hit the default case")
}
