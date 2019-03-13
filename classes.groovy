#! /usr/bin/env groovy

class Person {
	String firstName, lastName
	def dob
	// private | protected | public
	protected String f1, f2 ,f3
	private Date createdOn = new Date()
	
	static welcomeMsg = 'HELLO'
	public static final String WELCOME_MSG = 'Constant Hello'
	def foo() {
		String msg = 'Hello from foo'
	}
	 
}

println(Person.welcomeMsg)
println(Person.WELCOME_MSG)
