#! /usr/bin/env groovy

class Test {
  def hello(){
    println("Hi...this is a test")
  }
}

Test testing = new Test()
testing.hello()
testing = null
try {
  testing.hello()
} catch (Exception e) {
  println("Object is null")
  println(e.class.name)
  println(e.message)
}
