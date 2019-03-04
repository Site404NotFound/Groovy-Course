#! /usr/bin/env groovy

// [Exercise] Control Structures
// Section 7, Lecture 64
// Control Structures
//
// We used a class similar to this in a previous exercise but I think it's a short and sweet example of what we need to review in this exercise.
// - Create An Account Class
//   - create a property of type BigDecimal called balance with an initial value of 0.0
// - Create a method called deposit
//   - use a conditional structure (if would work great here) to check if the amount being passed is less than zero. If it is we should catch this case because we don't want to deposit negative numbers. In this case throw an exception.
//   - Create another method called deposit that takes a list of amounts
//     - use a for loop to loop over these amounts and call deposit
//
// Now that we have our class let's test it out. You can do all of this in the same file (just don't create a file called Account.groovy)
// - Create an instance of the account class
// - deposit a valid amount
// - deposit an invalid amount (what happens?)
// - try / catch on invalid amounts
// - deposit a list of amounts.

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
