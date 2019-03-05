#! /usr/bin/env groovy

class Account {
  BigDecimal balance = 0.0
  def deposit(BigDecimal amount) {
    if(amount < 0) {
      throw new Exception("Deposit amount must be greater than 0")
    }
    balance += amount
  }
  def deposit(List amounts) {
    for(amount in amounts) {
      println("depositing \$$amount to checking...")
      deposit(amount)
    }
  }
}

class User {
  private String first_name
  private String last_name
  def set_first_name(String fname) {
    first_name = fname
  }
  def set_last_name(String lname) {
    last_name = lname
  }
  def get_name(){
    println("$last_name, $first_name")
  }
}

Account checking = new Account()
checking.deposit(10)
println(checking.balance)

try {
  checking.deposit(-1)
} catch(Exception e) {
  println(e.message)
}
println(checking.balance)
checking.deposit([1,5,10,20,50])
println(checking.balance)

User username = new User()
username.set_first_name("James")
username.set_last_name("Hippler")
username.get_name()

username.first_name = "Jake"
username.last_name = "Michaels"
username.get_name()
