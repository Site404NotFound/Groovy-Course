#! /usr/bin/env groovy

class Person {
	String firstName, lastName // Able to declare multiple fields on the same line
	def dob                     // Declared without a type (Type is determined later)
	// private | protected | public
	protected String f1, f2 ,f3
	private Date createdOn = new Date()

	static welcomeMsg = 'HELLO'
	public static final String WELCOME_MSG = 'Constant Hello' // Constant values are generally written in all CAPS
	def foo() {
		String msg = 'Hello from foo'
        println(msg)
	}
}

println(Person.welcomeMsg)
println(Person.WELCOME_MSG)

Person person = new Person()
person.foo()
